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
    @DisplayName("Login via Manager/Employee")
    public void loginViaManager() {
        openSite();
        initPage.managerFlow.entersUsernameAndPasswordViaManager();
    }
}