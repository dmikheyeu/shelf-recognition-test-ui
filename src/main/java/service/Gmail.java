package service;

import io.qameta.allure.Step;
import page.GmailPageElements;

import static com.codeborne.selenide.Selenide.open;
import static service.MainPage.adminEmail;
import static service.MainPage.password;

public class Gmail {

    GmailPageElements gmailPageElements = new GmailPageElements();

    @Step("Open Gmail")
    public void acceptFirstInviteFromGmail() {
        open("https://mail.google.com/mail/u/0/#inbox");
        gmailPageElements.userNameField.click();
        gmailPageElements.userNameField.setValue(adminEmail);
        gmailPageElements.nextButton.click();
        gmailPageElements.userPasswordField.click();
        gmailPageElements.userPasswordField.setValue(password);
        gmailPageElements.nextButton.click();
        gmailPageElements.inboxButton.shouldHave().isDisplayed();
        gmailPageElements.gmailButton.shouldHave().isDisplayed();
        gmailPageElements.unreadMessage.click();
        String firstUrlInviteCode = gmailPageElements.firstInvitationCode.getText();
        open(firstUrlInviteCode);
    }

    @Step("Open Gmail")
    public void acceptSecondInviteFromGmail() {
        open("https://mail.google.com/mail/u/0/#inbox");
        gmailPageElements.inboxButton.shouldHave().isDisplayed();
        gmailPageElements.gmailButton.shouldHave().isDisplayed();
        gmailPageElements.unreadMessages.get(0).click();
        String secondUrlInviteCode = gmailPageElements.secondInvitationCode.get(1).getText();
        open(secondUrlInviteCode);
    }
}
