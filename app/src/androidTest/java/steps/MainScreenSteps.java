package steps;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import screens.MainScreen;

public class MainScreenSteps extends MainScreen {

    public void checkProfileIcon() {
        profileIcon().check(matches(isDisplayed()));
    }
}
