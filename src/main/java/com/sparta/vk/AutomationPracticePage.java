package com.sparta.vk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AutomationPracticePage {

    private WebDriver driver;
    private final String automationPracticeURL = "https://www.toolsqa.com/automation-practice-form/";
    private By partialLinkTest = By.linkText("Partial Link Test");
    private By linkTest = By.linkText("Link Test");
    private By firstName = By.name("firstname");
    private By lastName = By.name("lastname");
    private By sex = By.name("sex");


    public AutomationPracticePage(WebDriver driver){
        this.driver = driver;
    }

    public AutomationPracticePage goToHomePage(){
        driver.navigate().to(automationPracticeURL);
        return this;
    }

    public AutomationPracticePage navigateBack(){
        driver.navigate().back();
        return this;
    }

    private WebElement findElement(By element){
        return driver.findElement(element);
    }

    private List<WebElement> findElements(By elements){
        return driver.findElements(elements);
    }

    public boolean isPartialLinkTestDisplayed(){
        return findElement(partialLinkTest).isDisplayed();
    }

    public String getPartialLinkTestText(){
        return findElement(partialLinkTest).getText();
    }

    public AutomationPracticePage clickPartialLinkTest(){
        findElement(partialLinkTest).click();
        return this;
    }

    public boolean islLinkTestDisplayed(){
        return findElement(linkTest).isDisplayed();
    }

    public String getLinkTestText(){
        return findElement(linkTest).getText();
    }

    public AutomationPracticePage clickLinkTest(){
        findElement(linkTest).click();
        return this;
    }

    public AutomationPracticePage inputFirstName(String firstname){
        findElement(firstName).sendKeys(firstname);
        return this;
    }

    public String getFirstNameInput(){
        return findElement(firstName).getAttribute("value");
    }

    public AutomationPracticePage inputLastName(String lastname){
        findElement(lastName).sendKeys(lastname);
        return this;
    }

    public String getLastNameInput(){
        return findElement(lastName).getAttribute("value");
    }

    public AutomationPracticePage clickMaleRadioButton(){
        findElements(sex).get(0).click();
        return this;
    }

    public AutomationPracticePage clickFemaleRadioButton(){
        findElements(sex).get(1).click();
        return this;
    }

    public int getNumberOfSexRadioButtons(){
        return findElements(sex).size();
    }

    public boolean isMaleSexRadioButtonClicked(){
        clickMaleRadioButton();
        return findElements(sex).get(0).isSelected();

    }

    public boolean isFemaleSexRadioButtonClicked(){
        clickFemaleRadioButton();
        return findElements(sex).get(1).isSelected();
    }

    public boolean isMaleRadioButtonDisplayed(){
        return findElements(sex).get(0).isDisplayed();
    }

    public boolean isFemaleRadioButtonDisplayed(){
        return findElements(sex).get(1).isDisplayed();
    }

}
