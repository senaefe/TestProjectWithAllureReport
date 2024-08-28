package common;

import driver.DriverFactory;
import pages.ClickMeButtonPage;
import pages.AddRecordPage;

public class PageManager {
    public ClickMeButtonPage clickMePage;
    public AddRecordPage addRPage;

    public PageManager() {
        DriverFactory.initDriver();
        clickMePage = PageFactory.buildClickPage();
        addRPage = PageFactory.buildAddPage();
    }

    public void openPage(String pageName) {
        switch (pageName) {
            case "Elements":
                clickMePage.open();
                break;
            case "Webtables":
                addRPage.open();
                break;
        }
    }
}


