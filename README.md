# Bridegestone Tire Size Count

POM Test automation framework to count all tire sizes for all the wheel sizes on Bridgestone website.
## Framework

This is a POM framework that uses Selenium WebDriver, Java as a programming language and TestNG to maintain the automated tests. Maven is used in this framework as a build tool to manage dependencies.

## Utils
There are 3 java classes in the folder Utils:

- Driver - Used to setup the WebDriver
- PropertyReader - Used to read properties from config.properties file
- WaitForHelper - Implements wait methods for Selenium WebDriver


## Driver
WebDriverManager dependency was added to the pom.xml to handle the management (i.e. download, setup) of the driver. 

In the Driver class, Chrome Driver is setup with WebDriverManager: 

*WebDriverManager.chromedriver().setup();*

Chrome Options are used to make the browser headless, to optimize test execution time.


-Notes: 

*@BeforeMethod* annotation is used with the *setup()* method in the Driver class so that ChromeDriver will be set up before each test method.

*@AfterMethod* annotation is used with the *tearDown()* method in the Driver class so that the ChromeDriver will be tear down after each test method.



## Pages
Every Page class contains the locators to the web elements present on a web page and the action methods for the web elements.

There is a BasePage class with some common methods that can be used in other Pages. 

To use the BasePage methods a Page class will need to extend BasePage class (*i.e. public class TireSizePage extends BasePage*)

## Tests
The tests of this framework are in the class BaseTest.

 *@Test* annotation is used for each test so that they can be executed as part of the test suite
 A *priority* was added to each test so they are executed accordingly.

## Tests Parallel execution
To achieve parallel execution of the test methods ThreadLocal class of Java is implemented. 

In the Driver class, I created a static ChromeDriver as a ThreadLocal and set the driver to its object which will be accessible throughout the tests:

*protected static ThreadLocal<ChromeDriver> driver = new ThreadLocal<>();*

*WebDriverManager.chromedriver().setup();*

*driver.set(new ChromeDriver(getChromeOptions()));*


I then added parallel and thread-count in the testng.xml file, to specify that all tests will be running in parallel:

*<suite name="All Test Suite" parallel="methods" thread-count="9">*

Note: The thread-count value can be modified according to the tests we want to run in parallel.

After running the last test, a Excel file is created in following location inside the project: 
*test-output/TIRE-SIZE-RESULTS.xlsx*

## Running the tests
1. Download project to your local machine.
2. Import Project as existing maven project. 
3. Once you have opened the project, in terminal use *'mvn clean'*
4. Now use *'mvn test'* to run test cases.

Note: Make sure you have installed Maven and set PATH to Maven in your environment prior to running the test with the command above.

Another option is to execute the tests by running the BaseTest class in the project directory.

