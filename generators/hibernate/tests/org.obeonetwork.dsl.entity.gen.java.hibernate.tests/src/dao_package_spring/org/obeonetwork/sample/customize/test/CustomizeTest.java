package org.obeonetwork.sample.customize.test;

// Start of user code for import 
import java.util.Date;

import org.springframework.test.AbstractTransactionalSpringContextTests;
import junit.framework.Assert;


import org.obeonetwork.fwk.dao.exception.DaoException;
import org.obeonetwork.sample.customize.ICustomizeDao;
import org.obeonetwork.sample.customize.Person;
import org.obeonetwork.sample.customize.Address;
import org.obeonetwork.sample.customize.Address;
import org.obeonetwork.sample.customize.Person;
// End of user code

/**
 * Test class for customize.
 */
public class CustomizeTest extends AbstractTransactionalSpringContextTests {
	protected final String[] getConfigLocations(){
	    return new String[]{"/conf/spring/tests/applicationContext.xml"};
	}
	
	private ICustomizeDao customizeDao = (ICustomizeDao)getApplicationContext().getBean("CustomizeDAO");
	
	
	
	/**
	 * Tests the creation of the entity Person.<br/>
	 * <ul><li>Step 1 : Create an entity</li>
	 * <li>Step 2 : Search the entity and verify it exists</li></ul>
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	public final void testCreatePerson() throws DaoException {
	    // fill attributes with example values
	    Person person = getPersonExample();
	    
	    // Execute the tested code
	    customizeDao.createPerson(person);
	
	    // Verify result
	    boolean found = false;
	    for (Person currentPerson : customizeDao.findAllPersons()) {
	        if (currentPerson.equals(person)) {
	            found = true;
	        }
	    }
	    Assert.assertTrue("Person not created", found);
	}
	
	/**
	 * Test the modification of an entity Person.<br/>
	 * <ul><li>Step 1 : Create an entity</li>
	 * <li>Step 2 : Modify the entity</li>
	 * <li>Step 3 : Search the entity and verify the modified values</li></ul>
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	public final void testUpdatePerson() throws DaoException {
	    // Initialized the test
	    Person person = getPersonExample();
	    customizeDao.createPerson(person);
	
	    // Execute the tested code
	    person.setFirstName("secondFirstName");
	    person.setAge(new Integer(96511));
	    person.setBirthDate(new Date(1));
	    person.setLastName("secondLastName");
	    customizeDao.updatePerson(person);
	
	    // Verify result
	    boolean found = false;
	    for (Person currentPerson : customizeDao.findAllPersons()) {
	        if (currentPerson.equals(person)) {
	            found = true;
	            Assert.assertEquals("Value firstName not modified",
	                    "secondFirstName",
	                    person.getFirstName());
	            Assert.assertEquals("Value age not modified",
	                    new Integer(96511),
	                    person.getAge());
	            Assert.assertEquals("Value birthDate not modified",
	                    new Date(1),
	                    person.getBirthDate());
	            Assert.assertEquals("Value lastName not modified",
	                    "secondLastName",
	                    person.getLastName());
	        }
	    }
	    Assert.assertTrue("Person not found", found);
	}
	
	/**
	 * Test the suppression of an entity Person.<br/>
	 * <ul><li>Step 1 : Create an entity</li>
	 * <li>Step 2 : Delete the entity</li>
	 * <li>Step 3 : Search the entity and verify it doesn't exist anymore</li>
	 * </ul>
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	public final void testDeletePerson() throws DaoException {
	    // Initialized the test
	    Person person = getPersonExample();
	    customizeDao.createPerson(person);
	    
	    // Execute the tested code
	    customizeDao.deletePerson(person);
	    
	    // Verify result
	    boolean found = false;
	    for (Person currentPerson : customizeDao.findAllPersons()) {
	        if (currentPerson.getId().equals(person.getId())) {
	            found = true;                
	        }
	    }
	    Assert.assertFalse("Person not deleted", found);
	}
	
	/**
	 * Test the search of all entities Person.<br/>
	 * <ul><li>Step 1 : Create many entities</li>
	 * <li>Step 2 : Search all entities and verify the entities created are
	 * found</li></ul>
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	public final void testFindAllPersons() throws DaoException {
	    // Verify number of element before testing
	    int before = customizeDao.findAllPersons().size();
	    Assert.assertTrue("FindAll must return at least 0", before >= 0);
	    
	    // Add two elements
	    Person person1 = getPersonExample();
	    customizeDao.createPerson(person1);
	            
	    Person person2 = getPersonExample();
	    customizeDao.createPerson(person2);
	
	    // Verify result
	    int after = customizeDao.findAllPersons().size();
	    Assert.assertEquals(
	            "FindAll don't find the good number of elements", 
	            2,
	            after - before);
	}
	
	/**
	 * Tests the creation of the entity Address.<br/>
	 * <ul><li>Step 1 : Create an entity</li>
	 * <li>Step 2 : Search the entity and verify it exists</li></ul>
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	public final void testCreateAddress() throws DaoException {
	    // fill attributes with example values
	    Address address = getAddressExample();
	    
	    // Execute the tested code
	    customizeDao.createAddress(address);
	
	    // Verify result
	    boolean found = false;
	    for (Address currentAddress : customizeDao.findAllAddresss()) {
	        if (currentAddress.equals(address)) {
	            found = true;
	        }
	    }
	    Assert.assertTrue("Address not created", found);
	}
	
	/**
	 * Test the modification of an entity Address.<br/>
	 * <ul><li>Step 1 : Create an entity</li>
	 * <li>Step 2 : Modify the entity</li>
	 * <li>Step 3 : Search the entity and verify the modified values</li></ul>
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	public final void testUpdateAddress() throws DaoException {
	    // Initialized the test
	    Address address = getAddressExample();
	    customizeDao.createAddress(address);
	
	    // Execute the tested code
	    address.setCity("secondCity");
	    address.setStreet("secondStreet");
	    address.setNb("secondNb");
	    customizeDao.updateAddress(address);
	
	    // Verify result
	    boolean found = false;
	    for (Address currentAddress : customizeDao.findAllAddresss()) {
	        if (currentAddress.equals(address)) {
	            found = true;
	            Assert.assertEquals("Value city not modified",
	                    "secondCity",
	                    address.getCity());
	            Assert.assertEquals("Value street not modified",
	                    "secondStreet",
	                    address.getStreet());
	            Assert.assertEquals("Value nb not modified",
	                    "secondNb",
	                    address.getNb());
	        }
	    }
	    Assert.assertTrue("Address not found", found);
	}
	
	/**
	 * Test the suppression of an entity Address.<br/>
	 * <ul><li>Step 1 : Create an entity</li>
	 * <li>Step 2 : Delete the entity</li>
	 * <li>Step 3 : Search the entity and verify it doesn't exist anymore</li>
	 * </ul>
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	public final void testDeleteAddress() throws DaoException {
	    // Initialized the test
	    Address address = getAddressExample();
	    customizeDao.createAddress(address);
	    
	    // Execute the tested code
	    customizeDao.deleteAddress(address);
	    
	    // Verify result
	    boolean found = false;
	    for (Address currentAddress : customizeDao.findAllAddresss()) {
	        if (currentAddress.getId().equals(address.getId())) {
	            found = true;                
	        }
	    }
	    Assert.assertFalse("Address not deleted", found);
	}
	
	/**
	 * Test the search of all entities Address.<br/>
	 * <ul><li>Step 1 : Create many entities</li>
	 * <li>Step 2 : Search all entities and verify the entities created are
	 * found</li></ul>
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	public final void testFindAllAddresss() throws DaoException {
	    // Verify number of element before testing
	    int before = customizeDao.findAllAddresss().size();
	    Assert.assertTrue("FindAll must return at least 0", before >= 0);
	    
	    // Add two elements
	    Address address1 = getAddressExample();
	    customizeDao.createAddress(address1);
	            
	    Address address2 = getAddressExample();
	    customizeDao.createAddress(address2);
	
	    // Verify result
	    int after = customizeDao.findAllAddresss().size();
	    Assert.assertEquals(
	            "FindAll don't find the good number of elements", 
	            2,
	            after - before);
	}
	
	

	
	/**
	 * Creates an example of Person.
	 * @return Returns a new instance of class Person, with fields filled
	 * with example values.
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	protected Person getPersonExample() throws DaoException {
	    // fill attributes with example values
	    Person person = new Person();
	    person.setFirstName("myFirstName");
	    person.setAge(new Integer(96511 + 1));
	    person.setBirthDate(new Date(0));
	    person.setLastName("myLastName");
	    
	    Address addressExample = new Address();
	    person.setAddress(addressExample);   
	    addressExample.setPerson(person); 
	    customizeDao.createAddress(addressExample);
	    
	    return person;
	}
	
	/**
	 * Creates a second example of Person with other values.
	 * @return Returns a new instance of class Person with fields filled
	 * with other test values.
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	protected Person getPersonExample2() throws DaoException {
	    // fill attributes with example values
	    Person person = new Person();
		person.setFirstName("secondFirstName");
		person.setAge(new Integer(96511));
		person.setBirthDate(new Date(1));
		person.setLastName("secondLastName");
		
		Address addressExample = new Address();
		person.setAddress(addressExample);   
		addressExample.setPerson(person); 
		customizeDao.createAddress(addressExample);
		
	    return person;
	}
	
	/**
	 * Creates an example of Address.
	 * @return Returns a new instance of class Address, with fields filled
	 * with example values.
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	protected Address getAddressExample() throws DaoException {
	    // fill attributes with example values
	    Address address = new Address();
	    address.setCity("myCity");
	    address.setStreet("myStreet");
	    address.setNb("myNb");
	    
	    Person personExample = new Person();
	    address.setPerson(personExample);   
	    personExample.setAddress(address); 
	    customizeDao.createPerson(personExample);
	    
	    return address;
	}
	
	/**
	 * Creates a second example of Address with other values.
	 * @return Returns a new instance of class Address with fields filled
	 * with other test values.
	 * @throws DaoException if an unexpected DAO exception occurs.
	 */
	protected Address getAddressExample2() throws DaoException {
	    // fill attributes with example values
	    Address address = new Address();
		address.setCity("secondCity");
		address.setStreet("secondStreet");
		address.setNb("secondNb");
		
		Person personExample = new Person();
		address.setPerson(personExample);   
		personExample.setAddress(address); 
		customizeDao.createPerson(personExample);
		
	    return address;
	}
	
    
    // Start of user code of specific tests
    // End of user code

}
