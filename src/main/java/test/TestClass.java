package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.PageClass;
import utils.TestBase;

public class TestClass extends TestBase {

    PageClass page;

public TestClass(){
super();
}
    ExtentReports es;

@BeforeTest
public void config(){
    String path=System.getProperty("user.dir")+"\\reports\\index.html";
    ExtentSparkReporter reporter=new ExtentSparkReporter(path);
    reporter.config().setReportName("AutomationGIT Report");
    reporter.config().setDocumentTitle("Test Report");
   // reporter.config().setTheme(Theme.valueOf("light"));

   es=new ExtentReports();
    es.attachReporter(reporter);
    es.setSystemInfo("Tester","Raja");

}
@BeforeMethod
public void setUp(){
    initialization();
    page = new PageClass();
}

@Test
    public void gmailSignIn(){

    es.createTest("GitDemo Report");
    page.clickSignInBtn();
    System.out.println("feature/test");
    es.flush();
}
}
