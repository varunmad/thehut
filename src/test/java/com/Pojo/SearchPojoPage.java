package com.Pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchPojoPage extends BaseClass {
public SearchPojoPage() {
PageFactory.initElements(driver, this);

}
@FindBy(name="search")
private WebElement search;
public WebElement getSearch() {
	return search;
}


}
