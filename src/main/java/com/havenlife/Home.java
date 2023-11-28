package com.havenlife;

public class Home extends Utils {
    public Quote clickOnCheckYourPrice() {
        Quote quote = new Quote();
         page.getByText("/quote-tool").click();
         return quote;
    }
}
