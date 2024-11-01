import com.microsoft.playwright.Page;

public class AccountsPage {
    private Page page;

    public AccountsPage(Page page) {
        this.page = page;
    }

    private String accountsOverviewLink = "text=Accounts Overview";

    public void navigateToAccounts() {
        page.click(accountsOverviewLink);
    }

    public boolean isBalanceDisplayed() {
        return page.isVisible("div[id='accountTable']");
    }
}
