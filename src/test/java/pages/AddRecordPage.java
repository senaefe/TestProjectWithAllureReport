package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class AddRecordPage extends BasePage {

    private SelenideElement addButton = $("#addNewRecordButton");
    private SelenideElement firstNameInput = $("#firstName");
    private SelenideElement lastNameInput = $("#lastName");
    private SelenideElement emailInput = $("#userEmail");
    private SelenideElement ageInput = $("#age");
    private SelenideElement departmentInput = $("#department");
    private SelenideElement salaryInput = $("#salary");
    private SelenideElement submitButton = $("#submit");

    public AddRecordPage(String pageUrl) {
        super(pageUrl);
    }

    public void clickAddButton() {
        addButton.click();
    }

    public boolean isRegistrationFormDisplayed() {
        return firstNameInput.shouldBe(visible).isDisplayed();
    }

    public void enterFirstName(String firstName) {
        firstNameInput.setValue(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameInput.setValue(lastName);
    }

    public void enterEmail(String email) {
        emailInput.setValue(email);
    }

    public void enterAge(String age) {
        ageInput.setValue(age);
    }

    public void enterSalary(String salary) {
        salaryInput.setValue(salary);
    }
    public void enterDepartment(String department) {
        departmentInput.setValue(department);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void clickEditButtonForRecord(String firstName, String lastName) {
        SelenideElement editButton = $(By.xpath("//div[contains(@class, 'rt-tr-group') and contains(.,'" + firstName + "') and contains(.,'" + lastName + "')]//span[@title='Edit']")).scrollTo();
        editButton.click();
    }

    public String getAddFirstName(String firstName, String lastName) {
        return $(By.xpath("//div[@role='row' and contains(.,'" + firstName + "') and contains(.,'" + lastName + "')]//div[@class='rt-td'][1]")).getText();
    }

    public String getAddedLastName(String firstName, String lastName) {
        return $(By.xpath("//div[@role='row' and contains(.,'" + firstName + "') and contains(.,'" + lastName + "')]//div[@class='rt-td'][2]")).getText();
    }
}
