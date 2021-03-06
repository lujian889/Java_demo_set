/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cxf.systest.ws.policy;

import java.util.logging.Logger;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBusFactory;
import org.apache.cxf.common.logging.LogUtils;
import org.apache.cxf.greeter_control.BasicGreeterService;
import org.apache.cxf.greeter_control.Greeter;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.testutil.common.AbstractBusClientServerTestBase;
import org.apache.cxf.testutil.common.AbstractBusTestServerBase;

import org.junit.BeforeClass;
import org.junit.Test;

public class NestedAddressingPolicyTest extends AbstractBusClientServerTestBase {
    public static final String PORT = allocatePort(Server.class);

    private static final Logger LOG = LogUtils.getLogger(HTTPServerPolicyTest.class);

    public static class Server extends AbstractBusTestServerBase {
   
        protected void run()  {            
            SpringBusFactory bf = new SpringBusFactory();
            Bus bus = bf.createBus("org/apache/cxf/systest/ws/policy/http-addr-server.xml");
            
            GreeterImpl implementor = new GreeterImpl();
            implementor.setThrowAlways(true);
            Endpoint.publish("http://localhost:" + PORT + "/SoapContext/GreeterPort", implementor);

            LOG.info("Published greeter endpoint."); 
            
            LoggingInInterceptor in = new LoggingInInterceptor();
            LoggingOutInterceptor out = new LoggingOutInterceptor();
            
            bus.getInInterceptors().add(in);
            bus.getOutInterceptors().add(out);
            bus.getOutFaultInterceptors().add(out);
        }
        

        public static void main(String[] args) {
            try { 
                Server s = new Server(); 
                s.start();
            } catch (Exception ex) {
                ex.printStackTrace();
                System.exit(-1);
            } finally { 
                System.out.println("done!");
            }
        }
    }    

    @BeforeClass
    public static void startServers() throws Exception {
        assertTrue("server did not launch correctly", launchServer(Server.class));
    }
         
    @Test
    public void greetMe() throws Exception {        
        
        // use a plain client
        
        SpringBusFactory bf = new SpringBusFactory();
        Bus bus = bf.createBus();
        
        BasicGreeterService gs = new BasicGreeterService();
        final Greeter greeter = gs.getGreeterPort();
        
        updateAddressPort(greeter, PORT);
        LoggingInInterceptor in = new LoggingInInterceptor();
        LoggingOutInterceptor out = new LoggingOutInterceptor();
        
        bus.getInInterceptors().add(in);
        bus.getOutInterceptors().add(out);
        

        try {
            greeter.greetMe("mytest");
            fail("SoapFault expected");
        } catch (Exception e) {
            assertTrue("Addressing Header Required message is expected",
                       e.getMessage().contains("Addressing Property is not present"));
        }

    }
}