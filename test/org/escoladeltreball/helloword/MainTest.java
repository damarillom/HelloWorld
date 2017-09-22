/**
 * 
 */
package org.escoladeltreball.helloword;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw26509397
 *
 */
public class MainTest {
	
	private static Main main;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("in setUpBeforeClass method");
		main = new Main();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("in tearDownAfterClass method");
		main = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("in setUp method");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("in tearDown method");
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloword.Main#findSmallest(int[])}.
	 */
	
	@Test
	public final void testFindSmallest() {
		assertEquals(1, main.findSmallest(new int[] {1, 2, 3}));
		assertEquals(0, main.findSmallest(new int[] {1, 2, 1, 0, 3}));
		assertEquals(-3, main.findSmallest(new int[] {1, 2, -3}));
		assertEquals(1, main.findSmallest(new int[] {1, 1, 1}));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloword.Main#sum(int[])}.
	 */
	// @Ignore("El tractarem mes tard")
	@Test
	public final void testSum() {
		assertEquals(15, main.sum(new int[] {5,5,5}));
		assertEquals(15, main.sum(new int[] {4,5,6}));
		assertEquals(15, main.sum(new int[] {5,5,5,5,-5}));
		assertEquals(15, main.sum(new int[] {15}));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloword.Main#frecuency(int[], int)}.
	 */
	// @Ignore("El tractarem mes tard")
	@Test
	public final void testFrecuency() {
		assertEquals(3, main.frecuency(new int[] {5,5,5}, 5));
		assertEquals(0, main.frecuency(new int[] {5,5,5}, 3));
		assertEquals(1, main.frecuency(new int[] {51,5,0}, 5));
		assertEquals(3, main.frecuency(new int[] {5,-3,5,90,5}, 5));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloword.Main#frequencyPercentage(int[], int)}.
	 */
	//@Ignore("El tractarem mes tard")
	@Test
	public final void testFrequencyPercentage() {
		assertEquals(100, main.frequencyPercentage(new int[] {5,5,5}, 5), 0.001);
		assertEquals(0, main.frequencyPercentage(new int[] {5,5,5}, 3), 0.001);
		assertEquals(50, main.frequencyPercentage(new int[] {5,78,4,5}, 5), 0.001);
		assertEquals(75, main.frequencyPercentage(new int[] {5,5,8,5}, 5), 0.001);
	}
	/**
	 * Test method for {@link org.escoladeltreball.helloword.Main#isPresent(int[], int)}.
	 */
	@Test
	public final void testIsPresent() {
		assertEquals(true, main.isPresent(new int[] {5,5,5}, 5));
		assertEquals(false, main.isPresent(new int[] {5,5,5}, 3));
		assertEquals(true, main.isPresent(new int[] {5,78,4}, 5));
	}
	/**
	 * Test method for {@link org.escoladeltreball.helloword.Main#merge(int[], int)}.
	 */
	@Test
	public final void testMerge() {
		assertArrayEquals(new int[] {1,2,3,4}, main.merge(new int[] {1,2,4}, 3));
		//assertEquals(false, main.merge(new int[] {5,5,5}, 3));
		//assertEquals(true, main.merge(new int[] {5,78,4}, 5));
	}
}
