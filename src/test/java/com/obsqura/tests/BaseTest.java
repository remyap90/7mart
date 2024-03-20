package com.obsqura.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.obsqura.pages.AddPage;
import com.obsqura.pages.AdminUsersPage;
import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.ListDeliveryBoyPage;
import com.obsqura.pages.ListExpensePage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.NewsPage;
import com.obsqura.pages.NotificationsPage;
import com.obsqura.pages.SliderPage;
import com.obsqura.utils.TestProperties;

public class BaseTest {
	
	WebDriver driver=null;
	
	@BeforeMethod(alwaysRun=true)
	public void initDriver() throws IOException {
		
		Properties prop = TestProperties.getProperties();
		String browserName =prop.getProperty("browserName");
		System.out.println(browserName);
		String env=prop.getProperty("Envrionment");
		System.out.println("Executing in "+ env);
		String URL = prop.getProperty(env);
		
	
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else {
			System.out.println("choose correct browser");
		}
		initPages();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get( URL);
		
	}
	
	public LoginPage lp;
	public HomePage hp ;
	public ExpenseCategoryPage exp;
	public  ListDeliveryBoyPage ldb;
	public AdminUsersPage adminUser;
	public NewsPage news;
	public AddPage page;
	public ListExpensePage lep;
	public NotificationsPage not;
	public SliderPage slider;
	
	public void initPages() {
		lp = new LoginPage(driver);
		hp = new HomePage(driver);
	    exp= new ExpenseCategoryPage(driver);
	    ldb=new  ListDeliveryBoyPage(driver);
	    adminUser= new AdminUsersPage(driver);
	    news= new NewsPage(driver);
	   page= new AddPage(driver);
	   lep=new ListExpensePage(driver);
	   not=new NotificationsPage(driver);
	    slider =new SliderPage(driver);
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.quit();
	}
}