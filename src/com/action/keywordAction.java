package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TKeywordDAO;
import com.model.TCatelog;
import com.model.TKeyword;
import com.opensymphony.xwork2.ActionSupport;

public class keywordAction extends ActionSupport {
	private int keywordId;

	private String keywordName;

	private int keywordType;

	private String message;
	private String path;

	private Integer keywordCount;

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

	public String keywordEdit() {
		String sql = "from TKeyword where keywordType='1' order by keywordId";
		List keywordList = keywordDAO.getHibernateTemplate().find(sql);
		int listSize = keywordList.size();
		int fromIndex = (pageNow - 1) * pageSize;
		int toIndex = Math.min(fromIndex + pageSize, listSize);
		pageTotle = listSize % pageSize == 0 ? listSize / pageSize : listSize / pageSize + 1;

		keywordList = keywordList.subList(fromIndex, toIndex);

		for (int i = 0; i < keywordList.size(); i++) {
			TKeyword tKeyword = (TKeyword) keywordList.get(i);
			System.out.println(tKeyword.getKeywordId());
			tKeyword.setKeywordName(keywordDAO.findById(tKeyword.getKeywordId()).getKeywordName());
		}
		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("keywordList", keywordList);
		return ActionSupport.SUCCESS;
	}

	public String keywordEditPre() {
		TKeyword keyword = keywordDAO.findById(keywordId);
		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("keyword", keyword);
		return ActionSupport.SUCCESS;
	}

	public String keywordAdd() {
		TKeyword keyword = new TKeyword();
		keyword.setKeywordName(keywordName);
		keyword.setKeywordCount(keywordCount);
		keyword.setKeywordType(1);
		keywordDAO.save(keyword);
		this.setMessage("操作成功");
		this.setPath("keywordEdit.action");
		return "succeed";
	}

	public String keywordDel() {
		String sql = "from TKeyword where keywordType='1' order by keywordId";
		List keywordList = keywordDAO.getHibernateTemplate().find(sql);
		TKeyword tKeyword = keywordDAO.findById(keywordId);
		keywordDAO.delete(tKeyword);
		//tKeyword.setKeywordType(0);
		keywordDAO.attachDirty(tKeyword);
		this.setMessage("操作成功");
		this.setPath("keywordEdit.action");
		return "succeed";
	}

	private int pageNow = 1; // 初始化为1,默认从第一页开始显示
	private int pageSize = 15; // 每页显示15条记录
	private int pageTotle = 1;// 总页数

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageTotle() {
		return pageTotle;
	}

	public void setPageTotle(int pageTotle) {
		this.pageTotle = pageTotle;
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
