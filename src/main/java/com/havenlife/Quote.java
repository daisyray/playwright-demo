package com.havenlife;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class Quote extends Utils{
    public void goToQuotesPage() {
        gotoUrl("quote-tool");
    }
    public String getHeadline() {
        return page.locator("#form__headline").textContent();
    }
    public void selectAState(String state) {
        page.locator("#select-state").selectOption(state);
    }

    public void clickNext() {
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
    }

    public void selectGender(String gender) {
        if(gender.equals("male")) {
            page.getByLabel("Man", new Page.GetByLabelOptions().setExact(true)).click(options);
        } else {
            page.getByLabel("Woman").click(options);
        }
    }
    public void dtOfBirth() {
        page.getByLabel("Date of birth").fill("1999-02-20");
    }
    public void rateHealth() {
        page.getByLabel(" Excellent ").click();
    }
}
