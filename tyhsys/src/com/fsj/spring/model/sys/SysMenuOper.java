package com.fsj.spring.model.sys;
// default package

import java.util.Date;

/**
 * SysMenuOper generated by MyEclipse Persistence Tools
 */

public class SysMenuOper implements java.io.Serializable {

	// Fields

	private Long id;

	private String smoName;

	private String smoOperation;

	//private String smoMenuId;
	
	private SysMenu sysMenu;

	private String crtC;

	private Date crtDate;

	private String smoValid;

	// Constructors

	/** default constructor */
	public SysMenuOper() {
	}

	/** minimal constructor */
	public SysMenuOper(Long id) {
		this.id = id;
	}

	/** full constructor */
	public SysMenuOper(Long id, String smoName, String smoOperation, SysMenu sysMenu, String crtC, Date crtDate, String smoValid) {
		this.id = id;
		this.smoName = smoName;
		this.smoOperation = smoOperation;
		this.sysMenu = sysMenu;
		this.crtC = crtC;
		this.crtDate = crtDate;
		this.smoValid = smoValid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSmoName() {
		return this.smoName;
	}

	public void setSmoName(String smoName) {
		this.smoName = smoName;
	}

	public String getSmoOperation() {
		return this.smoOperation;
	}

	public void setSmoOperation(String smoOperation) {
		this.smoOperation = smoOperation;
	}

	public SysMenu getSysMenu() {
		return sysMenu;
	}

	public void setSysMenu(SysMenu sysMenu) {
		this.sysMenu = sysMenu;
	}

	public String getCrtC() {
		return this.crtC;
	}

	public void setCrtC(String crtC) {
		this.crtC = crtC;
	}

	public Date getCrtDate() {
		return this.crtDate;
	}

	public void setCrtDate(Date crtDate) {
		this.crtDate = crtDate;
	}

	public String getSmoValid() {
		return this.smoValid;
	}

	public void setSmoValid(String smoValid) {
		this.smoValid = smoValid;
	}

}