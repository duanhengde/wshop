package com.model;

/**
 * TLiuyan generated by MyEclipse Persistence Tools
 */

public class TLiuyan implements java.io.Serializable {

	// Fields

	private Integer liuyanId;

	private String liuyanTitle;

	private String liuyanContent;

	private String liuyanDate;

	private String liuyanUser;
	private String liuyanReplay;

	// Constructors

	public String getLiuyanReplay() {
		return liuyanReplay;
	}

	public void setLiuyanReplay(String liuyanReplay) {
		this.liuyanReplay = liuyanReplay;
	}
	// Constructors

	/** default constructor */
	public TLiuyan() {
	}

	/** full constructor */
	public TLiuyan(String liuyanTitle, String liuyanContent) {
		this.liuyanTitle = liuyanTitle;
		this.liuyanContent = liuyanContent;
	}

	// Property accessors

	public Integer getLiuyanId() {
		return this.liuyanId;
	}

	public void setLiuyanId(Integer liuyanId) {
		this.liuyanId = liuyanId;
	}

	public String getLiuyanTitle() {
		return this.liuyanTitle;
	}

	public String getLiuyanUser() {
		return liuyanUser;
	}

	public void setLiuyanUser(String liuyanUser) {
		this.liuyanUser = liuyanUser;
	}

	public String getLiuyanDate() {
		return liuyanDate;
	}

	public void setLiuyanDate(String liuyanDate) {
		this.liuyanDate = liuyanDate;
	}

	public void setLiuyanTitle(String liuyanTitle) {
		this.liuyanTitle = liuyanTitle;
	}

	public String getLiuyanContent() {
		return this.liuyanContent;
	}

	public void setLiuyanContent(String liuyanContent) {
		this.liuyanContent = liuyanContent;
	}

}