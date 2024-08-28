package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class ClickMeButtonPage extends BasePage {

    private final SelenideElement buttonsMenu = $(By.xpath("//span[text()='Buttons']"));
    private final SelenideElement clickMeButton = $(By.xpath("//button[text()='Click Me']"));
    private final SelenideElement dynamicClickMessage = $("#dynamicClickMessage");

    public ClickMeButtonPage(String pageUrl) {
        super(pageUrl);
    }

    public void navigateToButtonsPage() {
        buttonsMenu.shouldBe(Condition.visible).click();
    }

    public void clickClickMeButton() {
        clickMeButton.shouldBe(Condition.visible, Condition.enabled).click();
    }

    public String getDynamicClickMessage() {
        return dynamicClickMessage.getText();
    }
}
