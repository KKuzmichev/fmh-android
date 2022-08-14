package ru.iteco.fmhandroid.iu.elements;

import androidx.test.espresso.ViewInteraction;
import ru.iteco.fmhandroid.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static ru.iteco.fmhandroid.iu.utils.Utils.withIndex;

public class NewsControlPanelElements {
    public ViewInteraction controlPanelScreen = onView(withText("Control panel"));
    public ViewInteraction controlPanelView = onView(withId(R.id.news_list_recycler_view));
    public ViewInteraction sort = onView(withId(R.id.sort_news_material_button));
    public ViewInteraction filter = onView(withId(R.id.filter_news_material_button));
    public ViewInteraction filterScreen = onView(withId(R.id.filter_news_title_text_view));
    public ViewInteraction create = onView(withId(R.id.add_news_image_view));
    public ViewInteraction activeNews = onView(withId(R.id.filter_news_active_material_check_box));
    public ViewInteraction notActiveNews = onView(withId(R.id.filter_news_inactive_material_check_box));
    public ViewInteraction deleteButton = onView(withIndex(withId(R.id.delete_news_item_image_view),0));
    public ViewInteraction editButton = onView(withId(R.id.edit_news_item_image_view));
    public ViewInteraction title = onView(withIndex(withId(R.id.news_item_title_text_view),0));
    public ViewInteraction status = onView(withIndex(withId(R.id.news_item_published_text_view),0));
    public ViewInteraction description = onView(withIndex(withId(R.id.news_item_description_text_view), 0));
    public ViewInteraction descriptionRollUp = onView(withIndex(withId(R.id.news_item_description_text_view), 0));
    public ViewInteraction checkboxActive = onView(withId(R.id.filter_news_active_material_check_box));
    public ViewInteraction checkboxNotActive = onView(withId(R.id.filter_news_inactive_material_check_box));
    public ViewInteraction saveButton = onView(withId(R.id.save_button));
    public ViewInteraction cancelButton = onView(withId(R.id.cancel_button));
    public ViewInteraction filterButton = onView(withId(R.id.filter_button));
    public ViewInteraction popUpOk = onView(withText("OK"));
    public ViewInteraction popUpCancel = onView(withText("CANCEL"));
    public ViewInteraction emptyFieldsWarning = onView(withText("Fill empty fields"));
    public ViewInteraction tryAgainFieldsWarning = onView(withText("Saving failed. Try again later"));

    public ViewInteraction creatingScreen = onView(withText("Creating"));
    public ViewInteraction category = onView(withId(R.id.news_item_category_text_auto_complete_text_view));
    public ViewInteraction createTitle = onView(withId(R.id.news_item_title_text_input_edit_text));
    public ViewInteraction createDescription = onView(withId(R.id.news_item_description_text_input_edit_text));
    public ViewInteraction date = onView(withId(R.id.news_item_publish_date_text_input_edit_text));
    public ViewInteraction time = onView(withId(R.id.news_item_publish_time_text_input_edit_text));

    public ViewInteraction editingScreen = onView(withText("Editing"));
    public ViewInteraction editStatus = onView(withId(R.id.switcher));
}
