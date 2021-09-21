package com.autoit;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DownloadImage {
	@Test
	public void test01() throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("file:///C:/Program%20Files/Selelium%20Software/Offline%20Website/Offline%20Website/index.html");
		
		WebElement logo = driver.findElement(By.tagName("img"));
		Point p=logo.getLocation();
		int x=p.getX();
		int y= p.getY();
		System.out.println("x axes-->"+x);
		System.out.println("y axes-->"+y);
		
		Dimension d=logo.getSize();
		System.out.println("height of ele-->"+d.getHeight());
		System.out.println("width of ele-->"+d.getWidth());
	
		
		
		Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Actions act = new Actions(driver);
		//act.moveToElement(logo);
		//act.pause(2000).perform();
		act.contextClick(logo).perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		//robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
	//	robot.delay(2000);
		Runtime.getRuntime().exec("C:/Users/HP/Desktop/newauto/Folder1.exe");

}
}
