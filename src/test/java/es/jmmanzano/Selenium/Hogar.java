/**
 * 
 */
package es.jmmanzano.Selenium;

import org.junit.Test;

import es.jmmanzano.Selenium.Utilidades.Driver;

/**
 * @author josemi
 *
 */
public class Hogar extends Driver {

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void test1() {
		driver.get("https://www.google.es");
		driver.quit();
	}
	
	@Test
	public void test2() {
		driver.get("https://www.meneame.net");
	}

}
