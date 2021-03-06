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

package org.apache.cxf.jaxrs.ext.form;

import java.io.ByteArrayOutputStream;

import javax.ws.rs.core.MultivaluedMap;

import org.apache.cxf.jaxrs.impl.MetadataMap;
import org.apache.cxf.jaxrs.utils.FormUtils;

/**
 * Simple MultivaluedMap wrapper 
 *
 */
public class Form {
    private MultivaluedMap<String, String> map = 
        new MetadataMap<String, String>();
    
    public Form() {
        
    }
    
    public Form(MultivaluedMap<String, String> map) {
        this.map = map;
    }
    
    public Form set(String name, Object value) {
        
        FormUtils.addPropertyToForm(map, name, value);
        return this;
    }
    
    public MultivaluedMap<String, String> getData() {
        return map;
    }
    
    public String toString() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            FormUtils.writeMapToOutputStream(map, bos, "UTF-8", false);
            return bos.toString("UTF-8");
        } catch (Exception ex) {
            // will not happen
        }
        return "";
    }
}
