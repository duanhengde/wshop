package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TCatelogDAO;
import com.dao.TGoodsDAO;
import com.dao.TKeywordDAO;
import com.model.TCatelog;
import com.model.TGoods;
import com.model.TKeyword;
import com.opensymphony.xwork2.ActionSupport;

public class goodsAction extends ActionSupport {
	private int goodsId;
	private int goodsCatelogId;
	private String goodsName;
	private String goodsMiaoshu;
	private String fujian;
	private String goodsYanse;
	private int goodsShichangjia;
	private int goodsTejia;

	private int catelogId;
	private int goodsKucun;

	private String message;
	private String path;

	private TGoodsDAO goodsDAO;
	private TCatelogDAO catelogDAO;
	private TKeywordDAO keywordDAO;
	private int rukushuliang;

	public String goodsNoTejiaAdd() {
		TGoods goods = new TGoods();
		goods.setGoodsCatelogId(goodsCatelogId);
		goods.setGoodsName(goodsName);
		goods.setGoodsMiaoshu(goodsMiaoshu);
		goods.setGoodsPic(fujian);
		goods.setGoodsShichangjia(goodsShichangjia);
		goods.setGoodsHits(0);
		if (goodsTejia == 0)// 特格为0表示没有特价
		{
			goods.setGoodsTejia(goodsShichangjia);// 如果不是特价商品。把这个商品的特价设置为市场价格
			goods.setGoodsIsnottejia("no");
		} else {
			goods.setGoodsTejia(goodsTejia);
			goods.setGoodsIsnottejia("yes");
		}

		goods.setGoodsKucun(goodsKucun);
		goods.setGoodsDel("no");

		goodsDAO.save(goods);
		this.setMessage("操作成功");
		this.setPath("goodsManaNoTejia.action");
		return "succeed";

	}

	public String goodsEditPre() {
		TGoods goods = goodsDAO.findById(goodsId);
		Map request = (Map) ServletActionContext.getContext().get("request");

		String sql = "from TCatelog where catelogDel='no'";
		List catelogList = catelogDAO.getHibernateTemplate().find(sql);
		request.put("catelogList", catelogList);

		request.put("goods", goods);
		return ActionSupport.SUCCESS;
	}

	public String goodsEdit() {
		TGoods goods = goodsDAO.findById(goodsId);
		goods.setGoodsCatelogId(goodsCatelogId);
		goods.setGoodsName(goodsName);
		goods.setGoodsMiaoshu(goodsMiaoshu);
		goods.setGoodsPic(fujian);
		goods.setGoodsShichangjia(goodsShichangjia);
		if (goodsTejia == 0)// 特格为0表示没有特价
		{
			goods.setGoodsTejia(goodsShichangjia);// 如果不是特价商品。把这个商品的特价设置为市场价格
			goods.setGoodsIsnottejia("no");
		} else {
			goods.setGoodsTejia(goodsTejia);
			goods.setGoodsIsnottejia("yes");
		}

		goods.setGoodsKucun(goodsKucun);
		goods.setGoodsDel("no");

		goodsDAO.attachDirty(goods);
		this.setMessage("更新成功");
		this.setPath("goodsMana.action");
		return "succeed";
	}

	public String goodsNoTejiaDel() {
		TGoods goods = goodsDAO.findById(goodsId);
		goods.setGoodsDel("yes");
		goodsDAO.attachDirty(goods);
		this.setMessage("操作成功");
		this.setPath("goodsManaNoTejia.action");
		return "succeed";
	}

	public String goodsManaNoTejia() {
		String sql = "from TGoods where goodsDel='no' order by goodsIsnottejia";
		List goodsList = goodsDAO.getHibernateTemplate().find(sql);
		int listSize = goodsList.size();
		int fromIndex = (pageNow - 1) * pageSize;
		int toIndex = Math.min(fromIndex + pageSize, listSize);
		pageTotle = listSize % pageSize == 0 ? listSize / pageSize : listSize / pageSize + 1;

		goodsList = goodsList.subList(fromIndex, toIndex);

		for (int i = 0; i < goodsList.size(); i++) {
			TGoods goods = (TGoods) goodsList.get(i);
			System.out.println(goods.getGoodsCatelogId());
			goods.setGoodsCatelogName(catelogDAO.findById(goods.getGoodsCatelogId()).getCatelogName());
		}
		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("goodsList", goodsList);
		return ActionSupport.SUCCESS;
	}

	public String goodsShezhiTejia() {
		TGoods goods = goodsDAO.findById(goodsId);
		goods.setGoodsIsnottejia("yes");
		goods.setGoodsTejia(goodsTejia);
		goodsDAO.attachDirty(goods);
		return ActionSupport.SUCCESS;
	}

