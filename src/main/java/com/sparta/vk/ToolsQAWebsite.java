package com.sparta.vk;

import org.openqa.selenium.WebDriver;

public class ToolsQAWebsite {

    private WebDriver driver;

    public ToolsQAWebsite(WebDriver driver){
        this.driver = driver;
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

    public AutomationPracticePage automationPracticePage(){
        return new AutomationPracticePage(driver);
    }

    public void quitDriver(){
        driver.quit();
    }
}
