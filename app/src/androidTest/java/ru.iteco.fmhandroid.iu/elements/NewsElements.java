package ru.iteco.fmhandroid.iu.elements;

import androidx.test.espresso.ViewInteraction;
import ru.iteco.fmhandroid.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static ru.iteco.fmhandroid.iu.utils.Utils.withIndex;

public class NewsElements {
    public ViewInteraction newsScreen = onView(withId(R.id.news_list_swipe_refresh));
    public ViewInteraction sort = onView(withId(R.id.sort_news_material_button));
    public ViewInteraction filter = onView(withId(R.id.filter_news_material_button));
    public ViewInteraction edit = onView(withId(R.id.edit_news_material_button));
    public ViewInteraction title = onView(withIndex(withId(R.id.news_item_title_text_view), 0));
    public ViewInteraction description = onView(withIndex(withId(R.id.news_item_description_text_view),0));
    public ViewInteraction titleRollUp = onView(withIndex(withId(R.id.news_item_title_text_view), 0));
    public ViewInteraction descriptionRollUp = onView(withIndex(withId(R.id.view_news_item_image_view), 0));
    public ViewInteraction filterScreen = onView(withId(R.id.filter_news_title_text_view));
    public ViewInteraction category = onView(withId(R.id.news_item_category_text_auto_complete_text_view));
    public ViewInteraction dateStart = onView(withId(R.id.news_item_publish_date_start_text_input_edit_text));
    public ViewInteraction dateEnd = onView(withId(R.id.news_item_publish_date_end_text_input_edit_text));
    public ViewInteraction applyNews = onView(withId(R.id.filter_button));
    public ViewInteraction cancelNews = onView(withId(R.id.cancel_button));
}
