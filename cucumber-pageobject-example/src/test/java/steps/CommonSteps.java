package steps;

import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CommonSteps {

    @Before
    public void setup() {
        Driver.setup();
    }

    @After
    public void close() {
        Driver.quitDriver();
    }

    @Given("Navigate to {}")
    public void navigate(String url) {
        Driver.browser.get(url);
    }

    @And("Wait for {} seconds")
    public void waitFor(double seconds){
        try {Thread.sleep((long) (seconds* 1000L));}
        catch (InterruptedException ignored){}
    }
}
