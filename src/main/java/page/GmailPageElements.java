package page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class GmailPageElements {
    public SelenideElement userNameField = $x("(//*[contains(@id, 'identifierId')])");
    public SelenideElement nextButton = $x("(//*[contains(text(), 'Далее')])");
    public SelenideElement userPasswordField = $x("(//*[contains(@autocomplete, 'current-password')])");
    public SelenideElement inboxButton = $x("(//*[contains(@class, 'nU n1')])");
    public SelenideElement gmailButton = $x("(//*[contains(text(), 'Gmail')])");
    public SelenideElement unreadMessage = $x("(//*[contains(@class, 'zA zE')])");

    public ElementsCollection unreadMessages = $$(By.xpath("(//*[contains(@class, 'zA zE')]"));

    public SelenideElement firstInvitationCode = $x("(//*[contains(@data-saferedirecturl, " +
            "'https://www.google.com/url?q=https://dev.marketcapp.ai/accept-invite?invitation-code')])");
    public ElementsCollection secondInvitationCode = $$("(//*[contains(@data-saferedirecturl, " +
            "'https://www.google.com/url?q=https://dev.marketcapp.ai/accept-invite?invitation-code')])");
}