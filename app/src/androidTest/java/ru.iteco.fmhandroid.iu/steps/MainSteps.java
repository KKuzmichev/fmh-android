package ru.iteco.fmhandroid.iu.steps;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.iu.elements.MainElements;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

public class MainSteps {
    MainElements Main = new MainElements();

    public void clickButtonAllNews(){
        Allure.step("Переход на вкладку ВСЕ НОВОСТИ");
        Main.allNews.perform(click());
        Main.newsScreen.check(matches(isDisplayed()));
    }

    public void clickButtonAllClaims(){
        Allure.step("Переход на вкладку ВСЕ ЗАЯВКИ");
        Main.allClaims.perform(click());
        Main.claimsScreen.check(matches(isDisplayed()));
    }

    public void openClaims() {
        Allure.step("Переход в меню вкладки Заявки");
        Main.mainMenuButton.perform(click());
        Main.claims.perform(click());
        Main.claimsScreen.check(matches(isDisplayed()));
    }

    public void openNews() {
        Allure.step("Переход в меню вкладки Новости");
        Main.mainMenuButton.perform(click());
        Main.news.perform(click());
        Main.newsScreen.check(matches(isDisplayed()));
    }

    public void openAbout() {
        Allure.step("Переход в меню вкладки О приложении");
        Main.mainMenuButton.perform(click());
        Main.about.perform(click());
        Main.aboutScreen.check(matches(isDisplayed()));
    }
    public void logOut() {
        Allure.step("Выход из приложения");
        Main.profile.perform(click());
        Main.logOut.perform(click());
        Main.authScreen.check(matches(isDisplayed()));
    }
}
