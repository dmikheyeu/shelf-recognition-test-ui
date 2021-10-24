package service;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import page.CustomersPageElements;

import static util.StringGeneratorUtil.generateString;

public class CustomersFlow {

    public static String saveManagersEmail;
    public static String saveProductName;
    public static String saveBrandName;
    public static String saveManagerName;
    public static String saveManagerSurname;

    private static final String MANAGER_NAME_PREFIX = "AutoManagerName";
    private static final String MANAGER_SURNAME_PREFIX = "AutoManagerSurname";
    private static final String MANAGER_EMAIL_PREFIX = "mid+AutoManager_";
    private static final String MANAGER_EMAIL_POSTFIX = "@unicsoft.com";

    private static final String COMPANY_NAME_PREFIX = "CompanyName_";
    private static final String BRAND_NAME_PREFIX = "BrandName_";

    private static final String PRODUCT_NAME_PREFIX = "ProductName_";

    CustomersPageElements customersPageElements = new CustomersPageElements();

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
        customersPageElements.companyName.setValue(COMPANY_NAME_PREFIX + generateString());
        saveBrandName = customersPageElements.brandNameFirst.setValue(BRAND_NAME_PREFIX + generateString()).getValue();
        customersPageElements.addButton.click();

        customersPageElements.brandNameSecond.setValue(BRAND_NAME_PREFIX + generateString());
        customersPageElements.saveButton.click();
        return checkThatBrandNameIsCreated();
    }

    @Step("Check that User create 2 Brand Name")
    public CustomersFlow checkThatBrandNameIsCreated() {
        customersPageElements.autoBrandName.shouldHave().isDisplayed();
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

        saveProductName = customersPageElements.productName.setValue(PRODUCT_NAME_PREFIX + generateString()).getValue();
        customersPageElements.brandName.click();
        customersPageElements.autoBrandName.click();
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
//        customersPageElements.tableWithInfoAboutCreatedProduct.shouldHave(Condition.text(saveProductName));
//        customersPageElements.tableWithInfoAboutCreatedProduct.shouldHave(Condition.text(saveBrandName));
//        customersPageElements.tableWithInfoAboutCreatedProduct.shouldHave(Condition.text("100 x 100 x 100"));
//        customersPageElements.tableWithInfoAboutCreatedProduct.shouldHave(Condition.text("Digestive"));
//        customersPageElements.tableWithInfoAboutCreatedProduct.shouldHave(Condition.text("1234567890"));
        return this;
    }

    @Step("Create new Manager")
    public CustomersFlow createNewManager() {
        customersPageElements.managersButton.click();
        customersPageElements.tableWithInfoAboutAllManagers.shouldHave().isDisplayed();
        customersPageElements.popupWithAddNewManager.shouldHave().isDisplayed();
        customersPageElements.addManagerButton.click();
        saveManagerName = customersPageElements.managerName.setValue(MANAGER_NAME_PREFIX + generateString()).getValue();
        saveManagerSurname = customersPageElements.managerSurname.setValue
                (MANAGER_SURNAME_PREFIX + generateString()).getValue();
        saveManagersEmail = customersPageElements.managerEmail.setValue
                (MANAGER_EMAIL_PREFIX + generateString() + MANAGER_EMAIL_POSTFIX).getValue();
        customersPageElements.managerPhone.setValue("+507-655-598-40");

        customersPageElements.saveButton.click();
        return checkCreatedNewManager();
    }

    @Step("Check that Manager is added")
    public CustomersFlow checkCreatedNewManager() {
        customersPageElements.tableWithInfoAboutCreatedManager.shouldHave(Condition.text(saveManagerName));
        customersPageElements.tableWithInfoAboutCreatedManager.shouldHave(Condition.text(saveManagerSurname));
        customersPageElements.tableWithInfoAboutCreatedManager.shouldHave(Condition.text(saveManagersEmail));
        return this;
    }
}