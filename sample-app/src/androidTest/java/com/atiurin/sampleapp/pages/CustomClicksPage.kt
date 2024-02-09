package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.atiurin.sampleapp.R
import org.hamcrest.Matcher

object CustomClicksPage {
    val selectorObject: Matcher<View> by lazy { withId(R.id.frameLayout) }
    val rBTopLeft: Matcher<View> by lazy { withId(R.id.rB_top_left) }
    val rBTopCenter: Matcher<View> by lazy { withId(R.id.rB_top_center) }
    val rBTopRight: Matcher<View> by lazy { withId(R.id.rB_top_right) }
    val rBCenterRight: Matcher<View> by lazy { withId(R.id.rB_center_right) }
    val rBBottomRight: Matcher<View> by lazy { withId(R.id.rB_bottom_right) }
    val rBBottomCenter: Matcher<View> by lazy { withId(R.id.rB_bottom_center) }
    val rBBottomLeft: Matcher<View> by lazy { withId(R.id.rB_bottom_left) }
    val rBCenterLeft: Matcher<View> by lazy { withId(R.id.rB_center_left) }
}