*Project overview file *

###What is selenium webdriver?###
>> Selenium WebDriver is a powerful open-source framework for automating web applications. 
It provides a programming interface to create and execute test cases. With Selenium WebDriver, you can interact with web browsers like Chrome, Firefox, Safari, etc., to perform various actions such as clicking buttons, filling forms, navigating between pages, and verifying content.

###What is POM?###
>> POM (Page Object Model) is a design pattern commonly used in test automation to enhance test maintenance and reduce code duplication. 
In POM, each web page in the application is represented by a separate class, and the interactions with the elements on that page are 
encapsulated within the class. This makes the test scripts more readable, maintainable, and modular.


###What is TestNg? and how we setup with selenium webdriver?###
>> TestNG (Test Next Generation) is a testing framework for Java designed to simplify a wide range of testing needs, including unit testing, integration testing, and end-to-end testing. It provides annotations to define test methods, configure test execution, and manage dependencies between test methods. 
TestNG is widely used in conjunction with Selenium WebDriver for test automation.

**************************************************************************************
###How we setup project for automation ?###

>>Here's a step-by-step guide on setting up a Selenium WebDriver project with the Page Object Model (POM) architecture:

**************************************************************************************

##1. Set Up Your Development Environment:##
**Install Java**: Make sure you have Java installed on your machine 
  
**1.1 Process for Java** :Installing Java on Windows and macOS involves a few simple steps. Here's a guide for each operating system:

*Installing Java on Windows*:

a. **Download Java:**
   - Visit the official Oracle website or adopt OpenJDK to download the latest version of Java.
   - Oracle JDK: [Oracle Java SE Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)

b. **Run the Installer:**
   - For Oracle JDK, run the downloaded installer (`.exe` file) and follow the installation wizard instructions.
   - For AdoptOpenJDK, run the downloaded installer and follow the prompts.

c. **Set Environment Variables:**
   - After installation, you may need to set the `JAVA_HOME` environment variable:
     - Right-click on "This PC" or "Computer" on your desktop or in File Explorer.
     - Select "Properties."
     - Click on "Advanced system settings" on the left.
     - Click the "Environment Variables" button.
     - Under "System Variables," click "New" to add a new variable:
       - Variable Name: `JAVA_HOME`
       - Variable Value: The path to your Java installation (e.g., `C:\Program Files\Java\jdk1.8.0_281`).

d. **Update PATH Variable:**
   - Find the "Path" variable in the same "Environment Variables" window (under "System Variables").
   - Click "Edit" and add the following to the end of the "Variable Value":
     - For Oracle JDK: `%JAVA_HOME%\bin`
     - For AdoptOpenJDK: `%JAVA_HOME%\bin`

e. **Verify Installation:**
   - Open a command prompt and run the following commands to verify the Java installation:
     ```bash
     java -version
     javac -version
     ```

*Installing Java on macOS*:

