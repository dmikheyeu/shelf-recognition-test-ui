package PagesElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPageElements {
    public SelenideElement enterEmail = $x("//*[contains(@placeholder,'Enter email')]");
    public SelenideElement enterPassword = $x("//*[contains(@placeholder,'password')]");
    public SelenideElement loginButton = $x("//*[contains(@class,'login-form-button m-t-60 w100 ant-btn ant-btn-primary')]");
    public SelenideElement logoButton = $x("//*[contains(@src,'../../assets/images/logo.png')]");
}
