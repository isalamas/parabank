import com.microsoft.playwright.Page;

public class LoginPage {
    private Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    private String usernameInput = "input[name='username']";
    private String passwordInput = "input[name='password']";
    private String loginButton = "input[value='Log In']";

    public void navigate() {
        page.navigate("https://parabank.parasoft.com/parabank/index.htm");
    }

    public void login(String username, String password) {
        page.fill(usernameInput, username);
        page.fill(passwordInput, password);
        page.click(loginButton);
    }

    public boolean isLoginSuccessful() {
        return page.isVisible("text=Accounts Overview");
    }
}
