package tdd_junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class mainTest {
main c=new main();

	@Test
	public void testAccept() {
	assertEquals("BCD",c.accept("ABCD"));	
	}


	@Test
	public void test1() {
	assertEquals("CD",c.accept("AACD"));	
	}
    

	@Test
	public void test2() {
	assertEquals("",c.accept(""));	
	}
	@Test
	public void test3() {
	assertEquals("BAA",c.accept("AABAA"));	
	}

	@Test
	public void test4() {
	assertEquals("BCD",c.accept("BACD"));	
	}

	@Test
	public void test5() {
	assertEquals("BBAA",c.accept("BBAA"));	
	}
	
	@Test
	public void test6() {
	assertEquals("",c.accept("AA"));	
	}
}
