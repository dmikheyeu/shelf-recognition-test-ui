import Pages.InitPage;
import Pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AllTests extends MainPage {

    InitPage initPage = new InitPage();

    @Test
    @DisplayName("Login via Admin and created Customer and Manager")
    public void loginViaAdminAndCreatedCustomerAndManger() {
        openSite();
        entersUsernameAndPasswordViaAdmin();
        initPage.addCustomersPage.createNewCustomer();
        initPage.addCustomersPage.addProductForCustomers();
        initPage.addCustomersPage.createNewManager();
    }

    @Test
    @DisplayName("Open Gmail Post")
    public void acceptInviteFromGmail() {
        initPage.gmail.acceptInviteFromGmail();
    }

    @Test
    @DisplayName("Login as Manager/Employee")
    public void loginAsManager() {
        openSite();

    }

    @Test
    @DisplayName("A to B Test")
    public void fullFlow() {
//        openSite();
//        entersUsernameAndPasswordViaAdmin();
//        initPage.addCustomersPage.createNewCustomer();
//        initPage.addCustomersPage.addProductForCustomers();
//        initPage.addCustomersPage.createNewManager();
        initPage.gmail.acceptInviteFromGmail();
        initPage.managerFlow.createPasswordFromManager();
    }
}