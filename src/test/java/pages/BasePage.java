package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import utils.PropertyManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BasePage {

    protected String fullUrl;
    private PropertyManager propertyManager = new PropertyManager();
    private static final Logger logger = LoggerFactory.getLogger(BasePage.class);

    public BasePage(String pageUrl) {
        this.fullUrl = propertyManager.getProperty("APP_URL") + pageUrl;
        logger.info("Navigating to URL: " + this.fullUrl);
    }

    public void open() {
        Selenide.open(this.fullUrl);
    }

    public String getUrl() {
        return WebDriverRunner.getWebDriver().getCurrentUrl();
    }

    public String getBaseUrl() {
        return propertyManager.getProperty("APP_URL");
    }
}





