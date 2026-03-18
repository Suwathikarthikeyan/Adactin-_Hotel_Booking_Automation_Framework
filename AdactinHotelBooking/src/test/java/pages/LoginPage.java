package pages;

import org.openqa.selenium.By;
import base.BaseTest;

public class LoginPage extends BaseTest {

    By username = By.id("username");
    By password = By.id("password");
    By loginBtn = By.id("login");

    public void login() {
        type(username, "Suwathikarthikeyan10");
        type(password, "5M1L63");
        click(loginBtn);
    }
}