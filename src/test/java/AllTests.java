import Pages.InitPage;
import Pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AllTests extends MainPage {

    InitPage initPage = new InitPage();

    @Test
    @DisplayName("A to B Test")
    public void fullFlow() {
        openSite();
        entersUsernameAndPasswordAsAdmin();
        initPage.addCustomersPage.createNewCustomer();
        initPage.addCustomersPage.addProductForCustomers();
        initPage.addCustomersPage.createNewManager();
        initPage.gmail.acceptInviteFromGmail();
        initPage.managerFlow.createPasswordFromManager();
        initPage.employeeFlow.createNewEmployee();
        initPage.gmail.acceptInviteFromGmail();
    }
}