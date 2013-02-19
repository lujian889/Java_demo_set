package com.fsj.spring.model.person;
// default package

import java.util.Date;

/**
 * PersonInfo generated by MyEclipse Persistence Tools
 */

public class PersonInfo implements java.io.Serializable {

	// Fields

	private Long id;

	private String piCode;

	private String piName;

	private String piPhone;

	private String piMobile;

	private String piQq;

	private String piEmail;

	private String piIdcard;

	private String piSex;

	private Date piJoinDate;

	private Date piBirthDate;

	private String piDegree;

	private Long piType;

	private String piNation;

	private String piAddress;

	private String piMemo;

	private String piSup;

	private Long piOrg;

	private String piUser;

	private String crtC;

	private Date crtDate;

	// Constructors

	/** default constructor */
	public PersonInfo() {
	}

	/** minimal constructor */
	public PersonInfo(Long id) {
		this.id = id;
	}

	/** full constructor */
	public PersonInfo(Long id, String piCode, String piName, String piPhone, String piMobile, String piQq, String piEmail, String piIdcard, String piSex, Date piJoinDate, Date piBirthDate,
			String piDegree, Long piType, String piNation, String piAddress, String piMemo, String piSup, Long piOrg, String piUser, String crtC, Date crtDate) {
		this.id = id;
		this.piCode = piCode;
		this.piName = piName;
		this.piPhone = piPhone;
		this.piMobile = piMobile;
		this.piQq = piQq;
		this.piEmail = piEmail;
		this.piIdcard = piIdcard;
		this.piSex = piSex;
		this.piJoinDate = piJoinDate;
		this.piBirthDate = piBirthDate;
		this.piDegree = piDegree;
		this.piType = piType;
		this.piNation = piNation;
		this.piAddress = piAddress;
		this.piMemo = piMemo;
		this.piSup = piSup;
		this.piOrg = piOrg;
		this.piUser = piUser;
		this.crtC = crtC;
		this.crtDate = crtDate;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPiCode() {
		return this.piCode;
	}

	public void setPiCode(String piCode) {
		this.piCode = piCode;
	}

	public String getPiName() {
		return this.piName;
	}

	public void setPiName(String piName) {
		this.piName = piName;
	}

	public String getPiPhone() {
		return this.piPhone;
	}

	public void setPiPhone(String piPhone) {
		this.piPhone = piPhone;
	}

	public String getPiMobile() {
		return this.piMobile;
	}

	public void setPiMobile(String piMobile) {
		this.piMobile = piMobile;
	}

	public String getPiQq() {
		return this.piQq;
	}

	public void setPiQq(String piQq) {
		this.piQq = piQq;
	}

	public String getPiEmail() {
		return this.piEmail;
	}

	public void setPiEmail(String piEmail) {
		this.piEmail = piEmail;
	}

	public String getPiIdcard() {
		return this.piIdcard;
	}

	public void setPiIdcard(String piIdcard) {
		this.piIdcard = piIdcard;
	}

	public String getPiSex() {
		return this.piSex;
	}

	public void setPiSex(String piSex) {
		this.piSex = piSex;
	}

	public Date getPiJoinDate() {
		return this.piJoinDate;
	}

	public void setPiJoinDate(Date piJoinDate) {
		this.piJoinDate = piJoinDate;
	}

	public Date getPiBirthDate() {
		return this.piBirthDate;
	}

	public void setPiBirthDate(Date piBirthDate) {
		this.piBirthDate = piBirthDate;
	}

	public String getPiDegree() {
		return this.piDegree;
	}

	public void setPiDegree(String piDegree) {
		this.piDegree = piDegree;
	}

	public Long getPiType() {
		return this.piType;
	}

	public void setPiType(Long piType) {
		this.piType = piType;
	}

	public String getPiNation() {
		return this.piNation;
	}

	public void setPiNation(String piNation) {
		this.piNation = piNation;
	}

	public String getPiAddress() {
		return this.piAddress;
	}

	public void setPiAddress(String piAddress) {
		this.piAddress = piAddress;
	}

	public String getPiMemo() {
		return this.piMemo;
	}

	public void setPiMemo(String piMemo) {
		this.piMemo = piMemo;
	}

	public String getPiSup() {
		return this.piSup;
	}

	public void setPiSup(String piSup) {
		this.piSup = piSup;
	}

	public Long getPiOrg() {
		return this.piOrg;
	}

	public void setPiOrg(Long piOrg) {
		this.piOrg = piOrg;
	}

	public String getPiUser() {
		return this.piUser;
	}

	public void setPiUser(String piUser) {
		this.piUser = piUser;
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

}