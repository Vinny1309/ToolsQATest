package com.sparta.vk;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class AppTest 
{
    private static ToolsQAWebsite toolsQAWebsite;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VKapoor\\Documents\\chromedriver_win32\\chromedriver.exe");
        toolsQAWebsite = new ToolsQAWebsite(new ChromeDriver());
        toolsQAWebsite.automationPracticePage().goToHomePage();
    }

    @Test
    public void checkPartialLinkTestIsDisplayed() {
        assertTrue(toolsQAWebsite.automationPracticePage().isPartialLinkTestDisplayed());
    }

    @Test
    public void checkPartialLinkTestText(){
        String text = toolsQAWebsite.automationPracticePage().getPartialLinkTestText();
        Assert.assertEquals(text, "Partial Link Test");
    }

    @Test
    public void testPartialLinkTestClick(){
        toolsQAWebsite.automationPracticePage().clickPartialLinkTest();
        String URL = "https://www.toolsqa.com/automation-practice-form/";
        Assert.assertEquals(toolsQAWebsite.getCurrentURL(), URL);
    }

    @Test
    public void checkLinkTestIsDisplayed(){
        assertTrue(toolsQAWebsite.automationPracticePage().islLinkTestDisplayed());
    }

    @Test
    public void checkLinkTestText(){
        String text = toolsQAWebsite.automationPracticePage().getLinkTestText();
        Assert.assertEquals(text, "Link Test");
    }

    @Test
    public void testLinkTestClick(){
        toolsQAWebsite.automationPracticePage().clickLinkTest();
        String URL = "https://www.toolsqa.com/automation-practice-table/";
        Assert.assertEquals(toolsQAWebsite.getCurrentURL(), URL);
    }

    @Test
    public void testFirstNameTextBox(){
        toolsQAWebsite.automationPracticePage().inputFirstName("dgknfd");
        String actualInput = toolsQAWebsite.automationPracticePage().getFirstNameInput();
        String firstName = "dgknfd";
        Assert.assertEquals(actualInput, firstName);
    }

    @Test
    public void testLasttNameTextBox(){
        toolsQAWebsite.automationPracticePage().inputLastName("LastName");
        String actualInput = toolsQAWebsite.automationPracticePage().getLastNameInput();
        String lastName = "LastName";
        Assert.assertEquals(actualInput, lastName);
    }

    @Test
    public void testMaleRadioButtonIsSelected(){
        assertTrue(toolsQAWebsite.automationPracticePage().isMaleRadioButtonClicked());
    }

    @Test
    public void testFemaleRadioButtonIsSelected(){
        assertTrue(toolsQAWebsite.automationPracticePage().isFemaleRadioButtonClicked());
    }

    @Test
    public void testMaleRadioButtonIsDisplayed(){
         assertTrue(toolsQAWebsite.automationPracticePage().isMaleRadioButtonDisplayed());
}

    @Test
    public void testFemaleRadioButtonIsDisplayed(){
        assertTrue(toolsQAWebsite.automationPracticePage().isFemaleRadioButtonDisplayed());
    }

    @Test
    public void testNumberOfGenderRadioButtons(){
        toolsQAWebsite.automationPracticePage().goToHomePage();
        int numberOfRadioButtons = toolsQAWebsite.automationPracticePage().getNumberOfGenderRadioButtons();
        assertEquals(numberOfRadioButtons, 2);
    }

    @Test
    public void testAllSeleniumCommandsAreClicked(){
        toolsQAWebsite.automationPracticePage().clickAllSeleniumCommands();
        assertTrue(toolsQAWebsite.automationPracticePage().areAllSeleniumCommandsSelected());
    }

    @AfterClass
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(5000);
        toolsQAWebsite.quitDriver();
    }
}
