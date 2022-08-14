package ru.iteco.fmhandroid.iu.steps;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.iu.elements.QuotesElements;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static org.hamcrest.core.IsNot.not;

public class QuotesSteps {
    QuotesElements Quotes = new QuotesElements();

    public void openQuotes() {
        Allure.step("Открыть раздел цитат");
        Quotes.quotes.perform(click());
        Quotes.quotesScreen.check(matches(isDisplayed()));
    }

    public void quotesExpand() {
        Allure.step("Развернуть цитату");
        Quotes.title.perform(click());
        Quotes.description.check(matches(isDisplayed()));
    }

    public void quotesRollUp() {
        Allure.step("Свернуть цитату");
        Quotes.titleRollUp.perform(click());
        Quotes.descriptionRollUp.check(matches(not(isDisplayed())));
    }
}
