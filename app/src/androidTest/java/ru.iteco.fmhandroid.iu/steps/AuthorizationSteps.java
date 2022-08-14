package ru.iteco.fmhandroid.iu.steps;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.iu.elements.Authorization;

import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

public class AuthorizationSteps {
    Authorization Auth = new Authorization();

    public void isAuthorizationScreen() {
        Allure.step("Проверить, что это экно авторизации");
        Auth.authScreen.check(matches(isDisplayed()));
    }

    public void loginInputField(String login) {
        Allure.step("Заполнить поле логин");
        Auth.login.check(matches(isEnabled()));
        Auth.login.perform(replaceText(login));
    }

    public void passwordInputField(String password) {
        Allure.step("Заполнить поле пароль");
        Auth.password.check(matches(isEnabled()));
        Auth.password.perform(replaceText(password));
    }

    public void buttonClick() {
        Allure.step("Нажать на кнопку Войти");
        Auth.signInButton.perform(click());
    }

    public void checkEmpty() {
        Allure.step("Предупреждение о недопустимости пустых полей");
        Auth.empty.check(matches(isDisplayed()));
    }
    public void checkWrong() {
        Allure.step("Предупреждение о неверных данных");
        Auth.wrong.check(matches(isDisplayed()));
    }
}
