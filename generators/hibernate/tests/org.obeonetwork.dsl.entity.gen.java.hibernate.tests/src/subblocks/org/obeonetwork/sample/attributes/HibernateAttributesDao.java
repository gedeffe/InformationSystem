package org.obeonetwork.sample.attributes;

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
import org.obeonetwork.sample.attributes.Cardinality;
import org.obeonetwork.sample.attributes.PrimitiveType;
import org.obeonetwork.sample.attributes.IAttributesDao;

// End of user code

/**
 * Implementation of DAO interface IAttributesDao based on the hibernate
 * persistence framework.
 * @see org.obeonetwork.sample.attributes.IAttributesDao
 */
public class HibernateAttributesDao implements IAttributesDao {

	/**
     * The logger of this class.
     */
	private final static Log LOG = LogFactory.getLog(HibernateAttributesDao.class);

	/**
	 * Create a new element
	 * @param cardinality Element to create.
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.attributes.ICardinalityDao.createCardinality
     */
	public void createCardinality(Cardinality cardinality) throws DaoException {
		LOG.debug("Create a new Cardinality entity");
		try {
			Session session = HibernateUtil.currentSession();
			session.save(cardinality);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Update an existing element
	 * @param cardinality
     *            Element to update. If the element has an id,it may use it. 
     	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.attributes.ICardinalityDao.updateCardinality
     */
	public void updateCardinality(Cardinality cardinality) throws DaoException {
		LOG.debug("Update the entity Cardinality with id =" + cardinality.getId());
		try {
			Session session = HibernateUtil.currentSession();
			session.update(cardinality);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Delete an element
	 * Only id can be used to find which element must be deleted.
	 * @param cardinality Element which will be deleted. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.attributes.ICardinalityDao.deleteCardinality
   	 */
	public void deleteCardinality(Cardinality cardinality) throws DaoException {
		LOG.debug("Delete the entity Cardinality with id =" + cardinality.getId());
		try {
			Session session = HibernateUtil.currentSession();
			session.delete(cardinality);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Find all elements.
	 * @return A list with all elements, without any filter. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.attributes.ICardinalityDao.findAllCardinalitys
     */
	public Collection<Cardinality> findAllCardinalitys() throws DaoException {
		LOG.debug("Find all instance of Cardinality entity");
		try {
			Session session = HibernateUtil.currentSession();
			Criteria criteria = session.createCriteria(Cardinality.class);
			Collection<Cardinality> resultList = criteria.list();
			
			LOG.debug("Found " + resultList.size() + " instances of Cardinality entity");
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
     * @see org.obeonetwork.sample.attributes.ICardinalityDao.findCardinalityById
     */
	public Cardinality findCardinalityById(String id) throws DaoException {
		LOG.debug("Find one instance of Cardinality entity by id : " + id);
		try {
			Session session = HibernateUtil.currentSession();
			Criteria criteria = session.createCriteria(Cardinality.class)
				.add(Restrictions.eq("id", id));
			Cardinality result = (Cardinality)criteria.uniqueResult();
			
			return result;
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}
	

	/**
	 * Create a new element
	 * @param primitiveType Element to create.
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.attributes.IPrimitiveTypeDao.createPrimitiveType
     */
	public void createPrimitiveType(PrimitiveType primitiveType) throws DaoException {
		LOG.debug("Create a new PrimitiveType entity");
		try {
			Session session = HibernateUtil.currentSession();
			session.save(primitiveType);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Update an existing element
	 * @param primitiveType
     *            Element to update. If the element has an id,it may use it. 
     	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.attributes.IPrimitiveTypeDao.updatePrimitiveType
     */
	public void updatePrimitiveType(PrimitiveType primitiveType) throws DaoException {
		LOG.debug("Update the entity PrimitiveType with id =" + primitiveType.getId());
		try {
			Session session = HibernateUtil.currentSession();
			session.update(primitiveType);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Delete an element
	 * Only id can be used to find which element must be deleted.
	 * @param primitiveType Element which will be deleted. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.attributes.IPrimitiveTypeDao.deletePrimitiveType
   	 */
	public void deletePrimitiveType(PrimitiveType primitiveType) throws DaoException {
		LOG.debug("Delete the entity PrimitiveType with id =" + primitiveType.getId());
		try {
			Session session = HibernateUtil.currentSession();
			session.delete(primitiveType);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Find all elements.
	 * @return A list with all elements, without any filter. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.attributes.IPrimitiveTypeDao.findAllPrimitiveTypes
     */
	public Collection<PrimitiveType> findAllPrimitiveTypes() throws DaoException {
		LOG.debug("Find all instance of PrimitiveType entity");
		try {
			Session session = HibernateUtil.currentSession();
			Criteria criteria = session.createCriteria(PrimitiveType.class);
			Collection<PrimitiveType> resultList = criteria.list();
			
			LOG.debug("Found " + resultList.size() + " instances of PrimitiveType entity");
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
     * @see org.obeonetwork.sample.attributes.IPrimitiveTypeDao.findPrimitiveTypeById
     */
	public PrimitiveType findPrimitiveTypeById(String id) throws DaoException {
		LOG.debug("Find one instance of PrimitiveType entity by id : " + id);
		try {
			Session session = HibernateUtil.currentSession();
			Criteria criteria = session.createCriteria(PrimitiveType.class)
				.add(Restrictions.eq("id", id));
			PrimitiveType result = (PrimitiveType)criteria.uniqueResult();
			
			return result;
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}
	

	//Start of user code
	//End of user code
}

