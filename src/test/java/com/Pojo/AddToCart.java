package com.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AddToCart extends BaseClass {
public AddToCart() {
PageFactory.initElements(driver, this);}

@FindBy(xpath="//button[contains(text(),'Add to Basket')]")
private WebElement add;

public WebElement getAdd() {
	return add;
}

}
