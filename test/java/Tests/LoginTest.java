import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testUserLogin() {
        LoginPage loginPage = new LoginPage(page);
        loginPage.navigate();
        loginPage.login("john", "demo");
        assert(loginPage.isLoginSuccessful());
    }
}
