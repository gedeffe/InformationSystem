package org.obeonetwork.sample.operation;

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
import org.obeonetwork.sample.operation.Operations;
import org.obeonetwork.sample.operation.IOperationsDao;

// End of user code

/**
 * Implementation of DAO interface IOperationsDao based on the hibernate
 * persistence framework.
 * @see org.obeonetwork.sample.operation.IOperationsDao
 */
public class HibernateOperationsDao implements IOperationsDao {

	/**
     * The logger of this class.
     */
	private final static Log LOG = LogFactory.getLog(HibernateOperationsDao.class);

	/**
	 * Create a new element
	 * @param operations Element to create.
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.operation.IOperationsDao.createOperations
     */
	public void createOperations(final Operations operations) throws DaoException {
		LOG.debug("Create a new Operations entity");
		try {
			Session session = HibernateUtil.currentSession();
			session.save(operations);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Update an existing element
	 * @param operations
     *            Element to update. If the element has an id,it may use it. 
     	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.operation.IOperationsDao.updateOperations
     */
	public void updateOperations(Operations operations) throws DaoException {
		LOG.debug("Update the entity Operations with id =" + operations.getId());
		try {
			Session session = HibernateUtil.currentSession();
			session.update(operations);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Delete an element
	 * Only id can be used to find which element must be deleted.
	 * @param operations Element which will be deleted. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.operation.IOperationsDao.deleteOperations
   	 */
	public void deleteOperations(Operations operations) throws DaoException {
		LOG.debug("Delete the entity Operations with id =" + operations.getId());
		try {
			Session session = HibernateUtil.currentSession();
			session.delete(operations);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Find all elements.
	 * @return A list with all elements, without any filter. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.operation.IOperationsDao.findAllOperationss
     */
	public Collection<Operations> findAllOperationss() throws DaoException {
		LOG.debug("Find all instance of Operations entity");
		try {
			Session session = HibernateUtil.currentSession();
			Criteria criteria = session.createCriteria(Operations.class);
			Collection<Operations> resultList = criteria.list();
			
			LOG.debug("Found " + resultList.size() + " instances of Operations entity");
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
     * @see org.obeonetwork.sample.operation.IOperationsDao.findOperationsById
     */
	public Operations findOperationsById(String id) throws DaoException {
		LOG.debug("Find one instance of Operations entity by id : " + id);
		try {
			Session session = HibernateUtil.currentSession();
			Criteria criteria = session.createCriteria(Operations.class)
				.add(Restrictions.eq("id", id));
			Operations result = (Operations)criteria.uniqueResult();
			
			return result;
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}
	

	//Start of user code
	//End of user code
}

