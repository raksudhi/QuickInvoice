package model;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import model.DemoOrderItem;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import mytools.DBUtil;

import org.junit.Test;

import com.sun.corba.se.impl.ior.ByteBuffer;

import model.DemoProductInfo;

public class DemoProductTest {

	@Test
	public void testDemoProductInfo() {
		//
		
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
			String products = em.find(DemoProductInfo.class, (long)9).getProductName();
			equals("Mens Shoes");
			}
			catch(Exception e)
			{
				fail(e.getMessage());
				fail("Not yet implemented");
			} finally
			{
				em.close();
				
			}
		
	}

	@Test	
	public void testGetProductId() 
	{
		
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				assertEquals(products.getProductId(), (long)9);
			
			}
			catch(Exception e)
			{
				fail(e.getMessage());
				fail("Not yet implemented");
			} finally
			{
				em.close();
				
			}
		
	}
	
	@Test
	public void testSetProductId() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				//Long productid_val = products.getProductId();
				products.setProductId((long)25);
				assertEquals(products.getProductId(), (long)25);
			}
			catch(Exception e)
			{
				fail(e.getMessage());
				fail("Not yet implemented");
			} finally
			{
				em.close();
				
			}
	}

	
	@Test
	public void testGetCategory() {
		
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				//Long productid_val = products.getProductId();
				//products.setProductId((long)25);
				assertEquals(products.getCategory(), "Mens");
			}
			catch(Exception e)
			{
				fail(e.getMessage());
				fail("Not yet implemented");
			} finally
			{
				em.close();
				
			}
	}

	
	@Test
	public void testSetCategory() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				products.setCategory("Face");
				assertEquals(products.getCategory(), "Face");
			}
			catch(Exception e)
			{
				fail(e.getMessage());
				fail("Not yet implemented");
			} finally
			{
				em.close();
				
			}
	}

	
	@Test
	public void testGetFilename() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				//products.setCategory("Face");
				assertEquals(products.getFilename(), "shoes.jpg");
			}
			catch(Exception e)
			{
				fail(e.getMessage());
				fail("Not yet implemented");
			} finally
			{
				em.close();
				
			}
	}

	
	@Test
	public void testSetFilename() {
		//fail("Not yet implemented");
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
			DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
			products.setFilename("Face.JPG");
			assertEquals(products.getFilename(), "Face.JPG");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
		
	}
	
	@Test
	public void testGetImageLastUpdate() {
		//fail("Not yet implemented");
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
			Calendar calendar = new GregorianCalendar(2015,5,11);
			Date date = calendar.getTime();
			DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
		//	products.setImageLastUpdate(date);;
			assertEquals(products.getImageLastUpdate(), date);
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
		
	}
	
	@Test
	public void testSetImageLastUpdate() {
		//fail("Not yet implemented");
		
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
			DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
			Calendar calendar = new GregorianCalendar(2015,10,21);
			Date date = calendar.getTime();
			//DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
			products.setImageLastUpdate(date);
			assertEquals(products.getImageLastUpdate(), date);
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
		
	}
	
	@Test
	public void testGetListPrice() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				BigDecimal bd = new BigDecimal(110);
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				assertEquals(products.getListPrice(), bd);
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
		
	}

	
	@Test
	public void testSetListPrice() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				BigDecimal bd = new BigDecimal(200);
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				products.setListPrice(bd);
				assertEquals(products.getListPrice(), bd);
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
	}

	
	@Test
	public void testGetMimetype() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				assertEquals(products.getMimetype(), "image/jpeg");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
	}

	
	@Test
	public void testSetMimetype() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				products.setMimetype("jpg");
				assertEquals(products.getMimetype(), "jpg");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
	}
	
	@Test
	public void testGetProductAvail() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				//products.setMimetype("jpg");
				assertEquals(products.getProductAvail(), "Y");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
	}
	
	@Test
	public void testSetProductAvail() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				products.setProductAvail("YES");
				assertEquals(products.getProductAvail(), "YES");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
	}
	
	@Test
	public void testGetProductDescription() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				//products.setProductAvail("YES");
				assertEquals(products.getProductDescription(), "Leather upper and lower lace up shoes");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
	}
	
	@Test
	public void testSetProductDescription() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				products.setProductDescription("YES");
				assertEquals(products.getProductDescription(), "YES");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
	}
	
	@Test
	public void testGetProductImage() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				byte[] b =	products.getProductImage();
	
				assertEquals(b.length, 1603);
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
	}
	
	@Test
	public void testSetProductImage() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				byte[] b = new byte[1700];
				
				//b.length = 1703;
				products.setProductImage(b);
				byte[] d = products.getProductImage();
				assertEquals(products.getProductImage(), d);
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
	}
	
	@Test
	public void testGetProductName() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
			//	products.setMimetype("jpg");
				assertEquals(products.getProductName(), "Mens Shoes");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
	}
	
	
	@Test
	public void testSetProductName() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try {
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				products.setProductName("YES");
				assertEquals(products.getProductName(), "YES");
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
	}
	
	@Test
	public void testGetDemoOrderItems() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();

		try {
			BigDecimal bd = new BigDecimal(110);
			BigDecimal quantity = new BigDecimal(2);
			DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
			DemoOrderItem orderitems = em.find(DemoOrderItem.class, (long)12);
			DemoOrder order = em.find(DemoOrder.class, (long)2);
			assertEquals(orderitems.getDemoProductInfo().getProductId(), products.getProductId());
			assertEquals(orderitems.getDemoOrder().getOrderId(), (long)2);
			assertEquals(orderitems.getUnitPrice(), bd);
			assertEquals(orderitems.getQuantity(), quantity);
			
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
	}
	
	@Test
	public void testSetDemoOrderItems() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();

		try {
			
				BigDecimal bd = new BigDecimal(110);
				BigDecimal quantity = new BigDecimal(2);
				DemoProductInfo products = em.find(DemoProductInfo.class, (long)9);
				List<DemoOrderItem> ord = getUserInfo(products.getProductId());
				DemoOrderItem orderitems = em.find(DemoOrderItem.class, (long)12);
				DemoOrder order = em.find(DemoOrder.class, (long)2);
				
				assertEquals(orderitems.getDemoProductInfo().getProductId(), products.getProductId());
				assertEquals(orderitems.getDemoOrder().getOrderId(), (long)2);
				assertEquals(orderitems.getUnitPrice(), bd);
				assertEquals(orderitems.getQuantity(), quantity);
			
		}
		catch(Exception e)
		{
			fail(e.getMessage());
			fail("Not yet implemented");
		} finally
		{
			em.close();
			
		}
				
	}
	/*
	@Test
	public void testAddDemoOrderItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveDemoOrderItem() {
		fail("Not yet implemented");
	}
*/
	
	protected static List<DemoOrderItem> getUserInfo(Long product_ID)
	{
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		
		String qString = "SELECT o FROM DemoOrderItem o where o.demoProductInfo.productId = :product_ID";
		System.out.println("HEllo");
		TypedQuery<DemoOrderItem> q = em.createQuery(qString, DemoOrderItem.class);
		q.setParameter("product_ID", product_ID);
		List<DemoOrderItem> i = null;
		System.out.println("HEllo");
		try
		{
		
			i = q.getResultList();
			if(i == null || i.isEmpty())
			{
				i = null;
			}
		}
		catch(NoResultException e)
		{
			System.out.println(e);
		}
		
		finally 
		{
			em.close();
		}
		//System.out.println("HEllo");
		System.out.println(i);
		return i;
	}
	
	
}
