package screens;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static org.hamcrest.core.AllOf.allOf;

import android.view.View;
import android.widget.FrameLayout;

import androidx.test.espresso.ViewInteraction;

import com.google.android.material.textfield.TextInputEditText;

import ru.iteco.fmhandroid.R;

public class AuthScreen {

    protected ViewInteraction loginInput() {
        return onView(
                allOf(
                        isAssignableFrom(TextInputEditText.class),
                        withParent(
                                allOf(
                                        isAssignableFrom(FrameLayout.class),
                                        withParent(withId(R.id.login_text_input_layout))
                                ))
                )
        );
    }

    protected ViewInteraction passwordInput() {
        return onView(
                allOf(
                        isAssignableFrom(TextInputEditText.class),
                        withParent(
                                allOf(
                                        isAssignableFrom(FrameLayout.class),
                                        withParent(withId(R.id.password_text_input_layout))
                                ))
                )
        );
    }

    protected ViewInteraction enterBtn() {
        return onView(withId(R.id.enter_button));
    }
}
