package PagesElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CustomersPageElements {
    public SelenideElement customersIcon = $x("//*[contains(text(),' Customers ')]");
    public SelenideElement companyAndBrandNameIcon = $x("//*[@class='ant-table-thead ng-star-inserted']/tr[1]");
    public SelenideElement createNowButton = $x("//*[contains(text(), ' Create new ')]");

    public SelenideElement addNewCustomerTittle  = $x("//*[contains(text(), ' Add new customer ')]");
    public SelenideElement pageForCreateCustomer = $x("//*[contains(@class, 'ant-drawer-body')]");
    public SelenideElement companyName = $x("//*[contains(@formcontrolname, 'companyName')]");
    public SelenideElement brandNameFirst = $x("(//*[contains(@formcontrolname, 'name')])[1]");
    public SelenideElement brandNameSecond = $x("(//*[contains(@formcontrolname, 'name')])[2]");
    public SelenideElement saveButton = $x("//*[contains(text(), 'Save')]");
    public SelenideElement addButton = $x("//*[contains(@class, 'icon add-btn ant-btn ng-star-inserted')]");

    public SelenideElement autoCompanyName = $x("//*[contains(text(), 'AutoCompanyName')]");
    public SelenideElement autoFirstBrand = $x("//*[contains(text(), 'AutoBrandName_1')]");
    public SelenideElement autoSecondBrand = $x("//*[contains(text(), 'AutoBrandName_2')]");

    public SelenideElement customersAndNameOfCompanyOpened = $x("//*[contains(@class, 'customer-layout custom-page-header ng-star-inserted')]");
    public SelenideElement tableWithInfoAboutAllProducts = $x("//*[contains(@class, 'ant-table-row ng-star-inserted')]");
    public SelenideElement tableWithInfoAboutCreatedProduct = $x("//*[contains(@class, 'ant-table-tbody ng-star-inserted')]");
    public SelenideElement addProductButton = $x("//*[contains(text(),' Add Product ')]");

    public SelenideElement popupWithAddNewProduct = $x("//*[contains(@class, 'ant-drawer-body')]");
    public SelenideElement productName = $x("(//*[contains(@formcontrolname, 'name')])");
    public SelenideElement brandName = $x("(//*[contains(@formcontrolname, 'brandId')])");
    public SelenideElement size = $x("(//*[contains(@formcontrolname, 'packageSize')])");
    public SelenideElement productCategory = $x("(//*[contains(@formcontrolname, 'productCategoryId')])");
    public SelenideElement productCategoryDigestive = $x("//*[contains(text(), 'Digestive')]");
    public SelenideElement productCode = $x("(//*[contains(@formcontrolname, 'code')])");

    public SelenideElement managersButton = $x("//*[contains(text(), ' Managers ')]");
    public SelenideElement tableWithInfoAboutAllManagers = $x("//*[contains(@class, 'ant-table-thead ng-star-inserted')]");
    public SelenideElement tableWithInfoAboutCreatedManager = $x("//*[contains(@class,'ant-table-tbody ng-star-inserted')]");
    public SelenideElement addManagerButton = $x("//*[contains(text(),'Add manager')]");
    public SelenideElement popupWithAddNewManager = $x("//*[contains(@class, 'ant-drawer-wrapper-body')]");
    public SelenideElement managerName = $x("(//*[contains(@formcontrolname, 'name')])");
    public SelenideElement managerSurname = $x("(//*[contains(@formcontrolname, 'surname')])");
    public SelenideElement managerEmail = $x("(//*[contains(@formcontrolname, 'email')])");
    public SelenideElement managerPhone = $x("(//*[contains(@formcontrolname, 'phone')])");

}
