package com.havenlife;

import com.microsoft.playwright.Page;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuotesTest {
    @Disabled
    public void checkQuotesTitle() {
        Quote quote = new Quote();
        quote.goToQuotesPage();
        assertEquals("Estimate Your Life Insurance Policy Rate | Haven Life", quote.getTitle());
    }

    @Test
    public void checkStateInput() {
        Quote quote = new Quote();
        quote.goToQuotesPage();
        quote.selectAState("Alaska");
        quote.clickNext();
        assertEquals("Please provide more personal information.", quote.getHeadline());
        quote.selectGender("male");
        quote.dtOfBirth();
        quote.rateHealth();
    }
}
