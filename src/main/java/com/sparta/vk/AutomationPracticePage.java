package com.sparta.vk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AutomationPracticePage {

    private WebDriver driver;
    private final String automationPracticeURL = "https://www.toolsqa.com/automation-practice-form/";
    private By partialLinkTest = By.linkText("Partial Link Test");
    private By linkTest = By.linkText("Link Test");
    private By firstName = By.name("firstname");
    private By lastName = By.name("lastname");
    private By sex = By.name("sex");
    private By experience = By.name("exp");
    private By seleniumCommands = By.id("selenium_commands");


    public AutomationPracticePage(WebDriver driver) {
        this.driver = driver;
    }

    public AutomationPracticePage goToHomePage() {
        driver.navigate().to(automationPracticeURL);
        return this;
    }

    public AutomationPracticePage navigateBack() {
        driver.navigate().back();
        return this;
    }

    private WebElement findElement(By element) {
        return driver.findElement(element);
    }

    private List<WebElement> findElements(By elements) {
        return driver.findElements(elements);
    }

    public boolean isPartialLinkTestDisplayed() {
        return findElement(partialLinkTest).isDisplayed();
    }

    public String getPartialLinkTestText() {
        return findElement(partialLinkTest).getText();
    }

    public AutomationPracticePage clickPartialLinkTest() {
        findElement(partialLinkTest).click();
        return this;
    }

    public boolean islLinkTestDisplayed() {
        return findElement(linkTest).isDisplayed();
    }

    public String getLinkTestText() {
        return findElement(linkTest).getText();
    }

    public AutomationPracticePage clickLinkTest() {
        findElement(linkTest).click();
        return this;
    }

    public AutomationPracticePage inputFirstName(String firstname) {
        findElement(firstName).sendKeys(firstname);
        return this;
    }

    public String getFirstNameInput() {
        return findElement(firstName).getAttribute("value");
    }

    public AutomationPracticePage inputLastName(String lastname) {
        findElement(lastName).sendKeys(lastname);
        return this;
    }

    public String getLastNameInput() {
        return findElement(lastName).getAttribute("value");
    }

    public AutomationPracticePage clickMaleRadioButton() {
        findElements(sex).get(0).click();
        return this;
    }

    public AutomationPracticePage clickFemaleRadioButton() {
        findElements(sex).get(1).click();
        return this;
    }

    public boolean isMaleRadioButtonClicked() {
        clickMaleRadioButton();
        return findElements(sex).get(0).isSelected();
    }

    public boolean isFemaleRadioButtonClicked() {
        clickFemaleRadioButton();
        return findElements(sex).get(1).isSelected();
    }

    public int getNumberOfGenderRadioButtons() {
        return findElements(sex).size();
    }

    public boolean isMaleRadioButtonDisplayed() {
        return findElements(sex).get(0).isDisplayed();
    }

    public boolean isFemaleRadioButtonDisplayed() {
        return findElements(sex).get(1).isDisplayed();
    }

    public AutomationPracticePage clickExp1RadioButton() {
        findElements(experience).get(0).click();
        return this;
    }

    public AutomationPracticePage clickExp2RadioButton() {
        findElements(experience).get(1).click();
        return this;
    }

    public AutomationPracticePage clickExp3RadioButton() {
        findElements(experience).get(2).click();
        return this;
    }

    public AutomationPracticePage clickExp4RadioButton() {
        findElements(experience).get(3).click();
        return this;
    }

    public AutomationPracticePage clickExp5RadioButton() {
        findElements(experience).get(4).click();
        return this;
    }

    public AutomationPracticePage clickExp6RadioButton() {
        findElements(experience).get(5).click();
        return this;
    }

    public AutomationPracticePage clickExp7RadioButton() {
        findElements(experience).get(6).click();
        return this;
    }

//    public AutomationPracticePage clickAllExpButtons() {
//        for (WebElement e : findElements(experience)) {
//            e.click();
//        }
//        return this;
//    }

    public AutomationPracticePage clickAllSeleniumCommands() {
        Select dropDown = new Select(driver.findElement(seleniumCommands));
        for (int i = 0; i < dropDown.getOptions().size(); i++) {
            dropDown.selectByIndex(i);
        }
//        dropDown.selectByIndex(0);
        return this;
    }

    public boolean areAllSeleniumCommandsSelected(){
        Select dropDown = new Select(driver.findElement(seleniumCommands));
        return dropDown.isMultiple();
    }
}
