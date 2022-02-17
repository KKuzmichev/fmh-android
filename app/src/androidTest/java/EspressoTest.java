import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.core.AllOf.allOf;

import androidx.test.espresso.NoMatchingViewException;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import junit.framework.AssertionFailedError;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import steps.AuthSteps;
import steps.MainScreenSteps;

public class EspressoTest {
    private final AuthSteps authSteps = new AuthSteps();
    private final MainScreenSteps mainScreenSteps = new MainScreenSteps();

    @Rule
    public ActivityScenarioRule<ru.iteco.fmhandroid.ui.AppActivity> activityRule =
            new ActivityScenarioRule<>(ru.iteco.fmhandroid.ui.AppActivity.class);


    @Before
    public void auth() {
        sleep(10000); //wait splash screen
        checkAuth();
    }

    @Test
    public void loginTest() {
//        sleep(10000); //wait splash screen
//        authSteps.checkScreen();
//
//        authSteps.enterLoginAndPassword();
//
//        authSteps.checkLoginAndPassword();
//
//        authSteps.clickOnEnterBtn();

        onView(withText("Новости")).check(matches(isDisplayed()));
//        sleep(30000); //todo remove
    }

    private void checkAuth() {
        try {
            mainScreenSteps.checkProfileIcon();
        }
        catch (AssertionError afe) {
            login();
        }
    }

    private void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void login() {
        authSteps.checkScreen();

        authSteps.enterLoginAndPassword();

        authSteps.checkLoginAndPassword();

        authSteps.clickOnEnterBtn();

        sleep(3000);
        mainScreenSteps.checkProfileIcon();
    }
}
