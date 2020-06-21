package com.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ViewPojoPage extends BaseClass {
public ViewPojoPage() {
PageFactory.initElements(driver, this);}
@FindBy(xpath="//a[contains(text(),'View Basket')]")
private WebElement view;
public WebElement getView() {
	return view;
}

}
