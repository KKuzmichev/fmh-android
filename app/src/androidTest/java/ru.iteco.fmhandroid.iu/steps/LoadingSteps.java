package ru.iteco.fmhandroid.iu.steps;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.iu.elements.LoadingElements;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

public class LoadingSteps {
    LoadingElements Loading = new LoadingElements();

    public void checkLoading() {
        Allure.step("Проверка отображения элементов загрузки");
        Loading.splashScreen.check(matches(isDisplayed()));
        Loading.splashText.check(matches(isDisplayed()));
    }
}
