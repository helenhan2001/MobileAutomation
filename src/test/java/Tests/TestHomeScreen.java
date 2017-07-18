package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.AndroidTestHelper;
import Pages.HomePage;

public class TestHomeScreen {
	AndroidTestHelper helper;
	HomePage page;

	public TestHomeScreen() {
		helper = AndroidTestHelper.getInstance();
		page = new HomePage(helper.getDriver());
	}

	@BeforeClass
	public void Login() throws Throwable {

		page.homeLogin();
		page.email();
		page.password();
		page.login();

	}

	@Test(priority = 0)
	public void testLogin() throws Throwable {
		// page.waitLogo();
		page.clickCloseAnnouns();
		Assert.assertTrue(page.verifyLogo(), "Insight Timer login not correctly");
		// Assert.assertTrue(page.isNumberCorrect(),"Insight Timer meditation
		// number less than 1000");

	}

	@Test(priority = 1)
	public void testHomeScreenRefresh() throws Throwable {
		// AndroidTestHelper helper = AndroidTestHelper.getInstance();

		for (int i = 1; i < 5; i++) {
			helper.swipeToDown(1000);

			Assert.assertTrue(page.verifyMap(), "Insight Timer Home Screen map not dipslay correctly");
			Assert.assertTrue(page.isNumberCorrect(), "Insight Timer Home Screen online number not dipslay correctly");
			Assert.assertTrue(page.verifyLogo(), "Insight Timer Home Screen Logo not dipslay correctly");
		}

	}

	@Test(priority = 2)
	public void testNearby() throws Throwable {
		// helper.swipeToUp(1000);
		for (int i = 1; i < 5; i++) {
			helper.swipeToUp(1000);

			if (page.isNearbyExist()) {
				break;
			}
		}

		Assert.assertTrue(page.verifyNearby(), "Insight Timer Home Screen Nearby not display correctly");
	}

	@Test(priority = 3)
	public void testGroupOne() throws Throwable {

		for (int i = 1; i < 5; i++) {
			helper.swipeToUp(1000);

			if (page.isGroupOneExist()) {
				break;
			}
		}

		Assert.assertTrue(page.verifyGroupOne(), "Insight Timer Home Screen GroupOne not dipslay correctly");

	}

	@Test(priority = 4)
	public void testGroupTwo() throws Throwable {

		for (int i = 1; i < 5; i++) {
			helper.swipeToUp(1000);

			if (page.isGroupTwoExist()) {
				break;
			}
		}

		Assert.assertTrue(page.verifyGroupTwo(), "Insight Timer Home Screen GroupTwo not dipslay correctly");
	}

	@Test(priority = 5)
	public void testGroupThree() throws Throwable {

		for (int i = 1; i < 5; i++) {
			helper.swipeToUp(1000);

			if (page.isGroupThreeExist()) {
				break;
			}
		}

		Assert.assertTrue(page.verifyGroupThree(), "Insight Timer Home Screen GroupThree not dipslay correctly");
	}

	@Test(priority = 6)
	public void testGroupFour() throws Throwable {

		for (int i = 1; i < 5; i++) {
			helper.swipeToUp(1000);

			if (page.isGroupFourExist()) {
				break;
			}
		}

		Assert.assertTrue(page.verifyGroupFour(), "Insight Timer Home Screen GroupFour not dipslay correctly");
	}

	@Test(priority = 7)
	public void testCommunity() throws Throwable {

		for (int i = 1; i < 5; i++) {
			helper.swipeToUp(1000);

			if (page.isCommunityExist()) {
				break;
			}
		}

		Assert.assertTrue(page.verifyCommunity(), "Insight Timer Home Screen Community not dipslay correctly");
		helper.swipeToUp(1000);
		helper.swipeToUp(1000);
		Thread.sleep(100);
		helper.swipeToUp(1000);
		Thread.sleep(100);
		helper.swipeToUp(1000);
		Thread.sleep(100);
		helper.swipeToUp(1000);
		Thread.sleep(100);
		helper.swipeToUp(1000);
	}

}
