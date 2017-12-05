package com.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TLiuyanDAO;
import com.model.TAdmin;
import com.model.TLiuyan;
import com.model.TUser;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class liuyanAction extends ActionSupport {
	private int liuyanId;
	private String liuyanTitle;
	private String liuyanContent;

	private TLiuyanDAO liuyanDAO;
	private String message;
	private String path;
	private String liuyanReplay;

	public String getLiuyanReplay() {
		return liuyanReplay;
	}

	public void setLiuyanReplay(String liuyanReplay) {
		this.liuyanReplay = liuyanReplay;
	}

	public String liuyanMana() {
		List liuyanList = liuyanDAO.findAll();
		int listSize = liuyanList.size();
		int fromIndex = (pageNow - 1) * pageSize;
		int toIndex = Math.min(fromIndex + pageSize, listSize);
		pageTotle = listSize % pageSize == 0 ? listSize / pageSize : listSize / pageSize + 1;

		liuyanList = liuyanList.subList(fromIndex, toIndex);
		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("liuyanList", liuyanList);
		return ActionSupport.SUCCESS;
	}

	public String liuyanAdd() {
		TLiuyan liuyan = new TLiuyan();
		liuyan.setLiuyanContent(liuyanContent);
		liuyan.setLiuyanTitle(liuyanTitle);
		liuyan.setLiuyanDate(new Date().toLocaleString());
		Map session = ActionContext.getContext().getSession();

		if (session.get("user") != null) {
			TUser user = (TUser) session.get("user");
			liuyan.setLiuyanUser(user.getUserName());
		}

		liuyanDAO.save(liuyan);
		this.setMessage("操作成功");
		this.setPath("liuyanAll.action");
		return "succeed";
	}

	public String liuyanDel() {
		TLiuyan liuyan = liuyanDAO.findById(liuyanId);
		liuyanDAO.delete(liuyan);
		this.setMessage("删除操作成功");
		this.setPath("liuyanMana.action");
		return "succeed";
	}

	public String liuyanEditPre() {
		TLiuyan liuyan = liuyanDAO.findById(liuyanId);
		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("liuyan", liuyan);
		return ActionSupport.SUCCESS;
	}

	public String liuyanEdit() {
		TLiuyan liuyan = liuyanDAO.findById(liuyanId);
		// liuyan.setLiuyanContent(liuyanContent);
		// liuyan.setLiuyanTitle(liuyanTitle);
		liuyan.setLiuyanReplay(liuyanReplay);
		liuyanDAO.attachDirty(liuyan);
		this.setMessage("操作成功");
		this.setPath("liuyanMana.action");
		return "succeed";
	}

	public String liuyanAll() {
		List liuyanList = liuyanDAO.findAll();
		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("liuyanList", liuyanList);
		return ActionSupport.SUCCESS;
	}

	public String getLiuyanContent() {
		return liuyanContent;
	}

	public void setLiuyanContent(String liuyanContent) {
		this.liuyanContent = liuyanContent;
	}

	public TLiuyanDAO getLiuyanDAO() {
		return liuyanDAO;
	}

	public void setLiuyanDAO(TLiuyanDAO liuyanDAO) {
		this.liuyanDAO = liuyanDAO;
	}

	public int getLiuyanId() {
		return liuyanId;
	}

	public void setLiuyanId(int liuyanId) {
		this.liuyanId = liuyanId;
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

	public String getLiuyanTitle() {
		return liuyanTitle;
	}

	public void setLiuyanTitle(String liuyanTitle) {
		this.liuyanTitle = liuyanTitle;
	}

	private int pageNow = 1; // 初始化为1,默认从第一页开始显示
	private int pageSize = 10; // 每页显示3条记录
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

}
