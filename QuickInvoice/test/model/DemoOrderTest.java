package model;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Test;

import model.DemoOrder;
import model.DemoCustomer;
import model.DemoOrderItem;
import model.DemoState;
import model.DemoUser;

public class DemoOrderTest {

//	@Test
//	public void testDemoOrder() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testGetOrderId() 
	{
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		try{
			DemoOrder order = em.find(DemoOrder.class, (long)1);
			assertEquals(order.getOrderId(), 1);
			
		}
		catch(Exception e){
		fail(e.getMessage());
		}
	}


	@Test
	public void testSetOrderId() 
	{
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		
		try{
			DemoOrder order = em.find(DemoOrder.class, (long)1);
			order.setOrderId(2);
			assertEquals(order.getOrderId(), 2);
			
		}
		catch(Exception e){
		fail(e.getMessage());
		}
	}

	@Test
	public void testGetOrderTimestamp()
	{
		Calendar calendar = new GregorianCalendar(2015,6,9);
		Date date = calendar.getTime();
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		try{
			DemoOrder order = em.find(DemoOrder.class, (long)1);
			assertEquals(order.getOrderTimestamp(),date);
		
		}
		catch(Exception e){
		fail(e.getMessage());
		fail("Not yet implemented");
		}
		
	}

	@Test
	public void testSetOrderTimestamp() 
	{
		Calendar calendar = new GregorianCalendar(2015,6,9);
		Date date = calendar.getTime();
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		try{
			DemoOrder order = em.find(DemoOrder.class, (long)1);
			order.setOrderTimestamp(date);
			assertEquals(order.getOrderTimestamp(),date);
		
		}
		catch(Exception e){
		fail(e.getMessage());
		fail("Not yet implemented");
		}
	}

	@Test
	public void testGetOrderTotal()
	{
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		try{

			BigDecimal bd = new BigDecimal(1890);
			DemoOrder order = em.find(DemoOrder.class, (long)1);
			assertEquals(order.getOrderTotal(), bd);
		
		}
		catch(Exception e){
		fail(e.getMessage());
		fail("Not yet implemented");
		}
		
	}

	@Test
	public void testSetOrderTotal() 
	{
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		try{

			BigDecimal bd = new BigDecimal(1890);
			DemoOrder order = em.find(DemoOrder.class, (long)1);
			order.setOrderTotal(bd);
			assertEquals(order.getOrderTotal(), bd);
		
		}
		catch(Exception e){
			fail(e.getMessage());
			fail("Not yet implemented");
		}
	}
	
	
	@Test
	public void testGetDemoCustomer()
	{
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		try{

				DemoOrder order = em.find(DemoOrder.class, (long)1);
				DemoCustomer cust = em.find(DemoCustomer.class, (long)7);

				assertEquals(order.getDemoCustomer().getCustomerId(), cust.getCustomerId());
		
		}
		catch(Exception e)
		{
				fail(e.getMessage());
				fail("Not yet implemented");
		}
	}

	@Test
	public void testSetDemoCustomer()
	{
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		try{

				DemoOrder order = em.find(DemoOrder.class, (long)1);
				DemoCustomer cust = em.find(DemoCustomer.class, (long)7);
				cust.setCustomerId((long)100);
				assertEquals(order.getDemoCustomer().getCustomerId(), cust.getCustomerId());
		
		}
		catch(Exception e)
		{
				fail(e.getMessage());
				fail("Not yet implemented");
		}
	}

	@Test
	public void testGetDemoUser()
	{
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		try{

				DemoOrder order = em.find(DemoOrder.class, (long)1);
				DemoUser user = em.find(DemoUser.class, (long)2);
				assertEquals(order.getDemoUser().getUserId(), user.getUserId());
		
		}
		catch(Exception e)
		{
				fail(e.getMessage());
				fail("Not yet implemented");
		}
	}

	@Test
	public void testSetDemoUser()
	{
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		try{

				DemoOrder order = em.find(DemoOrder.class, (long)1);
				DemoUser user = em.find(DemoUser.class, (long)2);
				user.setUserId((long)100);
				assertEquals(order.getDemoUser().getUserId(), user.getUserId());
		
		}
		catch(Exception e)
		{
				fail(e.getMessage());
				fail("Not yet implemented");
		}
	}

	@Test
	public void testGetDemoOrderItems() {
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		try{

				DemoOrder order = em.find(DemoOrder.class, (long)1);
				List<DemoOrderItem> orderitemList = order.getDemoOrderItems();
				System.out.println(orderitemList);
				assertEquals(orderitemList.size(), 3);
		
		}
		catch(Exception e)
		{
				fail(e.getMessage());
				fail("Not yet implemented");
		}
	}

	@Test
	public void testSetDemoOrderItems() {
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		try{

				DemoOrder order = em.find(DemoOrder.class, (long)1);
				List<DemoOrderItem> orderitemList = order.getDemoOrderItems();
				System.out.println(orderitemList);
				order.setDemoOrderItems(orderitemList);
				assertEquals(orderitemList, order.getDemoOrderItems());
		
		}
		catch(Exception e)
		{
				fail(e.getMessage());
				fail("Not yet implemented");
		}
	}
/*
	@Test
	public void testAddDemoOrderItem() 
	{
		DemoOrderItem demoOrderItem = new DemoOrderItem();
		demoOrderItem
		fail("Not yet implemented");
	}

	
	/*@Test
	public void testRemoveDemoOrderItem() {
		fail("Not yet implemented");
	}*/


}

