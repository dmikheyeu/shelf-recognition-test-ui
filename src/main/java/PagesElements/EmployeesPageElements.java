package PagesElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class EmployeesPageElements {
    public SelenideElement allDashboards = $x("//*[contains(@class,'inner-content')]");

    public SelenideElement dashboardsButton = $x("//*[contains(@href,'/manager/dashboard')]");
    public SelenideElement employeesButton = $x("//*[contains(@href,'/manager/employees')]");
    public SelenideElement settingsButton = $x("//*[contains(@href,'/manager/settings')]");
    public SelenideElement profileButton = $x("//*[contains(@href,'/manager/profile')]");

    public SelenideElement employeeIcon = $x("//*[contains(@class,'custom-page-header_title')]");
    public SelenideElement infoAboutEmployee = $x("//*[contains(@class,'ant-table-thead ng-star-inserted')]");
    public SelenideElement addButton = $x("//*[contains(text(),' Add ')]");

    public SelenideElement fieldNameEmployee = $x("//*[contains(text(),' Add ')]");
    public SelenideElement fieldSurnameEmployee = $x("//*[contains(text(),' Add ')]");
    public SelenideElement fieldEmailEmployee = $x("//*[contains(text(),' Add ')]");
    public SelenideElement fieldPhoneEmployee = $x("//*[contains(text(),' Add ')]");
    public SelenideElement saveButton = $x("//*[contains(text(),' Add ')]");
}
