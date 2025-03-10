Week5.day1:

09:00 - 09:45 -> WebTable
09:45 - 10:30 -> TestNG Introduction 
10:30 - 10:55 -> BreakOut(15 mins)+Break(10 mins)
10:55 - 11:45 -> Sequential & Parallel Execution
11:45 - 12:15 -> BreakOut 


WebTable:

<table>- data name or information
<tbody>- table body
<tr> -table row data
<td> - table column data
<th> - table header


<table>
    <thead>
      <tr>  </tr>
      <tr>   </tr>
      </thead>

    <tbody>

    <tr>
      <td>
      <td>  
    </tr>
    <tr>
     <td>
     </tr>
   </tboby>

</table>       

TestNG

What is TestNG?

TestNG stands for "Test Next Generation."

TestNG- J unit and N unit

It is an open-source unit testing framework that's used to enhance the testing capabilities in software development.

It provides more advanced functionalities compared to the standard testing frameworks, such as grouping, sequencing, and parameterizing of tests.

Why do we need to use TestNG?

Flexibility in Configuration: Allows different ways to set up testing environments, making it suitable for various kinds of test scenarios.

Data-Driven Testing: Enables tests to be driven by external data sources such as Excel files.

Enhanced Reporting: Provides detailed reports on the outcomes of tests, which are crucial for debugging and development feedback.

How to use the TestNG framework?

Install TestNG Plugin: For Eclipse , you would need to install the TestNG plugin through the Eclipse's marketplace

Add Dependencies: Incorporate TestNG dependencies into your pom.xml.

What is a Plugin?

A plugin is a software add-on that is installed on a program to add a specific feature to an existing computer program. When a program supports plugins, it enables customization.

In the Eclipse, a plugin like TestNG can be installed to extend its capabilities to manage and run tests more effectively.

TestNG Features:

1)Supports multiple execution in Single Run

Definition: Allows multiple tests to be executed in a single command or action.

Use Case: When a comprehensive test suite has to be run.

2)Supports sequential and parallel execution

Definition: Tests can be run one after the other (sequentially) or simultaneously (in parallel) to reduce total test execution time.

Use Case: Useful in large projects to improve speed and efficiency of testing, especially when tests are independent.

3)Generates reports and provides the status of the execution

Definition: Automatically generates detailed reports after test execution that show which tests passed, failed, or skipped.

Use Case: Essential for analyzing test results, identifying bugs, and improving software quality.

4)Supports to configure execution using annotations and attributes

Definition: Offers annotations like @Test, @BeforeMethod, etc., to control test flow and configure test methods.

Use Case: To set up pre-conditions or clean-up actions, or to group and prioritize tests.

5)Supports multiple test data (data-driven testing)

Definition: Enables tests to run with different sets of data inputs for validation against multiple data scenarios.

Use Case: To ensure that the application behaves correctly with various inputs, enhancing test coverage.

6)Supports Cross-browser testing

Definition: Allows tests to be run across different web browsers to ensure compatibility.

Use Case: Essential for web applications to confirm consistent behavior and performance across multiple browsers.

7)Supports Assertion

Definition: Provides assertion capabilities to verify that the application behaves as expected.

Use Case: To validate the actual outcomes of test cases against expected outcomes.

8)Supports to rerun the failed test cases

Definition: Facilitates automatic rerun of tests that have failed in a test run.

Use Case: To isolate failures and ensure they are consistent and not due to transient issues or flakiness.

9)Supports to categorize the test cases using TestNG groups

Definition: Allows categorization of test cases into groups for selective test execution.

Use Case: To run a targeted subset of tests, like smoke, regression, or functional tests, without running the entire suite.

Steps to start with TestNG:

Convert normal script into a TestNG script:

*Remove static keyword from the main method

*Remove the input arguments(String[] args)

*Give a meaningful name to the method

*Add @Test on the top of the method

**Import from org.testng.annotations.

*Right click on the testcase Run as-> 1 TestNG Test

- A suite is a collection of tests Suite tag is the root element of the XML file Attributes name - user define

A Test is a collections of Classes to be executed Multiple test tags within a suite Atrributes name - user define one or more class element inside it for execution class refers to a single test to executed
Verbose=> Print error or failure logs inside console

range verbose - 0 to 10 verbose="0" - it will not give any failure logs verbose="1" - i will min logs verbose="5" - will get more info of the failure testcase

Steps to do Parallel execution:

Select the required testcases

Right click on the testcase -> click TestNG -> convert to TestNG ->

Select ->Parallel mode= classes, tests

Click finish and run from the xml file

View basic reports:

After execution-> refresh the project -> test-output folder will appear -open index.html / emailable-report.html -> open with system editor

TestNG Annotations:

@BeforeSuite

@BeforeTest

@BeforeClass

@BeforeMethod 



     @Test   



@AfterMethod 
@AfterClass

@AfterTest

@AfterSuite

Before Suite Before Test Before Class

Before Method

Testcase 1

After Method

Before Method

Testcase 2 After Method

Before Method Testcase 3 After Method

After Class After Test

-> @BeforeSuite

-> @BeforeTest

<classes> -> @BeforeClass 

     

    <class> -> @BeforeMethod 



       @Test -> @Test 



 </classes> -> @AfterClass 
-> @AfterTest

-> @BeforeTest

<classes> -> @BeforeClass 

     

    <class> -> @BeforeMethod 



       @Test -> @Test 



 </classes> -> @AfterClass 
-> @AfterTest

-> @AfterSuite

Before Suite Before Test Before Class Before Method Testcase 1 After Method After Class After Test

Before Suite Before Test Before Class

Before Method Testcase 1 After Method

Before Method Testcase 2 After Method

After Class After Test

Before Suite Before Test Before Class Before Method Testcase 1 After Method Before Method Testcase 2 After Method After Class After Test

Before Test Before Class Before Method Testcase 1 After Method Before Method Testcase 2 After Method After Class After Test After Suite

Step:1 Create a class as ProjectSpecificMethod

Step:2 Move all the common steps to common class (remove those steps in testcases)

Step:3 @BeforeMethod and @AfterMethod annotation to define the preCondition and postCondition Methods

Step:4 Extend the base class to leads