	public String goodsKucun() {
		String sql = "from TGoods where goodsDel='no' order by goodsIsnottejia";
		List goodsList = goodsDAO.getHibernateTemplate().find(sql);

		int listSize = goodsList.size();
		int fromIndex = (pageNow - 1) * pageSize;
		int toIndex = Math.min(fromIndex + pageSize, listSize);
		pageTotle = listSize % pageSize == 0 ? listSize / pageSize : listSize / pageSize + 1;

		goodsList = goodsList.subList(fromIndex, toIndex);

		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("goodsList", goodsList);
		return ActionSupport.SUCCESS;
	}

	public String goodsRuku() {
		TGoods goods = goodsDAO.findById(goodsId);
		goods.setGoodsKucun(goods.getGoodsKucun() + rukushuliang);
		goods.setGoodsTejia(goodsTejia);
		goodsDAO.attachDirty(goods);
		return ActionSupport.SUCCESS;
	}

	/*
	 * public String goodsYesTejiaAdd() { TGoods goods=new TGoods();
	 * goods.setGoodsCatelogId(goodsCatelogId); goods.setGoodsName(goodsName);
	 * goods.setGoodsMiaoshu(goodsMiaoshu); goods.setGoodsPic(fujian);
	 * goods.setGoodsYanse(goodsYanse); goods.setGoodsShichangjia(goodsShichangjia);
	 * goods.setGoodsTejia(goodsTejia); goods.setGoodsIsnottejia("yes");
	 * goods.setGoodsDel("no"); goodsDAO.save(goods); this.setMessage("操作成功");
	 * this.setPath("goodsManaYesTejia.action"); return "succeed";
	 * 
	 * }
	 * 
	 * public String goodsYesTejiaDel() { TGoods goods=goodsDAO.findById(goodsId);
	 * goods.setGoodsDel("yes"); goodsDAO.attachDirty(goods);
	 * this.setMessage("操作成功"); this.setPath("goodsManaYesTejia.action"); return
	 * "succeed"; }
	 * 
	 * 
	 * public String goodsManaYesTejia() { String
	 * sql="from TGoods where goodsDel='no' and goodsIsnottejia='yes' order by goodsCatelogId"
	 * ; List goodsList=goodsDAO.getHibernateTemplate().find(sql); for(int
	 * i=0;i<goodsList.size();i++) { TGoods goods=(TGoods)goodsList.get(i);
	 * goods.setGoodsCatelogName(catelogDAO.findById(goods.getGoodsCatelogId()).
	 * getCatelogName()); } Map
	 * request=(Map)ServletActionContext.getContext().get("request");
	 * request.put("goodsList", goodsList); return ActionSupport.SUCCESS; }
	 */

	public String goodsDetailHou() {
		Map request = (Map) ServletActionContext.getContext().get("request");

		TGoods goods = goodsDAO.findById(goodsId);
		request.put("goods", goods);
		return ActionSupport.SUCCESS;
	}

	public String goodsDetail() {
		Map request = (Map) ServletActionContext.getContext().get("request");

		TGoods goods = goodsDAO.findById(goodsId);
		goods.setGoodsHits(goods.getGoodsHits() + 1);
		goodsDAO.attachDirty(goods);

		goods.setGoodsCatelogName(catelogDAO.findById(goods.getGoodsCatelogId()).getCatelogName());
		request.put("goods", goods);
		return ActionSupport.SUCCESS;
	}

	public String goodsAllYesTejia() {
		Map request = (Map) ServletActionContext.getContext().get("request");

		String sql = "from TGoods where goodsDel='no' and goodsIsnottejia='yes' order by goodsCatelogId";
		List goodsYesTejiaList = goodsDAO.getHibernateTemplate().find(sql);
		int listSize = goodsYesTejiaList.size();
		int fromIndex = (pageNow - 1) * pageSize;
		int toIndex = Math.min(fromIndex + pageSize, listSize);
		pageTotle = listSize % pageSize == 0 ? listSize / pageSize : listSize / pageSize + 1;

		goodsYesTejiaList = goodsYesTejiaList.subList(fromIndex, toIndex);
		request.put("goodsYesTejiaList", goodsYesTejiaList);
		return ActionSupport.SUCCESS;
	}

	public String goodsAllNoTejia() {
		Map request = (Map) ServletActionContext.getContext().get("request");

		String sql = "from TGoods where goodsDel='no'  order by goodsId desc ";
		List goodsYesTejiaList = goodsDAO.getHibernateTemplate().find(sql);
		int listSize = goodsYesTejiaList.size();
		int fromIndex = (pageNow - 1) * pageSize;
		int toIndex = Math.min(fromIndex + pageSize, listSize);
		pageTotle = listSize % pageSize == 0 ? listSize / pageSize : listSize / pageSize + 1;

		goodsYesTejiaList = goodsYesTejiaList.subList(fromIndex, toIndex);

		request.put("goodsYesTejiaList", goodsYesTejiaList);
		return ActionSupport.SUCCESS;
	}

