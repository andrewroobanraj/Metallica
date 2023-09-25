package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static Actions actions;
	public static  Robot robot;
	
	
	 
	public static void launchBrowse() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();

	}
	
	public static void alert() {
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public static void loadUrl(String url) {
		
		driver.get(url);
	}
	
	public static void maxBrowser() {
		driver.manage().window().maximize();

	}
	
	public static void fill(WebElement element,String value) {
		
		element.sendKeys(value);

	}
	
	public static void btnClick(WebElement element) {
		
		element.click();

	}
	
	public static void fieldClear(WebElement element) {
		
		element.clear();
	}
	
	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void pageUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public static void toQuit() {
		driver.quit();
	}
	
	public static void toClose() {
		driver.close();
	}
	
	public static void printText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	
	public static void TogetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
	
	public static void performMoveToElement(WebElement element) {
		
		actions=new Actions(driver);
		
		actions.moveToElement(element).perform();
	}
	
	public static void performDragAndDrop(WebElement src, WebElement dest) {
		
		actions.dragAndDrop(src, dest).perform();	
	}
	
	public static void performDoubleClick(WebElement element) {
		
		actions.doubleClick(element).perform();	
	}
	
	public static void performContextClick(WebElement element) {
		
		actions.contextClick(element).perform();
	}
	
	public static void performEnter() throws AWTException{
		robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void performTab() {
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	
	public void scrollDown() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public void windowsHandling() throws InterruptedException {
		
	 String currentWindowHandle1 = driver.getWindowHandle();

		// Switch to the new window (e.g., the second window opened)
		for (String windowHandle : driver.getWindowHandles()) {
			if (!windowHandle.equals(currentWindowHandle1)) {
				driver.switchTo().window(windowHandle);
				break;
			}	
		}
		Thread.sleep(5000);
		driver.close();

	driver.switchTo().window(currentWindowHandle1);
	
    }
	
	public void scrollUp() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0,0)");
	}
	
	public void scrollToProducts() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 750)");
	}
	
	public void toRefresh() {
		
		driver.navigate().refresh();
	}
	
	public void pageNoscroll() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollTo(0, 3000)");
	}
     	
    public static void newTab() throws AWTException {
		
    	robot=new Robot();
    	
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
    }
    
    public void waitForPageToLoad(int timeoutInSeconds) {
       
    	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String pageLoadState;

        do {
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            
            pageLoadState = (String) jsExecutor.executeScript("return document.readyState");
        } while (!pageLoadState.equals("complete"));

    }

}


