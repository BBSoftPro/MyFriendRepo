package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers

object FriendsListPage {

    val mainManuBtn: Matcher<View> by lazy { ViewMatchers.withContentDescription("Open navigation drawer") }
    fun nameMatcher(name: String): Matcher<View> {
        println(ViewMatchers.withText(name))
        return Matchers.allOf(
            ViewMatchers.withId(R.id.tv_name),
            ViewMatchers.withText(name)
        )
    }

}