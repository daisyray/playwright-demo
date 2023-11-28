package com.havenlife;

import com.microsoft.playwright.*;

public class Utils {

    protected Page page;
    Locator.ClickOptions options;
    public Utils() {
        this.page = launchBrowser();
        this.options = new Locator.ClickOptions();
        options.setForce(true);
    }

    public Page launchBrowser() {
        Playwright playwright = Playwright.create();
        BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions();
        launchOptions.setHeadless(false);
        launchOptions.setSlowMo(50);
        Browser browser = playwright.chromium().launch(launchOptions);
        return browser.newPage();
    }

    public String gotoUrl(String trailingUrl) {
        if(trailingUrl==null || trailingUrl.isEmpty()){
            page.navigate("https://havenlife.com/");
            return page.title();
        }
        page.navigate("https://havenlife.com/" + trailingUrl);
        return page.title();
    }

    public String getTitle() {
        return page.title();
    }
}
