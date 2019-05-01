package com.sparta.vk;

import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VKapoor\\Documents\\chromedriver_win32\\chromedriver.exe");
        ToolsQAWebsite toolsQAWebsite = new ToolsQAWebsite(new ChromeDriver());

        toolsQAWebsite.automationPracticePage().goToHomePage();
//        toolsQAWebsite.automationPracticePage().clickPartialLinkTest();
//        toolsQAWebsite.automationPracticePage().clickLinkTest();
//        toolsQAWebsite.automationPracticePage().navigateBack();
//
//        toolsQAWebsite.automationPracticePage().inputFirstName("dgknfd");
//        toolsQAWebsite.automationPracticePage().getFirstNameInput();
//
//        toolsQAWebsite.automationPracticePage().inputLastName("LastName");
//        toolsQAWebsite.automationPracticePage().getLastNameInput();
//
//        toolsQAWebsite.automationPracticePage().clickMaleRadioButton();
//        toolsQAWebsite.automationPracticePage().clickFemaleRadioButton();
//        toolsQAWebsite.automationPracticePage().getNumberOfGenderRadioButtons();

        //toolsQAWebsite.automationPracticePage().clickAllExpButtons();
        toolsQAWebsite.automationPracticePage().clickAllSeleniumCommands();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        toolsQAWebsite.quitDriver();
    }
}
