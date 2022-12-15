package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomePageSteps {
    HomePage homePage = new HomePage();

    @Then("Click the card named {}")
    public void clickCardTitled(String cardTitle) {
        homePage.clickCard(cardTitle);
    }
}
