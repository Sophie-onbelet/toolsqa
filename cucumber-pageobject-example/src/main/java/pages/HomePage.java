package pages;

import driver.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    @FindBy(css = "[class=\"card mt-4 top-card\"]")
    public List <WebElement> cards;

    public HomePage() {
        PageFactory.initElements(Driver.browser,this.getClass());
    }

    public void clickCard(String cardTitle) {
        getCard(cardTitle).click();
    }

    public WebElement getCard(String cardTitle) {
        for (WebElement card: cards) {
            if (card.getText().equals(cardTitle)) return card;
        }
        return null;
    }

}
