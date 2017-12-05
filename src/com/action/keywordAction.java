package com.action;

import com.dao.TGoodsDAO;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.dao.TKeywordDAO;
import com.dao.TUserDAO;
import com.model.TKeyword;
import com.model.TUser;

public class keywordAction extends ActionSupport {
	private int keywordId;

	private String keywordName;

	private int keywordType;

	private String message;
	private String path;

	private TKeywordDAO keywordDAO;

	public String keywordAll() {

		Map request = (Map) ServletActionContext.getContext().get("request");

		String sql = "from TKeyword where  keywordType=1  order by keywordCount desc";
		List keywordList = keywordDAO.getHibernateTemplate().find(sql);
		if (keywordList.size() > 6) {
			keywordList = keywordList.subList(0, 6);
		}
		request.put("keywordList", keywordList);
		return ActionSupport.SUCCESS;
	}

	public String keywordAll2() {

		Map request = (Map) ServletActionContext.getContext().get("request");

		String sql = "from TKeyword where  keywordType=2  order by keywordCount desc";
		List keywordList = keywordDAO.getHibernateTemplate().find(sql);
		if (keywordList.size() > 6) {
			keywordList = keywordList.subList(0, 6);
		}
		request.put("keywordList", keywordList);
		return ActionSupport.SUCCESS;
	}

	public int getKeywordId() {
		return keywordId;
	}

	public void setKeywordId(int keywordId) {
		this.keywordId = keywordId;
	}

	public TKeywordDAO getKeywordDAO() {
		return keywordDAO;
	}

	public void setKeywordDAO(TKeywordDAO keywordDAO) {
		this.keywordDAO = keywordDAO;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getKeywordName() {
		return keywordName;
	}

	public void setKeywordName(String keywordName) {
		this.keywordName = keywordName;
	}

	public int getKeywordType() {
		return keywordType;
	}

	public void setKeywordType(int keywordType) {
		this.keywordType = keywordType;
	}

}
