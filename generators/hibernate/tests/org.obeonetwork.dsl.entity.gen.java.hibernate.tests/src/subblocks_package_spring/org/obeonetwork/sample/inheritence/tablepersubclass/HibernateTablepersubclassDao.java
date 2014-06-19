package org.obeonetwork.sample.inheritence.tablepersubclass;

// Start of user code for import
import java.util.Collection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import org.obeonetwork.fwk.dao.exception.DaoException;
import org.obeonetwork.sample.inheritence.tablepersubclass.Root;
import org.obeonetwork.sample.inheritence.tablepersubclass.C1;
import org.obeonetwork.sample.inheritence.tablepersubclass.C2;
import org.obeonetwork.sample.inheritence.tablepersubclass.ITablepersubclassDao;

// End of user code

/**
 * Implementation of DAO interface ITablepersubclassDao based on the hibernate
 * persistence framework.
 * @see org.obeonetwork.sample.inheritence.tablepersubclass.ITablepersubclassDao
 */
public class HibernateTablepersubclassDao extends HibernateDaoSupport implements ITablepersubclassDao {

	/**
     * The logger of this class.
     */
	private final static Log LOG = LogFactory.getLog(HibernateTablepersubclassDao.class);

	/**
	 * Create a new element
	 * @param root Element to create.
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IRootDao.createRoot
     */
    public void createRoot(Root root) throws DaoException {
		LOG.debug("Create a new Root entity");
		try {
			getHibernateTemplate().save(root);
			getHibernateTemplate().flush();
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Update an existing element
	 * @param root
     *            Element to update. If the element has an id,it may use it. 
     	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IRootDao.updateRoot
     */
	public void updateRoot(Root root) throws DaoException {
		LOG.debug("Update the entity Root with id =" + root.getId());
		try {
			getHibernateTemplate().update(root);
			getHibernateTemplate().flush();
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Delete an element
	 * Only id can be used to find which element must be deleted.
	 * @param root Element which will be deleted. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IRootDao.deleteRoot
   	 */
	public void deleteRoot(Root root) throws DaoException {
		LOG.debug("Delete the entity Root with id =" + root.getId());
		try {
			getHibernateTemplate().delete(root);
			getHibernateTemplate().flush();
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Find all elements.
	 * @return A list with all elements, without any filter. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IRootDao.findAllRoots
     */
	public Collection<Root> findAllRoots() throws DaoException {
		LOG.debug("Find all instance of Root entity");
		try {
			Collection<Root> resultList = getHibernateTemplate().loadAll(Root.class);

			LOG.debug("Found " + resultList.size() + " instances of Root entity");
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
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IRootDao.findRootById
     */
	public Root findRootById(String id) throws DaoException {
		LOG.debug("Find one instance of Root entity by id : " + id);
		try {
			return (Root) getHibernateTemplate().load(Root.class, id);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}
	

	/**
	 * Create a new element
	 * @param c1 Element to create.
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IC1Dao.createC1
     */
    public void createC1(C1 c1) throws DaoException {
		LOG.debug("Create a new C1 entity");
		try {
			getHibernateTemplate().save(c1);
			getHibernateTemplate().flush();
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Update an existing element
	 * @param c1
     *            Element to update. If the element has an id,it may use it. 
     	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IC1Dao.updateC1
     */
	public void updateC1(C1 c1) throws DaoException {
		LOG.debug("Update the entity C1 with id =" + c1.getId());
		try {
			getHibernateTemplate().update(c1);
			getHibernateTemplate().flush();
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Delete an element
	 * Only id can be used to find which element must be deleted.
	 * @param c1 Element which will be deleted. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IC1Dao.deleteC1
   	 */
	public void deleteC1(C1 c1) throws DaoException {
		LOG.debug("Delete the entity C1 with id =" + c1.getId());
		try {
			getHibernateTemplate().delete(c1);
			getHibernateTemplate().flush();
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Find all elements.
	 * @return A list with all elements, without any filter. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IC1Dao.findAllC1s
     */
	public Collection<C1> findAllC1s() throws DaoException {
		LOG.debug("Find all instance of C1 entity");
		try {
			Collection<C1> resultList = getHibernateTemplate().loadAll(C1.class);

			LOG.debug("Found " + resultList.size() + " instances of C1 entity");
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
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IC1Dao.findC1ById
     */
	public C1 findC1ById(String id) throws DaoException {
		LOG.debug("Find one instance of C1 entity by id : " + id);
		try {
			return (C1) getHibernateTemplate().load(C1.class, id);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}
	

	/**
	 * Create a new element
	 * @param c2 Element to create.
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IC2Dao.createC2
     */
    public void createC2(C2 c2) throws DaoException {
		LOG.debug("Create a new C2 entity");
		try {
			getHibernateTemplate().save(c2);
			getHibernateTemplate().flush();
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Update an existing element
	 * @param c2
     *            Element to update. If the element has an id,it may use it. 
     	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IC2Dao.updateC2
     */
	public void updateC2(C2 c2) throws DaoException {
		LOG.debug("Update the entity C2 with id =" + c2.getId());
		try {
			getHibernateTemplate().update(c2);
			getHibernateTemplate().flush();
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Delete an element
	 * Only id can be used to find which element must be deleted.
	 * @param c2 Element which will be deleted. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IC2Dao.deleteC2
   	 */
	public void deleteC2(C2 c2) throws DaoException {
		LOG.debug("Delete the entity C2 with id =" + c2.getId());
		try {
			getHibernateTemplate().delete(c2);
			getHibernateTemplate().flush();
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	/**
	 * Find all elements.
	 * @return A list with all elements, without any filter. 
	 	 * @throws DaoException If an HibernateException occurs.
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IC2Dao.findAllC2s
     */
	public Collection<C2> findAllC2s() throws DaoException {
		LOG.debug("Find all instance of C2 entity");
		try {
			Collection<C2> resultList = getHibernateTemplate().loadAll(C2.class);

			LOG.debug("Found " + resultList.size() + " instances of C2 entity");
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
     * @see org.obeonetwork.sample.inheritence.tablepersubclass.IC2Dao.findC2ById
     */
	public C2 findC2ById(String id) throws DaoException {
		LOG.debug("Find one instance of C2 entity by id : " + id);
		try {
			return (C2) getHibernateTemplate().load(C2.class, id);
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}
	

	//Start of user code
	//End of user code
}

