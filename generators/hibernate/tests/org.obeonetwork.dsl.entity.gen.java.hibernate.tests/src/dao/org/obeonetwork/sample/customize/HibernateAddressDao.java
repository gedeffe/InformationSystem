package org.obeonetwork.sample.customize;

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
import org.obeonetwork.sample.customize.Address;
import org.obeonetwork.sample.customize.IAddressDao;

// End of user code

/**
 * Implementation of DAO interface IAddressDao based on the hibernate
 * persistence framework.
 * @see org.obeonetwork.sample.customize.IAddressDao
 */
public class HibernateAddressDao implements IAddressDao {

	/**
     * The logger of this class.
     */
	private final static Log LOG = LogFactory.getLog(HibernateAddressDao.class);

	/**
	 * Create a new element
	 * @param address Element to create.
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.customize.IAddressDao.createAddress
     */
	public void createAddress(final Address address) throws DaoException {
		LOG.debug("Create a new Address entity");
		try {
			Session session = HibernateUtil.currentSession();
			session.save(address);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Update an existing element
	 * @param address
     *            Element to update. If the element has an id,it may use it. 
     	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.customize.IAddressDao.updateAddress
     */
	public void updateAddress(Address address) throws DaoException {
		LOG.debug("Update the entity Address with id =" + address.getId());
		try {
			Session session = HibernateUtil.currentSession();
			session.update(address);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Delete an element
	 * Only id can be used to find which element must be deleted.
	 * @param address Element which will be deleted. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.customize.IAddressDao.deleteAddress
   	 */
	public void deleteAddress(Address address) throws DaoException {
		LOG.debug("Delete the entity Address with id =" + address.getId());
		try {
			Session session = HibernateUtil.currentSession();
			session.delete(address);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Find all elements.
	 * @return A list with all elements, without any filter. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.customize.IAddressDao.findAllAddresss
     */
	public Collection<Address> findAllAddresss() throws DaoException {
		LOG.debug("Find all instance of Address entity");
		try {
			Session session = HibernateUtil.currentSession();
			Criteria criteria = session.createCriteria(Address.class);
			Collection<Address> resultList = criteria.list();
			
			LOG.debug("Found " + resultList.size() + " instances of Address entity");
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
     * @see org.obeonetwork.sample.customize.IAddressDao.findAddressById
     */
	public Address findAddressById(String id) throws DaoException {
		LOG.debug("Find one instance of Address entity by id : " + id);
		try {
			Session session = HibernateUtil.currentSession();
			Criteria criteria = session.createCriteria(Address.class)
				.add(Restrictions.eq("id", id));
			Address result = (Address)criteria.uniqueResult();
			
			return result;
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}
	

	//Start of user code
	//End of user code
}

