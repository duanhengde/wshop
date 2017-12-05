package com.dao;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.TKeyword;

/**
 * Data access object (DAO) for domain model class TKeyword.
 * 
 * @see com.model.TKeyword
 * @author MyEclipse Persistence Tools
 */

public class TKeywordDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(TKeywordDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void keywordFindU(int pType, String pName) {
		String sql = "from TKeyword where  keywordType=" + pType + " and keywordName='" + pName
				+ "'  order by keywordCount desc";
		List keywordList = getHibernateTemplate().find(sql);

		if (keywordList.size() > 0) {
			TKeyword keyword = (TKeyword) keywordList.get(0);
			keyword.setKeywordCount(keyword.getKeywordCount() + 1);
			this.attachDirty(keyword);
		} else {
			TKeyword keyword = new TKeyword();
			keyword.setKeywordCount(1);
			keyword.setKeywordName(pName);
			keyword.setKeywordType(pType);
			save(keyword);
		}
	}

	public void save(TKeyword transientInstance) {
		log.debug("saving TKeyword instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TKeyword persistentInstance) {
		log.debug("deleting TKeyword instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TKeyword findById(java.lang.Integer id) {
		log.debug("getting TKeyword instance with id: " + id);
		try {
			TKeyword instance = (TKeyword) getHibernateTemplate().get("com.model.TKeyword", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TKeyword instance) {
		log.debug("finding TKeyword instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TKeyword instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from TKeyword as model where model." + propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TKeyword instances");
		try {
			String queryString = "from TKeyword";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TKeyword merge(TKeyword detachedInstance) {
		log.debug("merging TKeyword instance");
		try {
			TKeyword result = (TKeyword) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TKeyword instance) {
		log.debug("attaching dirty TKeyword instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TKeyword instance) {
		log.debug("attaching clean TKeyword instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TKeywordDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TKeywordDAO) ctx.getBean("TKeywordDAO");
	}
}