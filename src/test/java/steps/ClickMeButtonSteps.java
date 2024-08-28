package steps;

import common.PageManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import static org.assertj.core.api.Assertions.assertThat;

public class ClickMeButtonSteps {
    PageManager pageManager = new PageManager();

    @Step("Navigate to the {pageName} page")
    @Given("I navigate to the {string} page")
    public void iNavigateToThePage(String pageName) {
        pageManager.openPage(pageName);
    }

    @Step("Click on the {optionName} option")
    @When("I click on the {string} option")
    public void i_click_on_the_option(String optionName) {
        if (optionName.equals("Buttons")) {
            pageManager.clickMePage.navigateToButtonsPage();
        }
    }

    @Step("Verify that the {pageName} page is displayed")
    @When("the {string} page is displayed")
    public void the_page_is_displayed(String pageName) {
        if (pageName.equals("Buttons")) {
            String currentUrl = pageManager.clickMePage.getUrl();
            assertThat(currentUrl).contains("/buttons");
        }
    }

    @Step("Click the {buttonName} button")
    @When("I click the {string} button")
    public void iClickTheButton(String buttonName) {
        if (buttonName.equals("Click Me")) {
            pageManager.clickMePage.clickClickMeButton();
        }
    }

    @Step("Verify that the message {expectedMessage} is displayed")
    @Then("I should see the message {string} displayed")
    public void iShouldSeeTheMessageDisplayed(String expectedMessage) {
        String actualMessage = pageManager.clickMePage.getDynamicClickMessage();
        assertThat(actualMessage).isEqualTo(expectedMessage);
    }
}
