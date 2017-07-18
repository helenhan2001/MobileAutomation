package Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TimerPage extends AbstractPage {

	private AndroidDriver<AndroidElement> driver;

	public TimerPage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/tab_timer")
	private MobileElement timerBtn;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/timer_help")
	private MobileElement timerHelp;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='TIMER']")
	private MobileElement timerLable;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='PRESETS']")
	private MobileElement timerPresets;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Starting bell']")
	private MobileElement timerBell;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/icon")
	private MobileElement timerIcon;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/configuration_representation")
	private MobileElement timerConfig;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/start_icon")
	private MobileElement timerStart;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/tab_timer")
	private MobileElement timerTab;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Meditation']")
	private MobileElement meditationText;

	// @AndroidFindBy(id ="com.spotlightsix.zentimerlite2:id/preset_name")
	// private MobileElement meditationText;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/countdown")
	private MobileElement countDown;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/play_pause")
	private MobileElement playPause;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/finish_early")
	private MobileElement finishEarly;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='COMPLETED']")
	private MobileElement completedText;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='DONE']")
	private MobileElement doneText;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/time_elapsed")
	private MobileElement timeElapsed;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/count")
	private MobileElement count;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image")
	private MobileElement image;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/count_supplement")
	private MobileElement supplement;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/progress")
	private MobileElement peopleProgress;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/toolbar_exit")
	private MobileElement exitThanksPeople;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/thank")
	private MobileElement thanksPeopleBtn;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/done")
	private MobileElement doneTimer;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='PRESETS']")
	private MobileElement presetsBtn;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/name")
	private MobileElement presetsTimer;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/dont_log")
	private MobileElement dontLog;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/interval_bells_container")
	private MobileElement bellContainer;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/duration_container")
	private MobileElement durationContainer;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/ambient_sound_container")
	private MobileElement soundContainer;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/ending_bell_container")
	private MobileElement endBellContainer;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/toolbar_back")
	private MobileElement toolBarBack;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/toolbar_title")
	private MobileElement toolBarTitle;

	//
	// @AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/ambient_image")
	//
	// private List<MobileElement> MobileElements;
	//
	// private MobileElement ambientImageThree;

	// @AndroidFindBy(className = "android.widget.ImageView")
	// private MobileElements ambientImageThree.;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/save")
	private MobileElement saveImageBtn;

	public void clickTimerBtn() {
		timerBtn.click();
	}

	public void clickFinishEarly() {
		finishEarly.click();
	}

	public void timerStart() {
		timerStart.click();
	}

	public boolean verifyTimerhelp() {
		if (timerHelp.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyMeditationText() {
		if (meditationText.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyCountDown() {
		if (countDown.isDisplayed())
			return true;
		else
			return false;
	}

	public void timerPause() {
		playPause.click();
	}

	public boolean verifyTimerLable() {

		if (timerLable.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyTimerPresets() {
		if (timerPresets.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyTimerBell() {

		if (timerBell.isDisplayed())
			return true;
		else
			return false;

	}

	public boolean verifyTimerIcon() {
		if (timerIcon.isDisplayed())
			return true;
		else
			;
		return false;

	}

	public boolean verifyTimerConfig() {
		if (timerConfig.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyCompleteText() {
		if (completedText.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickDone() {
		doneText.click();
	}

	public boolean verifyTimeElapsed() {
		if (timeElapsed.isEnabled())
			return true;
		else
			return false;
	}

	public boolean verifyCount() {
		waitElemetPresent(count, 300);
		if (count.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyImage() {

		if (image.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifySupplement() {
		if (supplement.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickPeople() {
		peopleProgress.click();
	}

	public void clickExitThanksPeople() {

		exitThanksPeople.click();

	}

	public void clickThanksPeopleBtn() {

		thanksPeopleBtn.click();

	}

	public boolean verifyThanksPeopleBtn() {

		if (thanksPeopleBtn.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickTimerDone() {
		doneTimer.click();
	}

	public void clickPresets() {
		presetsBtn.click();
	}

	public void clickPresetsTimer() {
		presetsTimer.click();
	}

	public void clickDontLog() {
		dontLog.click();
	}

	public void clickBellContainer() {
		bellContainer.click();
	}

	public void clickDurationcContainer() {
		durationContainer.click();
	}

	public void clickSoundContainer() {
		soundContainer.click();
	}

	public void clickEndBellContainer() {
		endBellContainer.click();
	}

	public void clickToolBarBack() {
		toolBarBack.click();
	}

	public boolean verifyToolBarTitle() {

		if (toolBarTitle.isDisplayed())
			return true;
		else
			return false;
	}

	// public void selectImageThree() {
	// ambientImageThree.click();
	// }

	public void clickSaveBtn() {
		saveImageBtn.click();
	}

	public void waitElemetPresent(MobileElement element, int timeoutSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);

		wait.until(ExpectedConditions.invisibilityOf(element));

	}
}
