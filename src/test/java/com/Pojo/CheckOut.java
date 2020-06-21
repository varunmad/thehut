package com.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CheckOut extends BaseClass {
public CheckOut() {
PageFactory.initElements(driver, this);}
@FindBy(xpath="")
private WebElement checkout;
}
