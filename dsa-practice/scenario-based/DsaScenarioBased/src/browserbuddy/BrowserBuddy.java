package browserbuddy;

import java.util.Stack;

public class BrowserBuddy {
	private Stack<BrowserTab> closedTabs = new Stack<>();
    private BrowserTab activeTab;

    public void openNewTab() {
        activeTab = new BrowserTab();
        System.out.println("New tab opened");
    }

    public void closeTab() {
        if (activeTab != null) {
            closedTabs.push(activeTab);
            activeTab = null;
            System.out.println("Tab closed");
        }
    }

    public void restoreTab() {
        if (!closedTabs.isEmpty()) {
            activeTab = closedTabs.pop();
            System.out.println("Tab restored");
        } else {
            System.out.println("No tabs to restore");
        }
    }

    public BrowserTab getActiveTab() {
        return activeTab;
    }

    public static void main(String[] args) {
        BrowserBuddy browser = new BrowserBuddy();

        browser.openNewTab();
        BrowserTab tab = browser.getActiveTab();

        tab.visit("google.com");
        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();
        tab.back();
        tab.forward();

        browser.closeTab();
        browser.restoreTab();

        System.out.println("Current Page: " +
                browser.getActiveTab().getCurrentPage());
    }

}
