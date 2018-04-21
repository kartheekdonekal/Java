package com.individualconcepts.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	}
	
	//static WebDriver driver = new FirefoxDriver();
	static WebDriver driver = new ChromeDriver();

}
