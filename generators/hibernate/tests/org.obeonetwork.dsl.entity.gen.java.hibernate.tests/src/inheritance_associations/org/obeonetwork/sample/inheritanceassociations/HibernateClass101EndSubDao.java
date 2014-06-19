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
import org.obeonetwork.sample.inheritanceassociations.Class101EndSub;
import org.obeonetwork.sample.inheritanceassociations.IClass101EndSubDao;

// End of user code

/**
 * Implementation of DAO interface IClass101EndSubDao based on the hibernate
 * persistence framework.
 * @see org.obeonetwork.sample.inheritanceassociations.IClass101EndSubDao
 */
public class HibernateClass101EndSubDao implements IClass101EndSubDao {

	/**
     * The logger of this class.
     */
	private final static Log LOG = LogFactory.getLog(HibernateClass101EndSubDao.class);

	/**
	 * Create a new element
	 * @param class_1_01_End_Sub Element to create.
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritanceassociations.IClass101EndSubDao.createClass_1_01_End_Sub
     */
	public void createClass101EndSub(final Class101EndSub class101EndSub) throws DaoException {
		LOG.debug("Create a new Class101EndSub entity");
		try {
			Session session = HibernateUtil.currentSession();
			session.save(class101EndSub);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Update an existing element
	 * @param class_1_01_End_Sub
     *            Element to update. If the element has an id,it may use it. 
     	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritanceassociations.IClass101EndSubDao.updateClass_1_01_End_Sub
     */
	public void updateClass101EndSub(Class101EndSub class101EndSub) throws DaoException {
		LOG.debug("Update the entity Class_1_01_End_Sub with id =" + class101EndSub.getId());
		try {
			Session session = HibernateUtil.currentSession();
			session.update(class101EndSub);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Delete an element
	 * Only id can be used to find which element must be deleted.
	 * @param class_1_01_End_Sub Element which will be deleted. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritanceassociations.IClass101EndSubDao.deleteClass_1_01_End_Sub
   	 */
	public void deleteClass101EndSub(Class101EndSub class101EndSub) throws DaoException {
		LOG.debug("Delete the entity Class_1_01_End_Sub with id =" + class101EndSub.getId());
		try {
			Session session = HibernateUtil.currentSession();
			session.delete(class101EndSub);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Find all elements.
	 * @return A list with all elements, without any filter. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritanceassociations.IClass101EndSubDao.findAllClass_1_01_End_Subs
     */
	public Collection<Class101EndSub> findAllClass101EndSubs() throws DaoException {
		LOG.debug("Find all instance of Class_1_01_End_Sub entity");
		try {
			Session session = HibernateUtil.currentSession();
			Criteria criteria = session.createCriteria(Class101EndSub.class);
			Collection<Class101EndSub> resultList = criteria.list();
			
			LOG.debug("Found " + resultList.size() + " instances of Class_1_01_End_Sub entity");
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
     * @see org.obeonetwork.sample.inheritanceassociations.IClass101EndSubDao.findClass_1_01_End_SubById
     */
	public Class101EndSub findClass101EndSubById(String id) throws DaoException {
		LOG.debug("Find one instance of Class_1_01_End_Sub entity by id : " + id);
		try {
			Session session = HibernateUtil.currentSession();
			Criteria criteria = session.createCriteria(Class101EndSub.class)
				.add(Restrictions.eq("id", id));
			Class101EndSub result = (Class101EndSub)criteria.uniqueResult();
			
			return result;
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}
	

	//Start of user code
	//End of user code
}

