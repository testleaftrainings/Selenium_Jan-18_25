Framework
---------
 How Framework Build
 -------------------
    Brain Strom Session 
        -> 1. Look for existing framework with the organ... or  check peer team.
        -> 2. Look for open source framework 
        -> 3. Develop own framework

        1. Plan --> What IDE , What language(version), Tools  and library, Design pattern
        2. Design --> 
        3. Write Implementataion.(Build)



Framework(Makaia)
-----------------
    packages --> base, pages, testcases, utils
        base --> Base class (Common test step for all the testcase)
        pages --> design each webpages and elements actions
        testcases --> testcase flow
        utils --> readexcel



How to Explain the Framework
----------------------------
    part-1 (High level overview of what kind of tools and library)
    --------------------------------------------------------------
        Hybird framework
        design pattern - POM
        Project ManageMent - Maven
        Selenium - To interact with Browser based application
        TestNG - To Control the execution flow
        Cucumber - For BDD Execution
        Apache Poi - To interact to microsoft application like (word, excel ,..)
        commons-io - To handle files
        extent report - to generate the custom dashboard in html
        Git - used for version Control

    part-2 (Components)
    -------------------
    Browser(Interface) - Declare the functionalities/actions of browser like start the browser, locateElement, getTitle, close, quit,....frame, window, alert, ............
    Element(Interface) - Declare the functionalities/actions of WebElement to pass input, click, getText, verify, dropdown,.....
    Locators(Enum) - which help to choose the locators type quickly and also to avoid the type error and case mismatches
    DiverInstance - where the implementation of driver and wait by ThreadLocal for Thread safety and also provided setter and getter to access in secure way.
    Reporter(Abstract class)- Report related test steps are written to start report, start testcase, to attch snapshot and generate report in custom dashnoard as html format
    SeleniumBase(Class) - This is heart of the framework, Wrapper class, For the major implements are written here which actions related to Browser, WebElement. The reason we can the class as wrapper is the method which are defined in the Selenium base are selenium functionalities actions along with that we have implement the reporter and exception to make as wrapper methods.
    ProjecSpecificMethod(Class) -  Common test steps for all the testcases (DataProvider, preCon.., postCon...)
    Pages - each webpage is designed 
    testcase - testcase flow is deisgned.

    part-3(Execution flow )
    -----------------------
    @BeforeSuite --> startReport() in Reporter class
        @BeforeTest --> setValues() in testcase class
            @BeforeClass --> setUpClass() in AbstarctTestNGCucumberTests and startTestCase() in Reporter
                @DataProvider --> fetchData() in PSM class
                    @BeforeMethod --> preCondition() in PSM class
                        @Test --> testcase class
                    @AfterMethod --> postCondition() in PSM class
                @AfterClass --> tearDownClass() in AbstractTestNGCucumberTests
            @AfterTest --> NA
        @AferSuite--> endResult() in Reporter





















