package Pages;

import PagesElements.EmployeesPageElements;
import io.qameta.allure.Step;

public class EmployeeFlow {

    EmployeesPageElements employeesPageElements = new EmployeesPageElements();

    @Step("User create new Employee")
    public void createNewEmployee() {
        employeesPageElements.allDashboards.shouldHave().isDisplayed();
        employeesPageElements.employeesButton.shouldHave().isDisplayed();
        employeesPageElements.employeesButton.click();

        employeesPageElements.employeeIcon.shouldHave().isDisplayed();
        employeesPageElements.infoAboutEmployee.shouldHave().isDisplayed();
        employeesPageElements.addButton.click();

        employeesPageElements.fieldNameEmployee.setValue("AutoEmployeeName");
        employeesPageElements.fieldSurnameEmployee.setValue("AutoEmployeeSurname");
        employeesPageElements.fieldEmailEmployee.setValue("mid+AutoEmployee12@unicsoft.com");
        String employeeEmail = employeesPageElements.fieldEmailEmployee.getText();
        System.out.println("email " + employeeEmail);
        employeesPageElements.fieldPhoneEmployee.setValue("+507-655-598-40");
        employeesPageElements.saveButton.click();
//        employeesPageElements.infoAboutEmployee.shouldHave(Condition.name(employeeEmail));
    }
}