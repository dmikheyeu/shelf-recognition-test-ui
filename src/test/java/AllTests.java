import Pages.MainPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AllTests extends MainPage {

    @Test
    @DisplayName("Login via Admin")
    public void loginViaAdmin() {
        openSite();
        entersUsernameAndPassword();
    }
}
