package steps;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import screens.AuthScreen;

public class AuthSteps extends AuthScreen {
    private final String login = "login3";
    private final String password = "password3";

    public void checkScreen() {
        loginInput().check(matches(isDisplayed()));
        passwordInput().check(matches(isDisplayed()));
        enterBtn().check(matches(isDisplayed()));
    }

    public void enterLoginAndPassword() {
        loginInput().perform(click(), typeText(login), closeSoftKeyboard());
        passwordInput().perform(click(), typeText(password), closeSoftKeyboard());
    }

    public void checkLoginAndPassword() {
        loginInput().check(matches(withText(login)));
        passwordInput().check(matches(withText(password)));
    }

    public void clickOnEnterBtn() {
        enterBtn().perform(click());
    }
}
