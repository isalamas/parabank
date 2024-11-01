import org.junit.jupiter.api.Test;

public class AccountsBalanceTest extends BaseTest {

    @Test
    public void testAccountBalanceCheck() {
        LoginPage loginPage = new LoginPage(page);
        loginPage.navigate();
        loginPage.login("john", "demo");

        AccountsPage accountsPage = new AccountsPage(page);
        accountsPage.navigateToAccounts();
        assert(accountsPage.isBalanceDisplayed());
    }
}
