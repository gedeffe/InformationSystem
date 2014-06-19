package org.obeonetwork.sample.inheritanceassociations;

// Start of user code for import
import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import org.obeonetwork.fwk.dao.exception.DaoException;
import org.obeonetwork.fwk.dao.hibernate.HibernateUtil;
import org.obeonetwork.sample.inheritanceassociations.Class0101BISub;
import org.obeonetwork.sample.inheritanceassociations.IClass0101BISubDao;

// End of user code

/**
 * Implementation of DAO interface IClass0101BISubDao based on the hibernate
 * persistence framework.
 * @see org.obeonetwork.sample.inheritanceassociations.IClass0101BISubDao
 */
public class HibernateClass0101BISubDao implements IClass0101BISubDao {

	/**
     * The logger of this class.
     */
	private final static Log LOG = LogFactory.getLog(HibernateClass0101BISubDao.class);

	/**
	 * Create a new element
	 * @param class_01_01_BI_Sub Element to create.
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritanceassociations.IClass0101BISubDao.createClass_01_01_BI_Sub
     */
	public void createClass0101BISub(final Class0101BISub class0101BISub) throws DaoException {
		LOG.debug("Create a new Class0101BISub entity");
		try {
			Session session = HibernateUtil.currentSession();
			session.save(class0101BISub);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Update an existing element
	 * @param class_01_01_BI_Sub
     *            Element to update. If the element has an id,it may use it. 
     	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritanceassociations.IClass0101BISubDao.updateClass_01_01_BI_Sub
     */
	public void updateClass0101BISub(Class0101BISub class0101BISub) throws DaoException {
		LOG.debug("Update the entity Class_01_01_BI_Sub with id =" + class0101BISub.getId());
		try {
			Session session = HibernateUtil.currentSession();
			session.update(class0101BISub);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Delete an element
	 * Only id can be used to find which element must be deleted.
	 * @param class_01_01_BI_Sub Element which will be deleted. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritanceassociations.IClass0101BISubDao.deleteClass_01_01_BI_Sub
   	 */
	public void deleteClass0101BISub(Class0101BISub class0101BISub) throws DaoException {
		LOG.debug("Delete the entity Class_01_01_BI_Sub with id =" + class0101BISub.getId());
		try {
			Session session = HibernateUtil.currentSession();
			session.delete(class0101BISub);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Find all elements.
	 * @return A list with all elements, without any filter. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritanceassociations.IClass0101BISubDao.findAllClass_01_01_BI_Subs
     */
	public Collection<Class0101BISub> findAllClass0101BISubs() throws DaoException {
		LOG.debug("Find all instance of Class_01_01_BI_Sub entity");
		try {
			Session session = HibernateUtil.currentSession();
			Criteria criteria = session.createCriteria(Class0101BISub.class);
			Collection<Class0101BISub> resultList = criteria.list();
			
			LOG.debug("Found " + resultList.size() + " instances of Class_01_01_BI_Sub entity");
			return resultList;
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Find one entity by its primary key.
     * @param id The PK of the entity
	 * @return The entity found. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritanceassociations.IClass0101BISubDao.findClass_01_01_BI_SubById
     */
	public Class0101BISub findClass0101BISubById(String id) throws DaoException {
		LOG.debug("Find one instance of Class_01_01_BI_Sub entity by id : " + id);
		try {
			Session session = HibernateUtil.currentSession();
			Criteria criteria = session.createCriteria(Class0101BISub.class)
				.add(Restrictions.eq("id", id));
			Class0101BISub result = (Class0101BISub)criteria.uniqueResult();
			
			return result;
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}
	

	//Start of user code
	//End of user code
}

