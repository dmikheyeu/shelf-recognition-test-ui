package services;

import page.GmailPageElements;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class Gmail {

    GmailPageElements gmailPageElements = new GmailPageElements();

    @Step("Open Gmail")
    public void acceptInviteFromGmail() {
        open("https://mail.google.com/mail/u/0/#inbox");
        gmailPageElements.userNameField.click();
        gmailPageElements.userNameField.setValue("mid@unicsoft.com");
        gmailPageElements.nextButton.click();
        gmailPageElements.userPasswordField.click();
        gmailPageElements.userPasswordField.setValue("QwertY14");
        gmailPageElements.nextButton.click();
        $("#gb > div.gb_Fd.gb_Wd.gb_Md > div.gb_Ed.gb_Wc.gb_Xc > div.gb_nc > div > a > img")
                .should(appear).shouldBe(enabled);
        gmailPageElements.inboxButton.shouldHave().isDisplayed();
        gmailPageElements.gmailButton.shouldHave().isDisplayed();
        gmailPageElements.unreadMessage.click();
        String urlInviteCode = gmailPageElements.invitationCode.getText();
        open(urlInviteCode);
    }
}
