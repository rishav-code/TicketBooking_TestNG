package com.atmecs.finakbooking.testscript;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.atmecs.flightbooking.read.Flight_Book_Prop_Read;
import com.atmecs.testbase.testscript.SetupDriver;


public class Final_Submit extends SetupDriver{
	
	
	static Flight_Book_Prop_Read rd= new Flight_Book_Prop_Read();
	
	public static void test() throws FileNotFoundException {
		browserSetup();
		driver.get("http://www.newtours.demoaut.com/.");
		driver.manage().window().maximize();
		WebElement login_username = (driver.findElement(By.name(rd.takeproperties("loc.login.username.txt"))));
		login_username.click();
		login_username.sendKeys("mercury");
		WebElement login_password = (driver.findElement(By.name(rd.takeproperties("loc.login.password.txt"))));
		login_password.click();
		login_password.sendKeys("mercury");
		WebElement login_signin = (driver.findElement(By.name(rd.takeproperties("loc.login.signin.btn"))));
		login_signin.click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath(rd.takeproperties("loc.roundTrip.rbtn"))).click();
		driver.findElement(By.name(rd.takeproperties("loc.passengers.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(rd.takeproperties("loc.passengers.dpdn")));
			dropdown.findElement(By.xpath("//option[@value= '3']")).click();
		}
		driver.findElement(By.name(rd.takeproperties("loc.passengers.dpdn"))).click();
		driver.findElement(By.name(rd.takeproperties("loc.departingFrom.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(rd.takeproperties("loc.departingFrom.dpdn")));
			dropdown.findElement(By.xpath("//option[@value='Acapulco']")).click();
			System.out.println("HO Gaya");
		}
		driver.findElement(By.name(rd.takeproperties("loc.departingFrom.dpdn"))).click();
		driver.findElement(By.name(rd.takeproperties("loc.on.month.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(rd.takeproperties("loc.on.month.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '1']")).click();
		}
		driver.findElement(By.name(rd.takeproperties("loc.on.month.dpdn")));
		driver.findElement(By.name(rd.takeproperties("loc.on.day.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(rd.takeproperties("loc.on.day.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '21']")).click();
		}
		driver.findElement(By.name(rd.takeproperties("loc.on.day.dpdn"))).click();
		driver.findElement(By.name(rd.takeproperties("loc.arrivingIn.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(rd.takeproperties("loc.arrivingIn.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = 'Paris']")).click();
		}
		driver.findElement(By.name(rd.takeproperties("loc.arrivingIn.dpdn"))).click();
		driver.findElement(By.name(rd.takeproperties("loc.returning.month.dpdn"))).click();// loc.returning.month.dpdn
		{
			WebElement dropdown = driver.findElement(By.name(rd.takeproperties("loc.returning.month.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '10']")).click();
		}
		driver.findElement(By.name(rd.takeproperties("loc.returning.month.dpdn"))).click();
		driver.findElement(By.name(rd.takeproperties("loc.returning.day.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(rd.takeproperties("loc.returning.day.dpdn")));
			dropdown.findElement(By.xpath("//option[@value = '10']")).click();
		}
		driver.findElement(By.name(rd.takeproperties("loc.returning.day.dpdn"))).click();
		driver.findElement(By.cssSelector(rd.takeproperties("loc.serviceClass.economy.rbtn"))).click();
		driver.findElement(By.cssSelector(rd.takeproperties("loc.serviceClass.business.rbtn"))).click();
		driver.findElement(By.cssSelector(rd.takeproperties("loc.serviceClass.firstClass.rbtn"))).click();
		driver.findElement(By.name(rd.takeproperties("loc.airline.dpdn"))).click();
		{
			WebElement dropdown = driver.findElement(By.name(rd.takeproperties("loc.airline.dpdn")));
			dropdown.findElement(By.xpath("//option[value = 'Blue Skies Airlines']")).click();
		}
		driver.findElement(By.name(rd.takeproperties("loc.airline.dpdn"))).click();
		driver.findElement(By.name(rd.takeproperties("loc.continue.btn"))).click();
	

		/*WebElement pfirst_name=(driver.findElement(By.name(rd.takeproperties("loc.firstname.txt"))));
		pfirst_name.click();
		pfirst_name.sendKeys("rishav");
		WebElement plast_name=(driver.findElement(By.name(rd.takeproperties("loc.lastname.txt"))));
		plast_name.click();
		plast_name.sendKeys("kumaar");
		{
			WebElement dropdown = driver.findElement(By.name(rd.takeproperties("loc.mealdropdown.dpdn")));
			dropdown.findElement(By.name("pass.0.meal")).click();
		}
		driver.findElement(By.name(rd.takeproperties("loc.mealdropdown.dpdn"))).click();*/
		
		
	

		
	}	}