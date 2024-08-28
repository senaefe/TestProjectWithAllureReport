package tests;

import driver.DriverFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.NoSuchSessionException;

public class BaseTest {
    // Diğer kodlar...

    @AfterSuite
    public void tearDown() {
        try {
            DriverFactory.close();
        } catch (NoSuchSessionException e) {
            System.out.println("Session is already closed.");
        }
    }

    @AfterTest
    public void clearCookies() {
        try {
            DriverFactory.clearCookies();
        } catch (NoSuchSessionException e) {
            System.out.println("Session is already closed.");
        }
        DriverFactory.close();
    }
}
