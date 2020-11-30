package com.goibibo.qa.pages;

import static com.goibibo.qa.base.TestBase.driver;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

import javax.xml.bind.ParseConversionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.goibibo.qa.base.TestBase;

public class OneWayTrip extends TestBase{
	//PageFactory - Object Repository
		@FindBy(xpath="//a[@class='spicejet_logo']")
		WebElement SpiceJetLogo;
		@FindBy(xpath = "//a[@id='highlight-book']")
		WebElement BookOptn;
		@FindBy(xpath = "//label[@for='ctl00_mainContent_rbtnl_Trip_0']")
		WebElement OneWayOptn;
		@FindBy(xpath = "//select[@id='ctl00_mainContent_ddl_originStation1']")
		WebElement DepartureDD;
		@FindBy(xpath="//select[@id='ctl00_mainContent_ddl_originStation1']//option[@value='BOM']")
		WebElement DepartureValue;
		@FindBy(xpath = "//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")
		WebElement ArrivalDD;
		@FindBy(xpath="//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[12]//*[@value='DEL']")
		WebElement ArrivalValue;
		@FindBy(xpath = "//input[@name='ctl00$mainContent$txt_Fromdate']")
		WebElement SelctDepartureDate;
		@FindBy(xpath = "//div[@class='DayPicker-Caption'][contains(text(),'August 2020')]") //DDMM
		WebElement DepartnrDate;
		@FindBy(xpath="//input[@id='ctl00_mainContent_btn_FindFlights']")
		WebElement SubmitBtn;
		
		//Initialize Object Repository
		public OneWayTrip() {	//constructor
			PageFactory.initElements(driver, this);
			}
//Actions
		public boolean validateSpiceJetLogo() {
			return SpiceJetLogo.isDisplayed();
			}
		
		public void SelectFrom() throws InterruptedException {
			BookOptn.isDisplayed();
			System.out.println("Book Button is Visible");
			OneWayOptn.click();
			System.out.println("One Way Option button is Visible");
//			Select FromDD1 = new Select(FromDD);
//			FromDD1.selectByValue("Mumbai (BOM");
				
			DepartureDD.click();
			System.out.println("Departure dropdown Option is Visible");
		Thread.sleep(10);
		DepartureValue.click();
				}
		
		public void SelectDestination() throws InterruptedException {
//			Select DestinationDD1 = new Select(DestinationDD);
//			DestinationDD1.selectByValue("Delhi (DEL)");
			ArrivalDD.click(); //new code
			System.out.println("Arrival dropdown Option is Visible");
			Thread.sleep(10);
			ArrivalValue.click();//test
			}//
			
		public void SelectDepartureDate() throws InterruptedException {
			Thread.sleep(10);
			SelctDepartureDate.click();
			String setDatestr = "10/08/2020";
			//driver.findElement(By.xpath("//div[@class='DayPicker-Caption'][contains(text(),'August 2020')]"));
			DepartnrDate.getText();
		//	Date setDate = new SimpleDateFormat(Pattern.quote("dd/MM/yyyy").parse(setDatestr);
					
		}
		
		public void SelectSearchBtn() {
			SubmitBtn.click();
		}
		
		}