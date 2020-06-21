package com.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ListofProductPojoPage extends BaseClass{
public ListofProductPojoPage() {
PageFactory.initElements(driver, this);}
@FindBy(id="productBlock_productName-12304860")
private WebElement watch;
public WebElement getWatch() {
	return watch;
}





}
