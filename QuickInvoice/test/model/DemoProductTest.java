package model;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import mytools.DBUtil;

import org.junit.Test;
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

//	@Test
//	public void testGetProductId() {
	//	fail("Not yet implemented");
	//}
	/*
	@Test
	public void testSetProductId() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCategory() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetCategory() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFilename() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFilename() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetImageLastUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetImageLastUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetListPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetListPrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMimetype() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetMimetype() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProductAvail() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetProductAvail() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProductDescription() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetProductDescription() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProductImage() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetProductImage() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProductName() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetProductName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDemoOrderItems() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDemoOrderItems() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddDemoOrderItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveDemoOrderItem() {
		fail("Not yet implemented");
	}
*/
	
	
	
}
