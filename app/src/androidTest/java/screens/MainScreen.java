package screens;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.ViewInteraction;

import ru.iteco.fmhandroid.R;

public class MainScreen {

    public ViewInteraction profileIcon() {
        return onView(withId(R.id.authorization_image_button));
    }

    public ViewInteraction missionIcon() {
        return onView(withId(R.id.our_mission_image_button));
    }
}
