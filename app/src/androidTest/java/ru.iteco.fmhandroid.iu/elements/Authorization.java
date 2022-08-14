package ru.iteco.fmhandroid.iu.elements;

import androidx.test.espresso.ViewInteraction;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.iu.utils.Utils;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.core.AllOf.allOf;

public class Authorization {
    public ViewInteraction authScreen = onView(allOf(withText("Authorization"), withParent(withParent(withId(R.id.nav_host_fragment)))));
    public ViewInteraction login = onView(allOf(withHint("Login"), withParent(withParent(withId(R.id.login_text_input_layout)))));
    public ViewInteraction password = onView(allOf(withHint("Password"), withParent(withParent(withId(R.id.password_text_input_layout)))));
    public ViewInteraction signInButton = onView(allOf(withHint("Login"), withParent(withParent(withId(R.id.login_text_input_layout)))));
    public ViewInteraction empty = onView(withText(R.string.empty_login_or_password)).inRoot(new Utils.ToastMatcher());
    public ViewInteraction wrong = onView(withText(R.string.wrong_login_or_password)).inRoot(new Utils.ToastMatcher());
}

