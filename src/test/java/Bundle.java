import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Bundle {
	
	private static AppiumDriver<MobileElement> driver;

	public static void main(String[] args) {
		try {
			System.out.println("Application Started...");
			openodaReorder();
			}catch(Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.getStackTrace();

			}
	}

	private static void openodaReorder() throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "-Nexus 5 API 29");
		caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability("appPackage", "com.bundle.billable_hours_app");
		caps.setCapability("appActivity", "com.bundle.billable_hours_app.MainActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AppiumDriver<MobileElement>(url, caps);

		System.out.println("Application Started");
		
		Thread.sleep(1000);

		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]").click();
		Thread.sleep(10000);
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.EditText").sendKeys("test.csv");
		driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]").click();
		
		
		System.out.println("Done");
}


}
