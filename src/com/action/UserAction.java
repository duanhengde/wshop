package com.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.dao.TUserDAO;
import com.model.TUser;
import com.opensymphony.xwork2.ActionSupport;
import com.util.Cart;
import static com.util.RandomValidateCode.CurValidateCode;

public class UserAction extends ActionSupport {
	private int userId;
	private String userName;
	private String userPw;
	private String userRealname;
	private String userAddress;
	private String userSex;
	private String userTel;
	private String userEmail;
	private String userQq;

	private String newUserPw;

	private String randomCode;

	private String message;
	private String path;

	private TUserDAO userDAO;
	

	public String userReg() {
		String result = "regFailed";
		TUser user = new TUser();
		String sql = "from TUser where userName=?";
		Object[] con = { userName };
		List userList = userDAO.getHibernateTemplate().find(sql, con);
		if (userList.size() == 0) {
			user.setUserName(userName);
			user.setUserPw(userPw);
			user.setUserAddress(userAddress);
			user.setUserTel(userTel);
			user.setUserRealname(userRealname);
			user.setUserEmail(userEmail);
			user.setUserSex(userSex);
			user.setUserQq(userQq);
			user.setUserDel("no");
			userDAO.save(user);
			
			result = "successAdd";
		} 
		
		return result;
	}

	public String userEdit() {
		TUser user = userDAO.findById(userId);
		user.setUserName(userName);
		user.setUserPw(userPw);
		user.setUserAddress(userAddress);
		user.setUserTel(userTel);
		user.setUserRealname(userRealname);
		user.setUserEmail(userEmail);
		user.setUserSex(userSex);
		user.setUserQq(userQq);
		user.setUserDel("no");
		userDAO.attachDirty(user);
		Map session = ServletActionContext.getContext().getSession();
		session.put("user", user);
		return "successAdd";
	}

	public String userEditPre() {
		TUser user = userDAO.findById(userId);
		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("user", user);
		return ActionSupport.SUCCESS;
	}

	public String userEdith() {
		TUser user = userDAO.findById(userId);
		user.setUserName(userName);
		user.setUserPw(userPw);
		user.setUserAddress(userAddress);
		user.setUserTel(userTel);
		user.setUserRealname(userRealname);
		user.setUserEmail(userEmail);
		user.setUserSex(userSex);
		user.setUserQq(userQq);
		user.setUserDel("no");
		userDAO.attachDirty(user);
		this.setMessage("操作成功");
		this.setPath("userMana.action");
		return "succeed";
	}

	public String userLogin() {
		Map session = ServletActionContext.getContext().getSession();
		String validateCode = session.get(CurValidateCode).toString();
		if (!randomCode.toUpperCase().equals(validateCode)) {
			this.setMessage("验证码错误");
			this.setPath("qiantai/default.jsp");
			return "succeed";
		}

		String sql = "from TUser where userName=? and userPw=?";
		Object[] con = { userName, userPw };
		List userList = userDAO.getHibernateTemplate().find(sql, con);
		if (userList.size() == 0) {
			this.setMessage("用户名或密码错误");
			this.setPath("qiantai/default.jsp");
		} else {

			TUser user = (TUser) userList.get(0);
			session.put("user", user);

			Cart cart = new Cart();
			session.put("cart", cart);

			this.setMessage("成功登录");
			this.setPath("qiantai/default.jsp");
		}
		return "succeed";
	}

	public String userLogout() {
		Map session = ServletActionContext.getContext().getSession();
		session.remove("user");
		return ActionSupport.SUCCESS;
	}

	public String userDel() {
		TUser user = userDAO.findById(userId);
		userDAO.delete(user);
		//user.setUserDel("yes");
		userDAO.attachDirty(user);
		this.setMessage("删除成功");
		this.setPath("userMana.action");
		return "succeed";
	}

	public String userXinxi() {
		TUser user = userDAO.findById(userId);
		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("user", user);
		return ActionSupport.SUCCESS;
	}

	public String userMana() {
		List userList = userDAO.findAll();
		int listSize = userList.size();
		int fromIndex = (pageNow - 1) * pageSize;
		int toIndex = Math.min(fromIndex + pageSize, listSize);
		pageTotle = listSize % pageSize == 0 ? listSize / pageSize : listSize / pageSize + 1;

		userList = userList.subList(fromIndex, toIndex);
		Map request = (Map) ServletActionContext.getContext().get("request");
		request.put("userList", userList);
		return ActionSupport.SUCCESS;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserQq() {
		return userQq;
	}

	public void setUserQq(String userQq) {
		this.userQq = userQq;
	}

	public String getUserRealname() {
		return userRealname;
	}

	public void setUserRealname(String userRealname) {
		this.userRealname = userRealname;
	}

	public String getUserSex() {
		return userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public TUserDAO getUserDAO() {
		return userDAO;
	}

	public String getMessage() {
		return message;
	}

	public String getNewUserPw() {
		return newUserPw;
	}

	public void setNewUserPw(String newUserPw) {
		this.newUserPw = newUserPw;
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

	public void setUserDAO(TUserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getRandomCode() {
		return randomCode;
	}

	public void setRandomCode(String randomCode) {
		this.randomCode = randomCode;
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
