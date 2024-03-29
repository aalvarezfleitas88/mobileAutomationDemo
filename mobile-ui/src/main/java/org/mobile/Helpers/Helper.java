package org.mobile.Helpers;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.core.pages.BasePage;
import org.openqa.selenium.Dimension;

import static io.appium.java_client.touch.offset.PointOption.point;

public class Helper extends BasePage {
//The objective of this class is to develop functionalities
//that can be used throughout the framework as aids.

    public MobileElement scrollToElementByContainsText(String visibleText) {
        return (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator("new " +
                "UiScrollable(new UiSelector().scrollable(true).instance(0))." +
                "scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))"));
    }

    public static void waitElementWithAttempt(MobileElement element, int attemptsMaximums, int intervalSeconds) {
        for (int i = 0; i < attemptsMaximums; i++) {
            try {
                if (element.isDisplayed()) {
                    //If the element appears, the loop is terminated.
                    return;
                }
            } catch (org.openqa.selenium.NoSuchElementException | org.openqa.selenium.StaleElementReferenceException e) {
                // If the item does not appear or became stalked, print a message and wait before trying again.
                System.out.println("The item did not appear or became stalked. Retrying...");
                try {
                    Thread.sleep(intervalSeconds * 1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
        // If the maximum number of attempts is reached and the element still does not appear, throw an exception.
        throw new org.openqa.selenium.TimeoutException("The element did not appear after " + attemptsMaximums + " attempts.");
    }

    public void screenTapingUsingCoordinates(int widthATappear, int heightATappear) {
        Dimension dimension_screen = driver.manage().window().getSize();
        int height = dimension_screen.getHeight();
        int width = dimension_screen.getWidth();

        if(height >= heightATappear && width >= widthATappear){
            tapOnCoordinates(point(widthATappear, heightATappear));
        }
    }

    public void tapOnCoordinates(PointOption pointOption) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.tap(pointOption).perform();
    }
}
