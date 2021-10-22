package services;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import page.CustomersPageElements;
import page.ManagerPageElements;

import static util.StringGeneratorUtil.generateString;

public class CustomersFlow {

    private static final String MANAGER_NAME_PREFIX = "AutoManagerName";
    private static final String MANAGER_SURNAME_PREFIX = "AutoManagerSurname";
    private static final String MANAGER_EMAIL_PREFIX = "mid+AutoManager_";
    private static final String MANAGER_EMAIL_POSTFIX = "@unicsoft.com";



    CustomersPageElements customersPageElements = new CustomersPageElements();
    ManagerPageElements managerPageElements = new ManagerPageElements();

    @Step("Check that User open 'create' Customers page")
    public CustomersFlow createCustomer() {
        customersPageElements.customersIcon.shouldHave().isDisplayed();
        customersPageElements.companyAndBrandNameIcon.shouldHave().isDisplayed();
        customersPageElements.createNowButton.shouldHave().isDisplayed();
        return this;
    }

    @Step("Create new Customer")
    public CustomersFlow createNewCustomer() {
        customersPageElements.createNowButton.click();
        customersPageElements.addNewCustomerTittle.shouldHave().isDisplayed();
        customersPageElements.pageForCreateCustomer.shouldHave().isDisplayed();
        customersPageElements.companyName.setValue("AutoCompanyName");
        customersPageElements.brandNameFirst.setValue("AutoBrandName_1");
        customersPageElements.addButton.click();
        customersPageElements.brandNameSecond.setValue("AutoBrandName_2");
        customersPageElements.saveButton.click();
        return checkThatBrandNameIsCreated();
    }

    @Step("Check that User create 2 Brand Name")
    public CustomersFlow checkThatBrandNameIsCreated() {
        customersPageElements.autoFirstBrand.shouldHave().isDisplayed();
        customersPageElements.autoSecondBrand.shouldHave().isDisplayed();
        return this;
    }

    @Step("Click on created Company Name")
    public CustomersFlow addProductForCustomers() {
        customersPageElements.autoCompanyName.click();
        customersPageElements.customersAndNameOfCompanyOpened.shouldHave().isDisplayed();
        customersPageElements.tableWithInfoAboutAllProducts.shouldHave().isDisplayed();
        customersPageElements.addProductButton.shouldHave().isDisplayed();
        customersPageElements.autoCompanyName.click();
        customersPageElements.popupWithAddNewProduct.shouldHave().isDisplayed();
        customersPageElements.addProductButton.click();
        customersPageElements.productName.setValue("AutoProductName");
        customersPageElements.brandName.click();
        customersPageElements.autoFirstBrand.click();
        customersPageElements.size.setValue("100 x 100 x 100");
        customersPageElements.productCategory.click();
        customersPageElements.productCategoryDigestive.click();
        customersPageElements.productCode.setValue("1234567890");
        customersPageElements.saveButton.click();
        return checkCreatedNewProduct();
    }

    @Step("Check that User created new Product")
    public CustomersFlow checkCreatedNewProduct() {
        customersPageElements.tableWithInfoAboutAllProducts.shouldHave().isDisplayed();
        customersPageElements.tableWithInfoAboutCreatedProduct.shouldHave(Condition.text("AutoProductName"));
        customersPageElements.tableWithInfoAboutCreatedProduct.shouldHave(Condition.text("AutoBrandName_1"));
        customersPageElements.tableWithInfoAboutCreatedProduct.shouldHave(Condition.text("100 x 100 x 100"));
        customersPageElements.tableWithInfoAboutCreatedProduct.shouldHave(Condition.text("Digestive"));
        customersPageElements.tableWithInfoAboutCreatedProduct.shouldHave(Condition.text("1234567890"));
        return this;
    }

    String managerEmail;

    @Step("Create new Manager")
    public CustomersFlow createNewManager() {
        customersPageElements.managersButton.click();
        customersPageElements.tableWithInfoAboutAllManagers.shouldHave().isDisplayed();
        customersPageElements.popupWithAddNewManager.shouldHave().isDisplayed();
        customersPageElements.addManagerButton.click();
        customersPageElements.managerName.setValue(MANAGER_NAME_PREFIX + generateString());
        customersPageElements.managerSurname.setValue(MANAGER_SURNAME_PREFIX + generateString());
        customersPageElements.managerEmail.setValue(MANAGER_EMAIL_PREFIX + generateString() + MANAGER_EMAIL_POSTFIX);
        customersPageElements.managerPhone.setValue("+507-655-598-40");

        customersPageElements.saveButton.click();
        managerEmail = managerPageElements.saveManagerEmail.getText();
        System.out.println("managerEmail " + managerEmail);
        return checkCreatedNewManager();
    }

    @Step("Check that Manager is added")
    public CustomersFlow checkCreatedNewManager() {
        customersPageElements.tableWithInfoAboutCreatedManager.shouldHave(Condition.text("AutoManagerName"));
        customersPageElements.tableWithInfoAboutCreatedManager.shouldHave(Condition.text("AutoManagerSurname"));
//        customersPageElements.tableWithInfoAboutCreatedManager.shouldHave(Condition.name(managerEmail));
        customersPageElements.tableWithInfoAboutCreatedManager.shouldHave(Condition.text("+507 6555-9840"));
        return this;
    }
}