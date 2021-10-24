package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ManagerPageElements {
    public SelenideElement firstEnterPasswordAsManager = $x("//*[contains(@placeholder,'Enter password')]");
    public SelenideElement repeatEnterPasswordAsManager = $x("//*[contains(@placeholder,'Repeat your password')]");
    public SelenideElement shelfRecognitionIcon = $x("//*[contains(text(),' Shelf Recognition ')]");
    public SelenideElement saveButton = $x("//*[contains(text(),' Save ')]");
}