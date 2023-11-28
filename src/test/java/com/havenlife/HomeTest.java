package com.havenlife;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HomeTest {

    @Disabled
    public void checkTitle() {
        Home home = new Home();
        assertEquals("Life Insurance That's Actually Simple | Haven Life", home.gotoUrl(""));
    }
    @Disabled
    public void checkYourPriceLink() {
        Home home = new Home();
        home.gotoUrl("");
        Quote quote = home.clickOnCheckYourPrice();
        assertEquals("Getting a quote is a great first step to buying life insurance. We can help.", quote.getHeadline());

    }
}
