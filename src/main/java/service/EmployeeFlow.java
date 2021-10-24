package service;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import page.EmployeesPageElements;

import static util.StringGeneratorUtil.generateString;

public class EmployeeFlow {

    public static String saveEmployeeName;
    public static String saveEmployeeSurname;
    public static String saveEmployeeEmail;

    public static final String EMPLOYEE_NAME_PREFIX = "AutoEmployeeName";
    public static final String EMPLOYEE_SURNAME_PREFIX = "AutoEmployeeSurname";
    public static final String EMPLOYEE_EMAIL_PREFIX = "mid+AutoEmployee_";
    public static final String EMPLOYEE_EMAIL_POSTFIX = "@unicsoft.com";

    EmployeesPageElements employeesPageElements = new EmployeesPageElements();

    @Step("User create new Employee")
    public void createNewEmployee() {
        employeesPageElements.allDashboards.shouldHave().isDisplayed();
        employeesPageElements.employeesButton.shouldHave().isDisplayed();
        employeesPageElements.employeesButton.click();

        employeesPageElements.employeeIcon.shouldHave().isDisplayed();
        employeesPageElements.infoAboutEmployee.shouldHave().isDisplayed();
        employeesPageElements.addButton.click();

        saveEmployeeName = employeesPageElements.fieldNameEmployee.setValue
                (EMPLOYEE_NAME_PREFIX + generateString()).getText();
        saveEmployeeSurname = employeesPageElements.fieldSurnameEmployee.setValue
                (EMPLOYEE_SURNAME_PREFIX + generateString()).getText();
        saveEmployeeEmail = employeesPageElements.fieldEmailEmployee.setValue
                (EMPLOYEE_EMAIL_PREFIX + generateString() + EMPLOYEE_EMAIL_POSTFIX).getValue();
        employeesPageElements.fieldPhoneEmployee.setValue("+507-655-598-40");
        employeesPageElements.saveButton.click();
        employeesPageElements.allDashboards.shouldHave(Condition.text(saveEmployeeEmail));
    }
}