a. **Download Java:**
   - Visit the official Oracle website or adopt OpenJDK to download the latest version of Java.
   - Oracle JDK: [Oracle Java SE Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)
   - AdoptOpenJDK: [AdoptOpenJDK](https://adoptopenjdk.net/)

b. **Run the Installer:**
   - For Oracle JDK, run the downloaded DMG file and follow the installation instructions.
   - For AdoptOpenJDK, run the downloaded installer package and follow the prompts.

c. **Set Environment Variables (Optional):**
   - macOS usually sets the necessary environment variables automatically. However, if you need to set them manually, you can add the following lines to your shell profile file (e.g., `~/.bash_profile` or `~/.zshrc`):
     ```bash
     export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_281.jdk/Contents/Home  # Adjust the path to match your installation
     export PATH=$JAVA_HOME/bin:$PATH
     ```

d. **Verify Installation:**
   - Open a terminal and run the following commands to verify the Java installation:
     *java -version*
     *javac -version*  

**************************************************************************************
     
**1.2 Process for Java** : Install an Integrated Development Environment (IDE) like Eclipse.
*Install Eclipse on Windows*:

a. **Download Eclipse:**
   - Visit the official Eclipse download page: [Eclipse Downloads](https://www.eclipse.org/downloads/)
   - Choose the Eclipse IDE edition that fits your needs. For Java development, you can select "Eclipse IDE for Java Developers."
   - Click on the download link corresponding to your operating system (Windows).

b. **Download and Run the Installer:**
   - Once the download is complete, run the installer (it's usually an executable file with a name like `eclipse-inst-win64.exe`).
   - The installer will prompt you to select an installation type. Choose "Eclipse IDE for Java Developers" or another edition based on your requirements.

c. **Select Installation Folder:**
   - Choose the installation folder where Eclipse will be installed. The default location is usually fine for most users.

d. **Select Workspace:**
   - During installation, Eclipse will ask you to select a workspace. The workspace is the directory where your projects will be stored. You can choose the default location or specify a custom one.

e. **Install:**
   - Click the "Install" button to start the installation process. The installer will download and set up Eclipse based on your selections.

f. **Launch Eclipse:**
   - Once the installation is complete, you can launch Eclipse. You might find a shortcut on your desktop or in the Start menu. If not, navigate to the installation directory and run the `eclipse.exe` file.

g. **Configure Workspace:**
   - When you first launch Eclipse, it may ask you to select a workspace again. Choose the same workspace you selected during installation or pick a new one.

h. **Complete the Setup:**
   - Eclipse might ask you to choose a perspective. For Java development, select the "Java" perspective.

Now you should have Eclipse installed on your Windows machine. You can start creating Java projects and writing code in the IDE.

*Install Eclipse on macOS*:
The process on macOS is similar:

a. **Download Eclipse:**
   - Visit the official Eclipse download page: [Eclipse Downloads](https://www.eclipse.org/downloads/)
   - Choose the Eclipse IDE edition that fits your needs (e.g., "Eclipse IDE for Java Developers").

b. **Download and Run the Installer:**
   - Once the download is complete, open the downloaded DMG file.
   - Drag the Eclipse icon to your Applications folder.

c. **Launch Eclipse:**
   - Open Finder, go to the Applications folder, and double-click on the Eclipse icon.

d. **Configure Workspace:**
   - When you first launch Eclipse, it may ask you to select a workspace. Choose the location where your projects will be stored.

e. **Complete the Setup:**
   - Eclipse might ask you to choose a perspective. For Java development, select the "Java" perspective.

Now you should have Eclipse installed on your macOS machine. You can start using it for Java development by creating new projects and writing code.

**************************************************************************************

##2. Create a New Java Maven Project##

Creating a Maven project in Eclipse is a straightforward process. Here's a step-by-step guide:

### Steps to Create a Maven Project in Eclipse:

1. **Open Eclipse:**
   - Launch Eclipse IDE on your machine.

2. **Install the Maven Plugin (if not installed):**
   - Check if the Maven plugin is already installed. You can do this by going to "Help" > "Eclipse Marketplace" and searching for "m2e." If it's not installed, install the "Maven Integration for Eclipse" plugin.

3. **Create a New Maven Project:**
   - Go to "File" > "New" > "Other..."
   - In the "Select a wizard" dialog, expand the "Maven" category and select "Maven Project."
   - Click "Next."

4. **Select Project Location:**
   - Choose the location where you want to create your Maven project.
   - Check the option "Create a simple project (skip archetype selection)" and click "Next."

5. **Define Group ID and Artifact ID:**
   - In the "Define a Maven project" wizard, you need to provide Group ID and Artifact ID.
     - **Group ID:** It's usually in reverse domain format (e.g., `com.example`).
     - **Artifact ID:** It's the name of your project.
   - Fill in the required details and click "Finish."

6. **Update Project:**
   - Eclipse will create the basic structure of a Maven project. If it doesn't automatically update, right-click on the project in the "Project Explorer" and select "Maven" > "Update Project."

7. **Verify the Project:**
   - After the update is complete, you should see a `pom.xml` file in your project. This file contains Maven configuration and dependencies.

8. **Add Dependencies (Optional):**
   - Open the `pom.xml` file, and you can add dependencies by editing the `<dependencies>` section. Save the file, and Eclipse will automatically download the dependencies.

   ```xml
   <dependencies>
     <dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.8.0</version>
    <scope>test</scope>
</dependency>
</dependencies>
       <!-- Add other dependencies as needed -->
   </dependencies>
   ```

9. **Create Java Classes:**
   - Create your Java main classes in the `src/main/java` directory.
   - Create you jave test classes in the `src/test/java`

10. **Build the Project:**
    - Right-click on the project and select "Run As" > "Maven Build."
    - In the "Goals" field, enter `clean install` and click "Run." This will compile the code and run any tests.

11. **Run Java Application:**
    - Right-click on your Java class with the `main` method, select "Run As" > "Java Application."

**************************************************************************************

**3. Add Selenium WebDriver Dependencies:**
   - Download the Selenium WebDriver Java bindings from the official website (https://www.selenium.dev/downloads/).
   - Add the Selenium WebDriver JAR files to your project.

**4. Create Page Object Classes:**
   - For each web page in your application, create a separate class.
   - Define web elements as class variables and methods to interact with those elements.

```java
// Example Page Object class
public class LoginPage {
    WebDriver driver;
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginBtn");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
```

**5. Create Test Classes:**
   - Create separate test classes for each test scenario.
   - Instantiate the WebDriver, create objects of Page Object classes, and call their methods.

```java
// Example Test class
public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Initialize WebDriver (e.g., ChromeDriver)
        driver = new ChromeDriver();
    }

    @Test
    public void loginTest() {
        // Create an object of the LoginPage class
        LoginPage loginPage = new LoginPage(driver);

        // Perform login actions
        loginPage.enterUsername("yourUsername");
        loginPage.enterPassword("yourPassword");
        loginPage.clickLoginButton();

        // Add assertions or verifications as needed
        // e.g., Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser after each test
        driver.quit();
    }
}


###TestNG processs###

Here's a step-by-step guide on setting up TestNG with a project:

**1. Set Up Your Development Environment:**
   - Ensure you have Java installed on your machine.
   - Install an Integrated Development Environment (IDE) like Eclipse or IntelliJ.

**2. Create a New Java Project:**
   - Open your IDE and create a new Java project.

**3. Add Selenium WebDriver Dependencies (if not added previously):**
   - Download the Selenium WebDriver Java bindings from the official website (https://www.selenium.dev/downloads/).
   - Add the Selenium WebDriver JAR files to your project.

**4. Add TestNG Dependencies:**
   - Download the TestNG library from the official website (https://testng.org/doc/download.html) or add the dependency to your project using a build tool like Maven or Gradle.

   For Maven, add the following dependency to your `pom.xml` file:

   ```xml
   <dependencies>
       <dependency>
           <groupId>org.testng</groupId>
           <artifactId>testng</artifactId>
           <version>7.3.0</version> <!-- Use the latest version available -->
           <scope>test</scope>
       </dependency>
   </dependencies>
   ```

   For Gradle, add the following dependency to your `build.gradle` file:

   ```gradle
   testImplementation 'org.testng:testng:7.3.0' // Use the latest version available
   ```

**5. Create a TestNG XML File:**
   - TestNG uses XML configuration files to define test suites, test cases, and test methods. Create a `testng.xml` file in the root of your project.

   ```xml
   <!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
   <suite name="MyTestSuite">
       <test name="MyTest">
           <classes>
               <class name="com.example.MyTestClass"/>
           </classes>
       </test>
   </suite>
   ```

**6. Create Test Classes with TestNG Annotations:**
   - Annotate your test classes and test methods using TestNG annotations.

   ```java
   import org.testng.annotations.Test;

   public class MyTestClass {
       @Test
       public void myTestMethod() {
           // Your test logic goes here
           System.out.println("Executing myTestMethod");
       }
   }
   ```

**7. Run Your Tests:**
   - Right-click on your `testng.xml` file and select "Run As" > "TestNG Suite" in your IDE.
   - Alternatively, you can run the test classes directly by right-clicking on them and selecting "Run As" > "TestNG Test."




Desired capabilities for appium : 
 ```
{
  "platformName": "iOS",
  "appium:platformVersion": "16.6.1",
  "appium:automationName": "XCUITest",
  "appium:deviceName": "ChicMic’s iPhone (2)",
  "appium:bundleId": "com.cuesz.mobile",
  "appium:xcodeOrgId": "U9B8L2V4FL",
  "appium:xcodeSigningId": "iPhone Developer",
  "appium:udid": "00008101-000A58221104001E"
}
 ```









Command run for jenkins on mac

* Install the latest LTS version: >> brew install jenkins-lts
* Start the Jenkins service:  >> brew services start jenkins-lts
* Restart the Jenkins service: >> brew services restart jenkins-lts
* Update the Jenkins version: >> brew upgrade jenkins-lts



#Useful Links#
#link for appium help 
*https://blog.palo-it.com/en/how-do-you-run-appium-ios-tests-on-real-devices*

#Link for git#
https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html
