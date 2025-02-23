Week6.day2:

 09:00 to 09:30 -> Excel Integrations with TestCase
 09:30 to 09:45 -> Breakout(15mins)
 09:45 to 10:00 -> Common Integration 
 10:00 to 10:15 -> Break(15mins)
 10:15 to 11:10 -> Cucumber Introduction (Feature file)
 11:10 to 11:30 -> Breakout
 11:30 to 12:00 -> Implemenation (Step def and Runner class)
 12:00 to 12:20 -> Breakout

driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("values to send");

# Steps to do Excel Integration:
1. Create 2- dimensional array in the ReadEXcel Class with rowCount and columnCount
String[][] data = new String[rowCount][columnCount];
2. Push stringCellValue to the Array
data[i-1][j]=stringCellValue;
3. Close the workbook and return the data
wBook.close();
return data;
4. Change main method to a normal static method
public static String[][] readExcel(){
}
5. Inside the testcase within the sendData() call the readExcel() from ReadExcel Class and return the data
@DataProvider(name="fetchData")
public String[][] sendData() throws IOException {
return ReadExcel.readExcel();
}


6.
 inside excel program craete one input agrs and pass variable inside workbook

 (./data/createLead.xlsx);
 public static String[][] read(String fileName){
 (./data/"+fileName+".xlsx)
 }
 
 into the BaseClass or PSM  and declare a fileName globally
 public String fileName; ------------ > Global declaration
@DataProvider(name="fetchData")
public String[][] sendData() throws IOException {
return ReadExcel.readExcel(fileName); 
}
7. Create setValues() inside each testcase and annotate with @BeforeTest and mention the filename here
@BeforeTest
public void setValues() {
fileName="EditLead";
} 
8. Finally , run from the xml file







Cucumber: 


Dependencies:
<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-java -->
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-java</artifactId>
		<version>7.10.0</version>
	</dependency>
	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
	<dependency>
		<groupId>io.cucumber</groupId>
		<artifactId>cucumber-testng</artifactId>
		<version>7.10.0</version>
	</dependency>
	
	
	
Steps to Create the layers of Cucumber
Create 3 packages under src/test/java 
*features 
*steps 
*runner















 ● Steps to Create File :-
 Creating features package, 
 Mouseover on it & Right Click --> New --> Other... --> Select File under General Folder --> File Click Next
● Set File name as Login.feature & Click Finish
● U can see a new file Created under features package like slice of Cucumber IMG 
Then it's Fine👍🏻🙂





Gherkin keyword:
Feature:  Login functionality  of Leaftaps Application
          (Describes the functionality of an appliction)

       

Scenario:  Login with Valid credentials
           (Represents a testcase)
  Given    Launch the browser     -> to represent the precondition of a scenario
  And      Load the url
  And      Enter the username as Demosalesmanager
  And      Enter the password as crmsfa
  When     Click on the Login button -> to represent the test condition  
  Then     Homepage should be displayed -> To represent the positive expected result  

Scenario:  Login with InValid credentials
           (Represents a testcase)
  Given    Launch the browser     -> to represent the precondition of a scenario
  And      Load the url
  And      Enter the username   as Demo
  And      Enter the password   as crms
  When     Click on the Login button -> to represent the test condition  
  But      ErrorMessage should be displayed -> To represent the negative expected result    

Create feature file inside features package

Right click on features package -> Click Other -> Double Click General -> Double click File -> Give Filename with .feature as extension -> Click Finish



Create StepDefinition class inside steps package

Inside StepDefinition create methods for each step defined in the feature file
And put the real codes inside each methods
To integrate StepDefinition and the feature file on the top of each method use @Given/And/When/Then("")
Create CucumberRunner class inside runner package

The runner class should extend AbstractTestNGCucumberTests
Add @CucumberOptions on the top of the Runner Class
Within @CucumberOptions() use some of the attributes features -> to mention the path of the feature file glue -> to mention the package name of StepDefintion monochrome -> to remove the unreadable/junk characters from the console publish -> to get the cucumber report in the console @CucumberOptions(features = "src/test/java/features/Login.feature", glue = "steps" , monochrome = true, publish = true) public class CucumberRunner extends AbstractTestNGCucumberTests{
} 
