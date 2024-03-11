Tools:

- Download Android Studio. (Link: https://developer.android.com/studio)
- Download IntelliJ IDEA. (Community Edition) (Link: https://www.jetbrains.com/es-es/idea/download)
- Download Java 11 and JDK. (Link: https://www.oracle.com/java/technologies/downloads/#java11)
- Create an Emulator from Android Studio (Google Pixel 5 device) with Android v12.
- Download Appium Server GUI. (Link: https://github.com/appium/appium-desktop/releases)
- Set environment variables for Appium Server GUI, for example:

ANDROID_HOME = C:\Users\Alexis\AppData\Local\Android\Sdk

JAVA_HOME = C:\Program Files\Java\jdk-11

Execution:

- Open IntelliJ and open the mobile-ui project, then it will start indexing the necessary libraries.
- Navigate to class GetStarted.feature (Path: mobile-ui/src/test/resources/Features/GetStarted/GetStarted.feature)
- Right click on the Scenario and Click Run option.

Reports:

- To view the execution reports navigate and open following files:

mobileUi-report.html - Path: mobile-ui/reports-cucumber/mobileUi-report.html

mobileUi-report.pdf - Path: mobile-ui/reports-cucumber/mobileUi-report.pdf

They contain the same information, presented in two different formats.