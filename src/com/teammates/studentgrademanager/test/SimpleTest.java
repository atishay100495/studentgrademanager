package com.teammates.studentgrademanager.test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTest {
    public SimpleTest() {
        super();
    }
    
    private Selenium selenium;

	@BeforeMethod
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://127.0.0.1:7101/");
		selenium.start();
	}

	@Test (priority = 1)
	public void testAdminRegister() throws Exception {
                openURL();
		AssertJUnit.assertEquals("WELCOME", selenium.getText("css=label"));
		selenium.click("link=Admin Registration");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals("ADMIN REGISTER", selenium.getText("css=span"));
		selenium.type("id=registeradminform:usernamebox", "newadmin");
		selenium.type("id=registeradminform:passwordbox", "admin123");
		selenium.click("name=registeradminform:j_id_id10");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) AssertJUnit.fail("timeout");
			try { if ("successRegisterAdmin".equals(selenium.getTitle())) break; } catch (Exception e) {e.printStackTrace();}
			Thread.sleep(1000);
		}

		AssertJUnit.assertEquals("successRegisterAdmin", selenium.getTitle());
	}
	
	@Test (priority = 2)
	public void testAdminLogin() throws Exception {
                openURL();
		AssertJUnit.assertEquals("WELCOME", selenium.getText("css=label"));
		selenium.click("link=Admin Login");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals("ADMIN LOGIN", selenium.getText("css=span"));
		selenium.type("id=j_id_id1:usernamebox", "newadmin");
		selenium.type("id=j_id_id1:passwordbox", "admin123");
		selenium.click("name=j_id_id1:j_id_id10");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals("Admin Login Successful...", selenium.getText("id=j_id_id1:adminloginsuccesslabel"));
	}
	
	@Test (priority = 3)
	public void testStudentRegister() throws Exception {
                openURL();
		selenium.click("link=Student Registration");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals("STUDENT REGISTRATION FORM", selenium.getText("css=label"));
		selenium.type("id=registerstudentform:firstnamebox", "first");
		selenium.type("id=registerstudentform:lastnamebox", "last");
		selenium.select("id=registerstudentform:genderdropdownmenu", "label=Female");
		selenium.type("id=registerstudentform:collegeidbox", "myid1");
		selenium.type("id=registerstudentform:emailbox", "first.last@gmail.com");
		selenium.type("id=registerstudentform:branchbox", "EEE");
		selenium.type("id=registerstudentform:addressline1box", "line1");
		selenium.type("id=registerstudentform:addressline2box", "line2");
		selenium.select("id=registerstudentform:citydropdownmenu", "label=Delhi");
		selenium.type("id=registerstudentform:statebox", "Delhi");
		selenium.type("id=registerstudentform:pincodebox", "110001");
		selenium.type("id=registerstudentform:phonebox", "9876543212");
		selenium.type("id=registerstudentform:percentmarksbox", "90");
		selenium.type("id=registerstudentform:passwordbox", "pass1");
		selenium.type("id=registerstudentform:confirmpasswordbox", "pass1");
		selenium.click("name=registerstudentform:j_id_id74");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals("Registration Successful...", selenium.getText("id=form1:outputText1"));
		selenium.click("link=Get Student Details");
		selenium.waitForPageToLoad("30000");
	}
	
	@Test (priority = 4)
	public void testUpdateStudentRecordTest1() throws Exception {
                openURL();
		AssertJUnit.assertEquals("WELCOME", selenium.getText("css=label"));
		selenium.click("link=Admin Login");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=j_id_id1:usernamebox", "newadmin");
		selenium.type("id=j_id_id1:passwordbox", "admin123");
		selenium.click("name=j_id_id1:j_id_id10");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=j_id_id1:studentidbox", "myid1");
		selenium.click("name=j_id_id1:j_id_id7");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=form1:percentmarksbox", "100");
		selenium.click("name=form1:j_id_id70");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals("Update Record Successful... \n \n Update Another Record", selenium.getText("id=j_id_id1"));
	}
	
	@Test (priority = 5)
	public void testUpdateStudentRecordTest2() throws Exception {
                openURL();
		AssertJUnit.assertEquals("WELCOME", selenium.getText("css=label"));
		selenium.click("link=Admin Login");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=j_id_id1:usernamebox", "newadmin");
		selenium.type("id=j_id_id1:passwordbox", "admin123");
		selenium.click("name=j_id_id1:j_id_id10");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=j_id_id1:studentidbox", "myid1");
		selenium.click("name=j_id_id1:j_id_id7");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=form1:firstnamebox", "newfirst");
		selenium.click("name=form1:j_id_id70");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals("Update Record Successful... \n \n Update Another Record", selenium.getText("id=j_id_id1"));
	}

	@Test (priority = 6)
	public void testStudentLoginLogoutTest() throws Exception {
		openURL();
		AssertJUnit.assertEquals("WELCOME", selenium.getText("css=label"));
		selenium.click("link=Student Login");
		selenium.waitForPageToLoad("30000");
		selenium.type("name=user", "myid1");
		selenium.type("name=pwd", "pass1");
		selenium.click("css=input[type=\"submit\"]");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) AssertJUnit.fail("timeout");
			try { if ("successStudentLogin".equals(selenium.getTitle())) break; } catch (Exception e) {e.printStackTrace();}
			Thread.sleep(1000);
		}

		AssertJUnit.assertEquals("successStudentLogin", selenium.getTitle());
		selenium.click("link=Get Student Details");
		selenium.waitForPageToLoad("30000");
		for (int second = 0;; second++) {
			if (second >= 60) AssertJUnit.fail("timeout");
			try { if ("StudentDetails".equals(selenium.getTitle())) break; } catch (Exception e) {e.printStackTrace();}
			Thread.sleep(1000);
		}

		AssertJUnit.assertEquals("StudentDetails", selenium.getTitle());
		selenium.click("css=input[type=\"submit\"]");
		selenium.waitForPageToLoad("30000");
		AssertJUnit.assertEquals("STUDENT LOGIN", selenium.getText("css=b"));
	}
	
        public void openURL() {
            selenium.open("/StudentGradeManager-StudentGradeManager-context-root/faces/WelcomePage.jsp");
        }
        
	@AfterMethod
	public void tearDown() throws Exception {
		selenium.stop();
	}
    
}

