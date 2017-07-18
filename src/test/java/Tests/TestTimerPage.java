package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.AndroidTestHelper;
import Pages.TimerPage;

public class TestTimerPage {
	AndroidTestHelper helper;
	TimerPage page;

	public TestTimerPage() {
		helper = AndroidTestHelper.getInstance();
		page = new TimerPage(helper.getDriver());
	}

	@Test(priority = 8)
	public void testTimerElements() throws Throwable {

		page.clickTimerBtn();
		Assert.assertTrue(page.verifyTimerBell(), "Insight Timer bell not correctly");
		Assert.assertTrue(page.verifyTimerConfig(), "Insight Timer Config not correctly");
		Assert.assertTrue(page.verifyTimerhelp(), "Insight Timer help not correctly");
		Assert.assertTrue(page.verifyTimerIcon(), "Insight Timer Icon not correctly");
		Assert.assertTrue(page.verifyTimerLable(), "Insight Timer Lable not correctly");
		Assert.assertTrue(page.verifyTimerPresets(), "Insight Timer presets not correctly");

	}

	@Test(priority = 9)
	public void testTimerContainer() throws Throwable {

		page.clickDurationcContainer();
		page.clickToolBarBack();
		page.clickBellContainer();
		page.clickToolBarBack();

		page.clickSoundContainer();
		Assert.assertTrue(page.verifyToolBarTitle(), "Insight Timer Tool Bar Title not correctly");
		helper.getDriver().findElementsById("com.spotlightsix.zentimerlite2:id/ambient_image").get(3).click();
		// page.selectImageThree();

		page.clickSaveBtn();

		page.clickEndBellContainer();
		page.clickToolBarBack();

	}

	@Test(priority = 10)
	public void testTimerStart() throws Throwable {

		page.timerStart();
		Thread.sleep(5000);
		Assert.assertTrue(page.verifyCountDown(), "Insight Timer count down not correctly");
		Assert.assertTrue(page.verifyMeditationText(), "Insight Timer Meditation text not correctly");
	}

	@Test(priority = 11)
	public void testTimerPasuet() throws Throwable {

		page.timerPause();
		Assert.assertTrue(page.verifyCountDown(), "Insight Timer count down not correctly");
		Assert.assertTrue(page.verifyMeditationText(), "Insight Timer Meditation text not correctly");
	}

	@Test(priority = 12)
	public void testFinishEarly() throws Throwable {

		page.clickFinishEarly();
		Assert.assertTrue(page.verifyCompleteText(), "Insight Timer COMPLETE text not correctly");
		Assert.assertTrue(page.verifyTimeElapsed(), "Insight Timer Time Elapsed not correctly");

	}

	@Test(priority = 13)
	public void testTimerDone() throws Throwable {

		page.clickDone();
		// .assertTrue(page.verifyCount(), "Insight Timer count display not
		// correctly");
		Assert.assertTrue(page.verifyImage(), "Insight Timer Image display not correctly");
		Assert.assertTrue(page.verifySupplement(), "Insight Timer Supplement display not correctly");

	}

	@Test(priority = 14)
	public void testPeople() throws Throwable {

		page.clickPeople();
		Assert.assertTrue(page.verifyThanksPeopleBtn(), "Insight Timer Thanks people button display not correctly");

	}

	// @Test(priority = 14)
	// public void testExitThanksPeople() throws Throwable {
	//
	// page.clickExitThanksPeople();
	// // Assert.assertTrue(page.verifyCount(), "Insight Timer count display
	// // not correctly");
	// Assert.assertTrue(page.verifyImage(), "Insight Timer Image display not
	// correctly");
	// Assert.assertTrue(page.verifySupplement(), "Insight Timer Supplement
	// display not correctly");
	//
	// }

	@Test(priority = 15)
	public void testThanksPeople() throws Throwable {

		page.clickThanksPeopleBtn();
		page.clickExitThanksPeople();

		Assert.assertTrue(page.verifyImage(), "Insight Timer Image display not correctly");
		Assert.assertTrue(page.verifySupplement(), "Insight Timer Supplement display not correctly");
		Thread.sleep(30);
	}

	@Test(priority = 16)
	public void testDoneTimer() throws Throwable {

		page.clickTimerDone();
		Thread.sleep(300);
		Assert.assertTrue(page.verifyTimerBell(), "Insight Timer bell not correctly");
		Assert.assertTrue(page.verifyTimerConfig(), "Insight Timer Config not correctly");
		Assert.assertTrue(page.verifyTimerhelp(), "Insight Timer help not correctly");
		Assert.assertTrue(page.verifyTimerIcon(), "Insight Timer Icon not correctly");
		Assert.assertTrue(page.verifyTimerLable(), "Insight Timer Lable not correctly");
		Assert.assertTrue(page.verifyTimerPresets(), "Insight Timer presets not correctly");

	}

	@Test(priority = 17)
	public void testPresets() throws Throwable {

		page.clickPresets();
		page.clickPresetsTimer();
		page.timerStart();
		Thread.sleep(5000);
		page.timerPause();
		page.clickFinishEarly();
		page.clickDontLog();
		page.clickExitThanksPeople();
		// Assert.assertTrue(page.verifyTimerBell(), "Insight Timer bell not
		// correctly");
		// Assert.assertTrue(page.verifyTimerConfig(), "Insight Timer Config not
		// correctly");
		//// Assert.assertTrue(page.verifyTimerhelp(), "Insight Timer help not
		// correctly");
		// Assert.assertTrue(page.verifyTimerIcon(), "Insight Timer Icon not
		// correctly");
		// Assert.assertTrue(page.verifyTimerLable(), "Insight Timer Lable not
		// correctly");
		// Assert.assertTrue(page.verifyTimerPresets(), "Insight Timer presets
		// not correctly");
	}

}
