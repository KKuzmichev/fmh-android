package ru.iteco.fmhandroid.iu.elements;

import androidx.test.espresso.ViewInteraction;
import ru.iteco.fmhandroid.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

public class LoadingElements {
    public ViewInteraction splashScreen = onView(withId(R.id.splash_screen_circular_progress_indicator));
    public ViewInteraction splashText = onView(withId(R.id.splashscreen_text_view));
}
