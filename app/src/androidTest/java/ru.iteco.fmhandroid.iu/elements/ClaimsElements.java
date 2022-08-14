package ru.iteco.fmhandroid.iu.elements;

import androidx.test.espresso.ViewInteraction;
import ru.iteco.fmhandroid.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.allOf;

public class ClaimsElements {
    public ViewInteraction claimsScreen = onView(withText("Claims"));
    public ViewInteraction openFilter = onView(withId(R.id.filters_material_button));
    public ViewInteraction create = onView(withId(R.id.add_new_claim_material_button));
    public ViewInteraction closeClaim = onView(withId(R.id.close_image_button));
    public ViewInteraction openClaim = onView(withId(R.id.claim_list_card));
    public ViewInteraction saveButton = onView(withId(R.id.save_button));
    public ViewInteraction cancelButton = onView(withId(R.id.cancel_button));
    public ViewInteraction popUpOk = onView(withText("OK"));
    public ViewInteraction popUpCancel = onView(withText("CANCEL"));
    public ViewInteraction emptyFieldsWarning = onView(withText("Fill empty fields"));

    public ViewInteraction filterScreen = onView(withId(R.id.claim_filter_dialog_title));
    public ViewInteraction open = onView(withId(R.id.item_filter_open));
    public ViewInteraction inProgress = onView(withId(R.id.item_filter_in_progress));
    public ViewInteraction executed = onView(withId(R.id.item_filter_executed));
    public ViewInteraction cancelled = onView(withId(R.id.item_filter_cancelled));
    public ViewInteraction applyClaims = onView(withId(R.id.claim_list_filter_ok_material_button));
    public ViewInteraction cancelClaims = onView(withId(R.id.claim_filter_cancel_material_button));

    public ViewInteraction creatingScreen = onView(withText("Creating"));
    public ViewInteraction createTitle = onView(withId(R.id.title_edit_text));
    public ViewInteraction createExecutor = onView(withId(R.id.executor_drop_menu_auto_complete_text_view));
    public ViewInteraction createDate = onView(withId(R.id.date_in_plan_text_input_edit_text));
    public ViewInteraction createTime = onView(withId(R.id.time_in_plan_text_input_edit_text));
    public ViewInteraction createDescription = onView(withId(R.id.description_edit_text));

    public ViewInteraction editButton = onView(withId(R.id.edit_processing_image_button));
    public ViewInteraction editingScreen = onView(withText("Editing"));
    public ViewInteraction editTitle = onView(withId(R.id.title_edit_text));
    public ViewInteraction editExecutor = onView(withId(R.id.executor_drop_menu_auto_complete_text_view));
    public ViewInteraction editDate = onView(withId(R.id.date_in_plan_text_input_edit_text));
    public ViewInteraction editTime = onView(withId(R.id.time_in_plan_text_input_edit_text));
    public ViewInteraction editDescription = onView(withId(R.id.description_edit_text));
    public ViewInteraction settingButton = onView(withId(R.id.status_processing_image_button));
    public ViewInteraction statusButtonTakeToWork = onView(withText("Take to work"));
    public ViewInteraction statusButtonCancel = onView(withText("Cancel"));
    public ViewInteraction statusButtonToExecute = onView(withText("To execute"));
    public ViewInteraction commentForExecution = onView(withId(R.id.editText));
    public ViewInteraction fieldComment = onView(allOf(withHint("Comment"),withParent(withParent(withId(R.id.comment_text_input_layout)))));
    public ViewInteraction addComment = onView(withId(R.id.add_comment_image_button));
    public ViewInteraction editComment = onView(withId(R.id.edit_comment_image_button));
    public ViewInteraction blockComment = onView(withId(R.id.all_claims_cards_block_constraint_layout));
    public ViewInteraction claimStatusInProgress = onView(allOf(withHint("In progress"),withParent(withParent(withId(R.id.status_label_text_view)))));
    public ViewInteraction claimStatusCancel = onView(allOf(withHint("Canceled"),withParent(withParent(withId(R.id.status_label_text_view)))));
    public ViewInteraction claimStatusToExecute = onView(allOf(withHint("To execute"),withParent(withParent(withId(R.id.status_label_text_view)))));
}

