package Pages;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidTestHelper {

	private static AndroidTestHelper instance;

	private AndroidDriver<AndroidElement> driver;

	private AndroidTestHelper() {
		try {
			driver = createDriver();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@BeforeSuite
	private AndroidDriver<AndroidElement> createDriver() throws MalformedURLException {

		File f = new File("src/test/java");
		File fs = new File(f, "203.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "GalaxyDemo");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> androidDriver = new AndroidDriver<AndroidElement>(
				new URL("http://127.0.0.1:4723/wd/hub"), cap);
		androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		return androidDriver;
	}

	// @BeforeClass(alwaysRun = true)

	public static AndroidTestHelper getInstance() {
		if (instance == null) {
			instance = new AndroidTestHelper();
		}

		return instance;
	}

	public AndroidDriver<AndroidElement> getDriver() {
		return driver;
	}

	public void swipeToUp(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);
	}

	public void swipeToDown(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		System.out.println(width);
		System.out.println(height);

		driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);
	}

	public void swipeToLeft(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);

		// bigger driver.swipe(width -10, height / 2, width / 4, height / 2,
		// during);

	}

	public void swipeToRight(int during) {
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
		// bigger driver.swipe(10, height / 2, width* 3/4+10, height / 2,
		// during);
	}

	/**
	 * Always remember to quit
	 */
	@AfterSuite
	public void tearDownAppium() {
		driver.quit();
	}

	public WebDriverWait createDriverWait() {
		return new WebDriverWait(driver, 30);
	}
}
