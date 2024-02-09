package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object MainMenuPage {
    val customClicks: Matcher<View> by lazy { withId(R.id.custom_clicks_nav_item) }
}