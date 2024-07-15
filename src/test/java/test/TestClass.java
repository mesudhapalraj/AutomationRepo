package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PageClass;
import utils.TestBase;

public class TestClass extends TestBase {

    PageClass page;

public TestClass(){
super();
}

@BeforeMethod
public void setUp(){
    initialization();
    page = new PageClass();
}

@Test
    public void gmailSignIn(){

    page.clickSignInBtn();
    System.out.println("New step");
}
}
