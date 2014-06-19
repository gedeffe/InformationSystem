package org.obeonetwork.sample.associations.test;

// Start of user code for import 
import org.hibernate.Transaction;
import junit.framework.Assert;
import junit.framework.TestCase;


import org.obeonetwork.sample.SampleDaoFactory;

import org.obeonetwork.fwk.dao.exception.DaoException;
import org.obeonetwork.fwk.dao.hibernate.HibernateUtil;
import org.obeonetwork.sample.associations.IClassManyManyBIDao;
import org.obeonetwork.sample.associations.ClassManyManyBI;


// End of user code

/**
 * Test class for Class_Many_Many_BI.
 */
public class ClassManyManyBITest extends TestCase {
	
	/**
	 * The DAO for class Class_Many_Many_BI.
	 */
	private IClassManyManyBIDao classManyManyBIDao;
	
	/**
	 * The transaction that will be used.
	 */
	private Transaction tx;
	
	/**
	 * Sets up the test before its execution, by creating the dao and the
	 * transaction.
	 * @throws Exception if an unexpected exception occurs.
	 */
	@Override
	protected void setUp() throws Exception {
	    super.setUp();
		classManyManyBIDao = SampleDaoFactory.getAssociationsClassManyManyBIDao();
		tx = HibernateUtil.currentSession().beginTransaction();
	}
	
	/**
	 * Cleans up the test after its execution, by commiting the transaction in
	 * order for the DB changes to become visible, and closing hibernate's
	 * session.
	 * @throws Exception if an unexpected exception occurs.
	 */
	@Override
	protected void tearDown() throws Exception {
	    super.tearDown();
		tx.commit();
	    HibernateUtil.closeSession();
	}
	
	/**
	 * Tests the creation of the entity Class_Many_Many_BI.<br/>
	 * <ul><li>Step 1 : Create an entity</li>
	 * <li>Step 2 : Search the entity and verify it exists</li></ul>
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	public final void testCreateClassManyManyBI() throws DaoException {
	    // fill attributes with example values
	    ClassManyManyBI classManyManyBI = getClassManyManyBIExample();
	    
	    // Execute the tested code
	    classManyManyBIDao.createClassManyManyBI(classManyManyBI);
	
	    // Verify result
	    boolean found = false;
	    for (ClassManyManyBI currentClassManyManyBI : classManyManyBIDao.findAllClassManyManyBIs()) {
	        if (currentClassManyManyBI.equals(classManyManyBI)) {
	            found = true;
	        }
	    }
	    Assert.assertTrue("Class_Many_Many_BI not created", found);
	}
	
	/**
	 * Test the modification of an entity Class_Many_Many_BI.<br/>
	 * <ul><li>Step 1 : Create an entity</li>
	 * <li>Step 2 : Modify the entity</li>
	 * <li>Step 3 : Search the entity and verify the modified values</li></ul>
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	public final void testUpdateClassManyManyBI() throws DaoException {
	    // Initialized the test
	    ClassManyManyBI classManyManyBI = getClassManyManyBIExample();
	    classManyManyBIDao.createClassManyManyBI(classManyManyBI);
	
	    // Execute the tested code
	    classManyManyBI.setFakeAttr(new Boolean(false));
	    classManyManyBIDao.updateClassManyManyBI(classManyManyBI);
	
	    // Verify result
	    boolean found = false;
	    for (ClassManyManyBI currentClassManyManyBI : classManyManyBIDao.findAllClassManyManyBIs()) {
	        if (currentClassManyManyBI.equals(classManyManyBI)) {
	            found = true;
	            Assert.assertEquals("Value fakeAttr not modified",
	                    new Boolean(false),
	                    classManyManyBI.getFakeAttr());
	        }
	    }
	    Assert.assertTrue("ClassManyManyBI not found", found);
	}
	
	/**
	 * Test the suppression of an entity Class_Many_Many_BI.<br/>
	 * <ul><li>Step 1 : Create an entity</li>
	 * <li>Step 2 : Delete the entity</li>
	 * <li>Step 3 : Search the entity and verify it doesn't exist anymore</li>
	 * </ul>
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	public final void testDeleteClassManyManyBI() throws DaoException {
	    // Initialized the test
	    ClassManyManyBI classManyManyBI = getClassManyManyBIExample();
	    classManyManyBIDao.createClassManyManyBI(classManyManyBI);
	    
	    // Execute the tested code
	    classManyManyBIDao.deleteClassManyManyBI(classManyManyBI);
	    
	    // Verify result
	    boolean found = false;
	    for (ClassManyManyBI currentClassManyManyBI : classManyManyBIDao.findAllClassManyManyBIs()) {
	        if (currentClassManyManyBI.getId().equals(classManyManyBI.getId())) {
	            found = true;                
	        }
	    }
	    Assert.assertFalse("ClassManyManyBI not deleted", found);
	}
	
	/**
	 * Test the search of all entities Class_Many_Many_BI.<br/>
	 * <ul><li>Step 1 : Create many entities</li>
	 * <li>Step 2 : Search all entities and verify the entities created are
	 * found</li></ul>
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	public final void testFindAllClassManyManyBIs() throws DaoException {
	    // Verify number of element before testing
	    int before = classManyManyBIDao.findAllClassManyManyBIs().size();
	    Assert.assertTrue("FindAll must return at least 0", before >= 0);
	    
	    // Add two elements
	    ClassManyManyBI classManyManyBI1 = getClassManyManyBIExample();
	    classManyManyBIDao.createClassManyManyBI(classManyManyBI1);
	            
	    ClassManyManyBI classManyManyBI2 = getClassManyManyBIExample();
	    classManyManyBIDao.createClassManyManyBI(classManyManyBI2);
	
	    // Verify result
	    int after = classManyManyBIDao.findAllClassManyManyBIs().size();
	    Assert.assertEquals(
	            "FindAll don't find the good number of elements", 
	            2,
	            after - before);
	}

	
	/**
	 * Creates an example of Class_Many_Many_BI.
	 * @return Returns a new instance of class Class_Many_Many_BI, with fields filled
	 * with example values.
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	protected ClassManyManyBI getClassManyManyBIExample() throws DaoException {
	    // fill attributes with example values
	    ClassManyManyBI classManyManyBI = new ClassManyManyBI();
	    classManyManyBI.setFakeAttr(new Boolean(false));
	    
	    
	    return classManyManyBI;
	}
	
	/**
	 * Creates a second example of Class_Many_Many_BI with other values.
	 * @return Returns a new instance of class Class_Many_Many_BI with fields filled
	 * with other test values.
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	protected ClassManyManyBI getClassManyManyBIExample2() throws DaoException {
	    // fill attributes with example values
	    ClassManyManyBI classManyManyBI = new ClassManyManyBI();
		classManyManyBI.setFakeAttr(new Boolean(false));
		
		
	    return classManyManyBI;
	}
    
    // Start of user code of specific tests
    // End of user code

}
