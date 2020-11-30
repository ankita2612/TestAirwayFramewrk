package com.goibibo.qa.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.goibibo.qa.base.TestBase;
import com.goibibo.qa.pages.OneWayTrip;

public class OneWayTripTest extends TestBase{
	
	OneWayTrip onewaytrip;
	//Created constructor of this page.
	public OneWayTripTest() {
		super();	//it will call super class constrcuor to call testbase class constructor.
	}
		
	@BeforeMethod
	public void setUp() {
		initialization();
		onewaytrip = new OneWayTrip();
		//create object of onewaytrippage class
		}
	
	
	@Test(priority=1)
	public void SelectOneWayDetailsTest() throws InterruptedException {
		boolean flag = onewaytrip.validateSpiceJetLogo();
		Assert.assertTrue(flag);
		Thread.sleep(20);
		onewaytrip.SelectFrom();
		Thread.sleep(10);
		onewaytrip.SelectDestination();
		Thread.sleep(10);
		onewaytrip.SelectSearchBtn();
		
			}
	
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
