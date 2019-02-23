package es.jmmanzano.Selenium.Utilidades;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;

public abstract class Driver extends TestCase{
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public Driver() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 30);
	}
	
	protected void modal() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("panel de espera")));
	}
	/**
	 * Funciones para saber si un elemento es clickcable
	 * @param id
	 */
	protected void clickableId(String id) {
		wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	}
	protected void clickableName(String id) {
		wait.until(ExpectedConditions.elementToBeClickable(By.name(id)));
	}
	protected void clickableXP(String id) {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(id)));
	}
	
	protected void clickarId(String id) {
		clickableId(id);
		driver.findElement(By.id(id)).click();
	}
	protected void clickarName(String id) {
		clickableName(id);
		driver.findElement(By.name(id)).click();
	}
	protected void clickarXP(String id) {
		clickableXP(id);
		driver.findElement(By.xpath(id)).click();
	}

}
