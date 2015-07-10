package model;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.DemoOrder;

import mytools.DBUtil;

import org.junit.Test;

public class DemoUserTest {

	@Test
	public void testDemoUser() 
	{
		long userId = 2;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		
		try
		{
			assertTrue(testUser != null);
		}
		catch (Exception e)
		{
			fail("Expected a non-null user object in testDemoUser(): " + e);
		}
	}

	@Test
	public void testGetUserId() 
	{
		long userId = 2;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		
		try
		{
			assertEquals(testUser.getUserId(), (long) 2);
		}
		catch (Exception e)
		{
			fail("Expected matching userIds for testuser: " + e);
		}
	}

	@Test
	public void testSetUserId() 
	{
		long userId = 2;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		testUser.setUserId((long)1);
		
		try
		{
			assertEquals(testUser.getUserId(), (long) 1);
		}
		catch (Exception e)
		{
			fail("Expected matching userIds for testuser: " + e);
		}
	}

	@Test
	public void testGetAdminUser() 
	{
		long userId = 1;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		
		try
		{
			assertTrue(testUser.getAdminUser().equalsIgnoreCase("Y"));
		}
		catch (Exception e)
		{
			fail("Expected 'Y' for getAdminUser() result for userId = 1: " + e);
		}
	}

	@Test
	public void testSetAdminUser() 
	{
		long userId = 2;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		testUser.setAdminUser("Y");
		
		try
		{
			assertTrue(testUser.getAdminUser().equalsIgnoreCase("Y"));
		}
		catch (Exception e)
		{
			fail("Expected 'Y' for setAdminUser() altered result for userId = 2: " + e);
		}
	}

	@Test
	public void testGetCreatedOn() 
	{
		GregorianCalendar gregDateFromDB = new GregorianCalendar(2015, 5, 11);
		Date dateFromDB = gregDateFromDB.getTime();
		
		long userId = 1;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		
		
		try
		{
			assertEquals(dateFromDB, testUser.getCreatedOn());
		}
		catch (Exception e)
		{
			fail("Date mismatch between visual date in DB vs date from method: " + e);
		}
	}

	@Test
	public void testSetCreatedOn() 
	{
		GregorianCalendar gregChangeToDate = new GregorianCalendar(2015, 4, 11);
		Date setToObjectDate = gregChangeToDate.getTime();
		
		long userId = 1;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		testUser.setCreatedOn(setToObjectDate);
		
		
		try
		{
			assertEquals(testUser.getCreatedOn(), setToObjectDate);
		}
		catch (Exception e)
		{
			fail("Date mismatch between visual set by setCreatedOn method and that returned from getCreatedOn() method: " + e);
		}
	}

	@Test
	public void testGetExpiresOn() 
	{
//		DateFormat dateFormat = DateFormat.getDateInstance();
//		GregorianCalendar gregDateFromDB = new GregorianCalendar(2015, 5, 11);
//		Date dateFromDB = gregDateFromDB.getTime();
//		
//		This value is NULL in the database thus we check for null below
		
		long userId = 1;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		
		
		try
		{
			assertNull(testUser.getExpiresOn());
		}
		catch (Exception e)
		{
			fail("Date did not return the expected null from the method vs database: " + e);
		}
	}

	@Test
	public void testSetExpiresOn() 
	{
		GregorianCalendar gregChangeToDate = new GregorianCalendar(2015, 4, 11);
		Date setToObjectDate = gregChangeToDate.getTime();
		
		long userId = 1;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		testUser.setExpiresOn(setToObjectDate);
		
		
		try
		{
			assertEquals(testUser.getExpiresOn(), setToObjectDate);
		}
		catch (Exception e)
		{
			fail("Date mismatch between visual set by setExpires on method and that returned from getExpiresOn() method: " + e);
		}
	}

	@Test
	public void testGetPassword() 
	{
		String dbPassword = "2ADE45F49146BF6DAC8040565661F7AB";
		long userId = 1;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		
		
		try
		{
			assertEquals(testUser.getPassword(), dbPassword);
		}
		catch (Exception e)
		{
			fail("Date did not return the expected null from the method vs database: " + e);
		}
	}

