package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object FriendsListPage {

    val mainManuBtn: Matcher<View> by lazy { withContentDescription("Open navigation drawer") }
    fun nameMatcher(name: String): Matcher<View> {
        return Matchers.allOf(
            withId(R.id.tv_name),
            withText(name)
        )
    }

}