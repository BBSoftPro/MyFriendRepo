package com.atiurin.sampleapp.tests.espresso

import androidx.test.espresso.Espresso
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.pages.ActivityChatPage
import com.atiurin.sampleapp.pages.CustomClicksPage
import com.atiurin.sampleapp.pages.FriendsListPage
import com.atiurin.sampleapp.pages.MainMenuPage
import com.atiurin.sampleapp.tests.BaseTest
import com.atiurin.ultron.extensions.tap
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests : BaseTest() {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCase1() {
        val friendName = "Monica Geller"
        val message = "Hi Monica How are you?"
        with(FriendsListPage) {
            checkOnBoardPage()
            nameMatcher(friendName).tap()

            with(ActivityChatPage) {
                onView(toolbarTitle).check(matches(withText(friendName)))
                textInput.typeText(message)
                sendButton.tap()
                Espresso.pressBack()
                onView(withText(message)).check(matches(ViewMatchers.isDisplayed()))
            }
        }
    }

    @Test
    fun testCase2() {
        with(FriendsListPage) {
            checkOnBoardPage()
            mainManuBtn.tap()
            with(MainMenuPage) {
                customClicks.tap()
                with(CustomClicksPage) {
                    onView(selectorObject).check(matches(ViewMatchers.isDisplayed()))
                    rBTopLeft.tap()
                    rBTopCenter.tap()
                    rBTopRight.tap()
                    rBCenterRight.tap()
                    rBBottomRight.tap()
                    rBBottomCenter.tap()
                    rBBottomLeft.tap()
                    rBCenterLeft.tap()

                    assert(rBTopLeft.isChecked(3)) { "rB_top_left is marked" }
                    assert(rBTopCenter.isChecked(3)) { "rB_top_center is marked" }
                    assert(rBTopRight.isChecked(3)) { "rB_top_right is marked" }
                    assert(rBCenterRight.isChecked(3)) { "rB_center_right is marked" }
                    assert(rBBottomRight.isChecked(3)) { "rB_bottom_right is marked" }
                    assert(rBBottomCenter.isChecked(3)) { "rB_bottom_center is marked" }
                    assert(rBBottomLeft.isChecked(3)) { "rB_bottom_left is marked" }
                    assert(rBCenterLeft.isChecked(3)) { "rB_center_left is marked" }
                }
            }
        }
    }

    private fun checkOnBoardPage() {
        onView(withText("Friends")).check(matches(ViewMatchers.isDisplayed()))
    }
}