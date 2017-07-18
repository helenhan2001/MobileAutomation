package Pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	private AndroidDriver<AndroidElement> driver;

	public HomePage(AndroidDriver<AndroidElement> driver) {
		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/login_button")
	private MobileElement buttonLogin;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/email_text_input")
	private MobileElement email;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/password_text_input")
	private MobileElement password;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/login_button")
	private MobileElement homeLogin;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/text_view")
	private MobileElement meditationNowNumber;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_logo")
	private MobileElement logo;

	@AndroidFindBy(className = "android.view.View")
	private MobileElement map;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/image_view_add_friend")
	private MobileElement addFriend;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sydney Olympic Park, Australia']")
	private MobileElement nearby;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Thich Nhat Hanh']")
	private MobileElement groupOne;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Insight Community']")
	private MobileElement groupTwo;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Beginner's Mind\"]")
	private MobileElement groupThree;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Women Meditate Worldwide']")

	private MobileElement groupFour;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Community']")
	private MobileElement community;

	@AndroidFindBy(id = "com.spotlightsix.zentimerlite2:id/button_announcement_close")
	private MobileElement closeAnnouns;

	public void homeLogin() {

		buttonLogin.click();
	}

	public void email() {
		email.sendKeys("your login Name");
	}

	public void password() {
		password.sendKeys("your login password");
	}

	public void login() {
		homeLogin.click();

	}

	public boolean isNumberCorrect() {
		String numberString = meditationNowNumber.getText();
		String sub_str = " meditating now";
		String number_str = ",";
		String numberStr = numberString.replace(sub_str, "");

		int numberNow = Integer.parseInt(numberStr.replaceAll(number_str, ""));
		if (numberNow > 1000) // our app should always have more than 1000 users
								// online at same time
			return true;
		else
			return false;
	}

	public boolean isElementCorrect(String result) {
		return false;
	}

	public boolean verifyLogo() {
		if (logo.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyMap() {
		if (map.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyAddFriend() {
		if (addFriend.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean isGroupOneExist() {
		return elementExists(groupOne);
	}

	public boolean isGroupTwoExist() {
		return elementExists(groupTwo);
	}

	public boolean isGroupThreeExist() {
		return elementExists(groupThree);
	}

	public boolean isGroupFourExist() {
		return elementExists(groupFour);
	}

	public boolean isCommunityExist() {
		return elementExists(community);
	}

	public boolean isNearbyExist() {
		return elementExists(nearby);
	}

	public boolean verifyNearby() {
		if (nearby.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyGroupOne() {
		if (groupOne.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyGroupTwo() {
		if (groupTwo.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyGroupThree() {
		if (groupThree.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyGroupFour() {
		if (groupFour.isDisplayed())
			return true;
		else
			return false;
	}

	public boolean verifyCommunity() {
		if (community.isDisplayed())
			return true;
		else
			return false;
	}

	public void clickCloseAnnouns() {

		closeAnnouns.click();
	}

	public void waitElemetPresent(MobileElement element, int timeoutSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);

		wait.until(ExpectedConditions.invisibilityOf(element));

	}

	public boolean elementExists(MobileElement element) {
		return element.isDisplayed();
		 	}
}