	@Test
	public void testSetPassword() 
	{
		String setToPassword = "password";
		long userId = 1;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		
		testUser.setPassword(setToPassword);
		
		
		try
		{
			assertEquals(testUser.getPassword(), setToPassword);
		}
		catch (Exception e)
		{
			fail("Password returned from getPassword() does not match setPassword() arguement: " + e);
		}
	}

	@Test
	public void testGetProducts() 
	{
		String hasProducts = "Y";
		long userId = 1;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		
		
		try
		{
			assertEquals(testUser.getProducts(), hasProducts);
		}
		catch (Exception e)
		{
			fail("Has products value returned by getProducts() method differs from value in database: " + e);
		}
	}

	@Test
	public void testSetProducts() 
	{
		String hasProducts = "N";	// differs from what is in DB for this user
		long userId = 1;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		testUser.setProducts(hasProducts);
		
		
		try
		{
			assertEquals(testUser.getProducts(), hasProducts);
		}
		catch (Exception e)
		{
			fail("Has products value returned by getProducts() method differs from value in database: " + e);
		}
	}

	@Test
	public void testGetQuota() 
	{
		BigDecimal quota = null;
		long userId = 1;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		
		
		try
		{
			assertEquals(testUser.getQuota(), quota);
		}
		catch (Exception e)
		{
			fail("Quota returned from getQuota() method differs from value in database: " + e);
		}
	}

	@Test
	public void testSetQuota() 
	{
		BigDecimal quota = new BigDecimal(2);
		long userId = 1;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		testUser.setQuota(quota);
		
		
		try
		{
			assertEquals(testUser.getQuota(), quota);
		}
		catch (Exception e)
		{
			fail("Quota returned from getQuota() method differs from value set via setQuota() method: " + e);
		}
	}

	@Test
	public void testGetUserName() 
	{
		long userId = 1;
		String userName = "Admin";
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		
		
		try
		{
			assertEquals(testUser.getUserName(), userName);
		}
		catch (Exception e)
		{
			fail("Quota returned from getQuota() method differs from value in database: " + e);
		}
	}

	@Test
	public void testSetUserName() 
	{
		long userId = 1;
		String userName = "Barney";
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		testUser.setUserName(userName);
		
		try
		{
			assertEquals(testUser.getUserName(), userName);
		}
		catch (Exception e)
		{
			fail("User name returned from getUserName() method differs from value provided to setUserName(): " + e);
		}
	}

	@Test
	public void testGetDemoOrders() 
	{
		long userId = 2;
		DemoUser testUser = DemoUserTest.getDemoUserById(userId);
		
		System.out.println("Line before manual loading of DemoOrders");
		
		// This is a workaround because testUser is not returning the collection of orders
		List<DemoOrder> demoOrders = getOrdersForUser(userId);
		
		System.out.println("The number of demo orders is:" + demoOrders.size());

		try
		{
			assertEquals(demoOrders.size(), 10);
		}
		catch (Exception e)
		{
			fail("Number of demo orders returned from method varies from those seen in database: " + e);
		}
	}

	@Test
	public void testSetDemoOrders() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddDemoOrder() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveDemoOrder() {
		fail("Not yet implemented");
	}

	public static DemoUser getDemoUserById(long userId)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		DemoUser user;
		
		try
		{
			user = em.find(DemoUser.class, userId);
			return user;
		}
		catch (Exception e)
		{
			System.out.println("A problem occurred in retrieving a DemoUser object from the database.");
			return null;
		}
		finally
		{
			em.close();
		}
	}
	
	public static List<DemoOrder> getOrdersForUser(long userId)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		String qString = "SELECT d FROM DemoOrder d WHERE d.demoUser.userId = :userId";
		TypedQuery<DemoOrder> q = em.createQuery(qString, DemoOrder.class);
		q.setParameter("userId", userId);
		
		List<DemoOrder> orders;
		
		try 
		{
			orders = q.getResultList();
			if (orders == null || orders.isEmpty())
				orders = null;
		}
		catch (Exception e)
		{
			System.out.println("Exception occurred in returning order list");
			orders = null;
		}
		finally
		{
			em.close();
		}
		return orders;
	}
}
