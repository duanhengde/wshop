package com.model;

import java.util.Date;

/**
 * TKeyword entity. @author MyEclipse Persistence Tools
 */

public class TKeyword implements java.io.Serializable {

	// Fields

	private Integer keywordId;

	private String keywordName;
	private Integer keywordCount;
	private Integer keywordType;
	// Constructors

	/** default constructor */
	public TKeyword() {
	}

	// Property accessors

	public Integer getKeywordId() {
		return this.keywordId;
	}

	public void setKeywordId(Integer keywordId) {
		this.keywordId = keywordId;
	}

	public String getKeywordName() {
		return keywordName;
	}

	public void setKeywordName(String keywordName) {
		this.keywordName = keywordName;
	}

	public Integer getKeywordCount() {
		return keywordCount;
	}

	public void setKeywordCount(Integer keywordCount) {
		this.keywordCount = keywordCount;
	}

	public Integer getKeywordType() {
		return keywordType;
	}

	public void setKeywordType(Integer keywordType) {
		this.keywordType = keywordType;
	}

}