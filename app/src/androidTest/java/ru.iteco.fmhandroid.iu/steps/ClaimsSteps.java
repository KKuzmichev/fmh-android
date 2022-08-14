package ru.iteco.fmhandroid.iu.steps;

import android.os.SystemClock;
import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.iu.elements.ClaimsElements;

import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

public class ClaimsSteps {
    ClaimsElements Claims = new ClaimsElements();

    public void isClaimsScreen() {
        Allure.step("Проверить, что это экно заявок");
        Claims.claimsScreen.check(matches(isDisplayed()));
    }

    public void filter() {
        Allure.step("Открыть фильтр");
        Claims.openFilter.perform(click());
    }

    public void open() {
        Allure.step("Открытие заявки");
        Claims.openClaim.perform(click());
    }

    public void goBack() {
        Allure.step("Возврат из открытой заявки");
        Claims.closeClaim.perform(click());
    }

    public void isFilteringScreen() {
        Allure.step("Проверить, что это экно фильтрации заявок");
        Claims.filterScreen.check(matches(isDisplayed()));
    }

    public void openCheck() {
        Allure.step("Фильтрация заявок по критерию Открыта");
        Claims.open.perform(click());
    }

    public void inProgressCheck() {
        Allure.step("Фильтрация заявок по критерию В работе");
        Claims.inProgress.perform(click());
    }

    public void executedCheck() {
        Allure.step("Фильтрация заявок по критерию Выполнена");
        Claims.executed.perform(click());
    }

    public void cancelledCheck() {
        Allure.step("Фильтрация заявок по критерию Отмененные");
        Claims.cancelled.perform(click());
    }

    public void applyClaims() {
        Allure.step("Подтверждение фильтрации заявок");
        Claims.applyClaims.perform(click());
    }

    public void cancelClaims() {
        Allure.step("Отмена фильтрации заявок");
        Claims.cancelClaims.perform(click());
    }
    public void addNew() {
        Allure.step("Нажать кнопку добавления заявки");
        Claims.create.perform(click());
    }

    public void isCreatingScreen() {
        Allure.step("Проверить, что это окно создания заявки");
        Claims.create.perform(click());
        Claims.creatingScreen.check(matches(isDisplayed()));
    }

    public void enterTitle(String text) {
        Allure.step("Ввести заголовок");
        Claims.createTitle.perform(replaceText(text));
    }

    public void enterExecutor(String text) {
        Allure.step("Выбрать из списка ФИО исполнителя");
        Claims.createExecutor.perform(click());
        Claims.createExecutor.perform(replaceText(text));
    }

    public void enterDate(String text) {
        Allure.step("Ввести дату");
        Claims.createDate.perform(replaceText(text));
    }

    public void enterTime(String text) {
        Allure.step("Ввести время");
        Claims.createTime.perform(replaceText(text));
    }

    public void enterDescription(String text) {
        Allure.step("Ввести описание заявки");
        Claims.createDescription.perform(replaceText(text));
    }

    public void saveButton() {
        Allure.step("Нажать на кнопку сохранить");
        Claims.saveButton.perform(click());
        SystemClock.sleep(1500);
    }

    public void cancelButton() {
        Allure.step("Нажать на кнопку отменить");
        Claims.cancelButton.perform(click());
    }

    public void checkPopUpOk() {
        Allure.step("Проверить наличие всплывающей кнопки Ok");
        Claims.popUpOk.perform(click());
    }

    public void checkPopUpCancel() {
        Allure.step("Проверить наличие всплывающей кнопки Cancel");
        Claims.popUpCancel.perform(click());
    }

    public void checkEmpty() {
        Allure.step("Проверить уведомление о заполнении пустых полей");
        Claims.emptyFieldsWarning.check(matches(isDisplayed()));
    }

    public void isEditingScreen() {
        Allure.step("Проверить, что это окно редактирования заявки");
        Claims.editButton.perform(click());
        Claims.editingScreen.check(matches(isDisplayed()));
    }

    public void enterEditTitle(String title) {
        Allure.step("Ввести отредактированный текст заголовка");
        Claims.editTitle.perform(replaceText(title));
    }

    public void selectEditExecutor(String text) {
        Allure.step("Выбрать исполнителя заявки");
        Claims.editExecutor.perform(click());
        Claims.editExecutor.perform(replaceText(text));
    }

    public void enterEditDate(String text) {
        Allure.step("Ввести дату");
        Claims.editDate.perform(replaceText(text));
    }

    public void enterEditTime(String text) {
        Allure.step("Ввести время");
        Claims.editTime.perform(replaceText(text));
    }

    public void enterEditDescription(String text) {
        Allure.step("Ввести описание заявки");
        Claims.editDescription.perform(replaceText(text));
    }

    public void clickButtonSettings(){
        Allure.step("Нажать на кнопку Настройки");
        Claims.settingButton.perform(click());
    }

    public void clickButtonTakeToWork(){
        Allure.step("Изменение статуса заявки с Открыта на В работу");
        Claims.statusButtonTakeToWork.perform(click());
    }

    public void clickButtonCancel(){
        Allure.step("Изменение статуса заявки с Открыта на Отменена");
        Claims.statusButtonCancel.perform(click());
    }

    public void clickButtonToExecute(){
        Allure.step("Изменение статуса заявки с В работе на Выполнена");
        Claims.statusButtonToExecute.perform(click());
    }

    public void addCommentForExecute(){
        Allure.step("Добавить комментарий для выполненной заявки");
        Claims.commentForExecution.perform(clearText(), replaceText("Выполнена"));
    }

    public void clickButtonAddComment(){
        Allure.step("Нажать на кнопку Добавить комментарий");
        Claims.addComment.perform(click());
    }

    public void addToCommentField(){
        Allure.step("В поле Комментарий добавить комментарий");
        Claims.fieldComment.perform(clearText(), replaceText("Новый комментарий"));
    }

    public void clickButtonEditComment(){
        Allure.step("Нажать на кнопку Редактировать комментарий");
        Claims.editComment.perform(click());
    }

    public void checkBlockComment(){
        Allure.step("Проверить наличие блока с комментариями");
        Claims.blockComment.perform(click());
    }

    public void checkClaimStatusInProgress(){
        Allure.step("Проверить статус заявки В работу");
        Claims.claimStatusInProgress.check(matches(isDisplayed()));
    }

    public void checkClaimStatusCancel(){
        Allure.step("Проверить статус заявки Отменена");
        Claims.claimStatusCancel.check(matches(isDisplayed()));
    }

    public void checkClaimStatusToExecute(){
        Allure.step("Проверить статус заявки Выполнена");
        Claims.claimStatusToExecute.check(matches(isDisplayed()));
    }
}
