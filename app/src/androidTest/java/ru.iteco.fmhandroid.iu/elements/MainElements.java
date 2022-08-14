package ru.iteco.fmhandroid.iu.elements;

import androidx.test.espresso.ViewInteraction;
import ru.iteco.fmhandroid.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

public class MainElements {
    public ViewInteraction mainMenuButton = onView(withId(R.id.main_menu_image_button));
    public ViewInteraction allNews = onView(withId(R.id.all_news_text_view));
    public ViewInteraction allClaims = onView(withId(R.id.all_claims_text_view));
    public ViewInteraction claims = onView(withText("Claims"));
    public ViewInteraction news = onView(withText("News"));
    public ViewInteraction about = onView(withText("About"));
    public ViewInteraction profile = onView(withId(R.id.authorization_image_button));
    public ViewInteraction logOut = onView((withText("Log out")));
    public ViewInteraction authScreen = onView(allOf(withText("Authorization")));
    public ViewInteraction newsScreen = onView(withId(R.id.news_list_swipe_refresh));
    public ViewInteraction claimsScreen = onView(withId(R.id.claim_list_swipe_refresh));
    public ViewInteraction aboutScreen = onView(withId(R.id.about_version_title_text_view));
}