	public String goodsAllHits() {
		Map request = (Map) ServletActionContext.getContext().get("request");

		String sql = "from TGoods where goodsDel='no'  order by goodsHits desc ";
		List goodsYesTejiaList = goodsDAO.getHibernateTemplate().find(sql);
		int listSize = goodsYesTejiaList.size();
		int fromIndex = (pageNow - 1) * pageSize;
		int toIndex = Math.min(fromIndex + pageSize, listSize);
		pageTotle = listSize % pageSize == 0 ? listSize / pageSize : listSize / pageSize + 1;

		goodsYesTejiaList = goodsYesTejiaList.subList(fromIndex, toIndex);

		request.put("goodsList", goodsYesTejiaList);
		return ActionSupport.SUCCESS;
	}

	public String goodsByCatelog() {
		Map request = (Map) ServletActionContext.getContext().get("request");

		String sql = "from TGoods where goodsDel='no' and goodsCatelogId=? order by goodsCatelogId";
		Object[] con = { catelogId };
		List goodsByCatelogList = goodsDAO.getHibernateTemplate().find(sql, con);
		int listSize = goodsByCatelogList.size();
		int fromIndex = (pageNow - 1) * pageSize;
		int toIndex = Math.min(fromIndex + pageSize, listSize);
		pageTotle = listSize % pageSize == 0 ? listSize / pageSize : listSize / pageSize + 1;

		goodsByCatelogList = goodsByCatelogList.subList(fromIndex, toIndex);

		TCatelog catelog = catelogDAO.findById(catelogId);
		String catelogName = catelog.getCatelogName();
		request.put("catelogName", catelogName);

		request.put("goodsByCatelogList", goodsByCatelogList);

		System.out.println(goodsByCatelogList.size() + "^^^" + goodsCatelogId);
		return ActionSupport.SUCCESS;
	}

	public String goodsSearch() {
		Map request = (Map) ServletActionContext.getContext().get("request");
		String sql = "";
		if (goodsId == 0) {
			sql = "from TGoods where goodsDel='no' and goodsName like '%" + goodsName + "%'"
					+ " order by goodsCatelogId";
		} else {
			TKeyword keyword = keywordDAO.findById(goodsId);
			goodsName = keyword.getKeywordName();
			sql = "from TGoods where goodsDel='no' and goodsName like '%" + keyword.getKeywordName() + "%'"
					+ " order by goodsCatelogId";
		}

		List goodsList = goodsDAO.getHibernateTemplate().find(sql);
		request.put("goodsList", goodsList);

		if (!goodsName.trim().equals("")) {
			keywordDAO.keywordFindU(1, goodsName);
		}

		return ActionSupport.SUCCESS;
	}

	public int getCatelogId() {
		return catelogId;
	}

	public void setCatelogId(int catelogId) {
		this.catelogId = catelogId;
	}

	public int getGoodsCatelogId() {
		return goodsCatelogId;
	}

	public void setGoodsCatelogId(int goodsCatelogId) {
		this.goodsCatelogId = goodsCatelogId;
	}

	public TGoodsDAO getGoodsDAO() {
		return goodsDAO;
	}

	public void setGoodsDAO(TGoodsDAO goodsDAO) {
		this.goodsDAO = goodsDAO;
	}

	public int getRukushuliang() {
		return rukushuliang;
	}

	public void setRukushuliang(int rukushuliang) {
		this.rukushuliang = rukushuliang;
	}

	public int getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsMiaoshu() {
		return goodsMiaoshu;
	}

	public void setGoodsMiaoshu(String goodsMiaoshu) {
		this.goodsMiaoshu = goodsMiaoshu;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public String getFujian() {
		return fujian;
	}

	public int getGoodsKucun() {
		return goodsKucun;
	}

	public void setGoodsKucun(int goodsKucun) {
		this.goodsKucun = goodsKucun;
	}

	public void setFujian(String fujian) {
		this.fujian = fujian;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public TCatelogDAO getCatelogDAO() {
		return catelogDAO;
	}

	public void setCatelogDAO(TCatelogDAO catelogDAO) {
		this.catelogDAO = catelogDAO;
	}

	public int getGoodsShichangjia() {
		return goodsShichangjia;
	}

	public void setGoodsShichangjia(int goodsShichangjia) {
		this.goodsShichangjia = goodsShichangjia;
	}

	public int getGoodsTejia() {
		return goodsTejia;
	}

	public void setGoodsTejia(int goodsTejia) {
		this.goodsTejia = goodsTejia;
	}

	public String getGoodsYanse() {
		return goodsYanse;
	}

	public void setGoodsYanse(String goodsYanse) {
		this.goodsYanse = goodsYanse;
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

	public TKeywordDAO getKeywordDAO() {
		return keywordDAO;
	}

	public void setKeywordDAO(TKeywordDAO keywordDAO) {
		this.keywordDAO = keywordDAO;
	}

	private int pageNow = 1; // 初始化为1,默认从第一页开始显示
	private int pageSize = 6; // 每页显示3条记录
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
