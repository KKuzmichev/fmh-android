package ru.iteco.fmhandroid.iu.steps;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.iu.elements.NewsElements;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static org.hamcrest.core.IsNot.not;

public class NewsSteps {
    NewsElements News = new NewsElements();

    public void isNewsScreen() {
        Allure.step("Проверить, что это экно новостей");
        News.newsScreen.check(matches(isDisplayed()));
    }

    public void sortNews() {
        Allure.step("Нажать кнопку сортировки новостей");
        News.sort.perform(click());
    }

    public void filterNews() {
        Allure.step("Нажать кнопку фильтрации");
        News.filter.perform(click());
    }

    public void editNews() {
        Allure.step("Нажать кнопку редактирования");
        News.edit.perform(click());
    }

    public void newsExpand() {
        Allure.step("Развернуть новость");
        News.title.perform(click());
        News.description.check(matches(isDisplayed()));
    }

    public void newsRollUp() {
        Allure.step("Свернуть новость");
        News.titleRollUp.perform(click());
        News.descriptionRollUp.check(matches(not(isDisplayed())));
    }

    public void isFilterScreen() {
        Allure.step("Проверить, что это окно новостей");
        News.filterScreen.check(matches(isDisplayed()));
    }

    public void selectFilterCategory(String text) {
        Allure.step("Выбрать категорию фильтрации");
        News.category.perform(click());
        News.category.perform(replaceText(text));
    }

    public void dateStart(String date) {
        Allure.step("Ввод начальной даты публикации");
        News.dateStart.perform(replaceText(date));
    }

    public void dateEnd(String date) {
        Allure.step("Ввод конечной даты публикации");
        News.dateEnd.perform(replaceText(date));
    }
    public void applyNews() {
        Allure.step("Подтверждение фильтрации новостей");
        News.applyNews.perform(click());
    }

    public void cancelNews() {
        Allure.step("Отмена фильтрации новостей");
        News.cancelNews.perform(click());
    }
}

