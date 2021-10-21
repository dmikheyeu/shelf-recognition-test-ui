package Pages;

import PagesElements.CustomersPageElements;
import PagesElements.GmailPageElements;
import PagesElements.MainPageElements;
import PagesElements.ManagerPageElements;

public class InitPage {

    public CustomersFlow addCustomersPage = new CustomersFlow();
    public Gmail gmail = new Gmail();
    public MainPage mainPage = new MainPage();
    public ManagerFlow managerFlow = new ManagerFlow();

    public CustomersPageElements customersPageElements = new CustomersPageElements();
    public GmailPageElements gmailPageElements = new GmailPageElements();
    public MainPageElements mainPageElement = new MainPageElements();
    public ManagerPageElements managerPageElements = new ManagerPageElements();
}
