package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TCatelogDAO;
import com.dao.TGoodsDAO;
import com.model.TCatelog;
import com.opensymphony.xwork2.ActionSupport;

public class catelogAction extends ActionSupport {
	private int catelogId;
	private String catelogName;
	private String catelogMiaoshu;

	private String message;
	private String path;

	private TCatelogDAO catelogDAO;
	private TGoodsDAO goodsDAO;

	public String catelogMana() {
		String sql = "from TCatelog where catelogDel='no'";
		List cateLogList = catelogDAO.getHibernateTemplate().find(sql);
		int listSize = cateLogList.size();
		int fromIndex = (pageNow - 1) * pageSize;
		int toIndex = Math.min(fromIndex + pageSize, listSize);
		pageTotle = listSize % pageSize == 0 ? listSize / pageSize : listSize / pageSize + 1;

		cateLogList = cateLogList.subList(fromIndex, toIndex);
		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("cateLogList", cateLogList);
		return ActionSupport.SUCCESS;
	}

	public String catelogAll() {
		String sql = "from TCatelog where catelogDel='no'";
		List cateLogList = catelogDAO.getHibernateTemplate().find(sql);
		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("cateLogList", cateLogList);
		return ActionSupport.SUCCESS;
	}

	public String catelogAdd() {
		TCatelog catelog = new TCatelog();
		catelog.setCatelogName(catelogName);
		catelog.setCatelogMiaoshu(catelogMiaoshu);
		catelog.setCatelogDel("no");
		catelogDAO.save(catelog);
		this.setMessage("操作成功");
		this.setPath("catelogMana.action");
		return "succeed";
	}

	public String catelogDel() {
		String sql = "from TGoods where goodsDel='no' and goodsCatelogId=" + catelogId;
		List goodsList = goodsDAO.getHibernateTemplate().find(sql);
		if (goodsList.size() > 0) {
			this.setMessage("请先删除此类别下的商品");
			this.setPath("catelogMana.action");
		} else {
			TCatelog catelog = catelogDAO.findById(catelogId);
			catelogDAO.delete(catelog);
			//catelog.setCatelogDel("yes");
			catelogDAO.attachDirty(catelog);
			this.setMessage("操作成功");
			this.setPath("catelogMana.action");
		}
		return "succeed";
	}

	public String catelogEditPre() {
		TCatelog catelog = catelogDAO.findById(catelogId);
		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("catelog", catelog);
		return ActionSupport.SUCCESS;
	}

	public String catelogEdit() {
		TCatelog catelog = catelogDAO.findById(catelogId);
		catelog.setCatelogName(catelogName);
		catelog.setCatelogMiaoshu(catelogMiaoshu);
		catelog.setCatelogDel("no");
		catelogDAO.attachDirty(catelog);
		this.setMessage("操作成功");
		this.setPath("catelogMana.action");
		return "succeed";
	}

	public TCatelogDAO getCatelogDAO() {
		return catelogDAO;
	}

	public void setCatelogDAO(TCatelogDAO catelogDAO) {
		this.catelogDAO = catelogDAO;
	}

	public int getCatelogId() {
		return catelogId;
	}

	public void setCatelogId(int catelogId) {
		this.catelogId = catelogId;
	}

	public String getCatelogMiaoshu() {
		return catelogMiaoshu;
	}

	public void setCatelogMiaoshu(String catelogMiaoshu) {
		this.catelogMiaoshu = catelogMiaoshu;
	}

	public String getCatelogName() {
		return catelogName;
	}

	public void setCatelogName(String catelogName) {
		this.catelogName = catelogName;
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

	public TGoodsDAO getGoodsDAO() {
		return goodsDAO;
	}

	public void setGoodsDAO(TGoodsDAO goodsDAO) {
		this.goodsDAO = goodsDAO;
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
