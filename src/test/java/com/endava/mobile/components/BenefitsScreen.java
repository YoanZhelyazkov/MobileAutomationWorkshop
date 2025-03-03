package com.endava.mobile.components;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class BenefitsScreen extends PageObject {

    @AndroidFindBy(id = "categoryHeaderImage")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='TAKE A TOUR']")
    public WebElement BENEFITS_CATEGORIES_HEADER;
}