package com.example.composebasics
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.navigation.testing.TestNavHostController
import androidx.test.core.app.ApplicationProvider
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.UiSelector
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.composebasics.MainActivity
import junit.framework.TestCase.assertTrue
import org.junit.runner.RunWith
//import com.servicetitan.work.navigation.NavigationActivity


class test {

    @get:Rule
    //val composeTestRule = createComposeRule()
    val composeTestRule = createAndroidComposeRule<MainActivity>()


    @Test
   fun PreviousButton() {
       composeTestRule.onNodeWithText("Previous").performClick()

    }
    }

