package com.maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
		
		Select select = new Select(driver.findElement(By.id("animals")));
		List<WebElement> lst = select.getOptions();
		System.out.print("The dropdown option are :");
		
		for(WebElement option: lst) 
			System.out.println(option.getText());
		
		//selecting the option index4
		
		System.out.println("Select the option by index 3 :");
		//select.selectByIndex(4);
		select.selectByIndex(3);
		System.out.println("select value is: " + select.getFirstSelectedOption().getText());
		
		
//		Thread.sleep(3000);
//		WebElement btnToogle = driver.findElement(By.xpath("//*[@id=\"first\"]"));
//		btnToogle.click();
//		Thread.sleep(3000);
		
	}

}
