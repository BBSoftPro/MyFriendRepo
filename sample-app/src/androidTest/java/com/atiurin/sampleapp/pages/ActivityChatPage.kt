package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object ActivityChatPage {
    val toolbarTitle: Matcher<View> by lazy { withId(R.id.toolbar_title) }
    val textInput: Matcher<View> by lazy { withId(R.id.message_input_text) }
    val sendButton: Matcher<View> by lazy { withId(R.id.send_button) }
}