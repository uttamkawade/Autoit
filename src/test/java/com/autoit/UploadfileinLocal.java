package com.autoit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadfileinLocal {

	
	@Test
	public void uploadFile() throws Exception{
		
		 System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Htmlbasic/Fileupload.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("1")).click();
		Runtime.getRuntime().exec("C:/Users/HP/Desktop/Autoit3/Folder1.exe");
	}
}
