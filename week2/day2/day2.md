Week2.day2

    Today Agenda:
    08:45 to 09:00 - Recap
    09:00 to 09:45 - Select Class(Drop down)
    09:45 to 10:10 - Breakout(15mins) + Break(10mins)
    10:10 to 11:10 - Xpath 
    11:10 to 11:30 - Breakout(15mins)+Break(5mins)
    11:30 to 12:00 - Advance Xpath

ClassRoom:
Load url : https://www.telerik.com/contact
1st dropdown using method text("General Inquiries")
2nd dropdown using index (10)
3rd dropdown using value(Canada)

    
Xpath:
XML Path
Xpath-XML Path


Absolute XPath: It starts from the root (html) and traverses down to the desired element, 
detailing every single element in the hierarchy. The path starts with a single forward slash /, 
indicating the root. 
For example: 
/html/body/div[2]/div[2]/div/form/p[1]/input. `.
/html/body/div[2]/div[2]/div/form/p/input





Relative XPath: It starts from anywhere within the document and typically focuses on 
identifying elements based on attributes, indexes, or specific tags, not necessarily 
detailing the entire path from the root. It starts with a double forward slash //,
 indicating the search can begin anywhere. For example: //input[@id=‘username’].



Relative Xpath:

a.Basic xpath
Attribute based xPath: 
Syntax: //tagname[@attributename='attributeValue'] 
Example:  
//button[@name='login']
//input[@id='username']

Text based xPath: 
Syntax: //tagname[text()='textvalue'] 
Example:  
//span[text()='Home & Kitchen']

Partial Attribute based xpath: 
Syntax: //tagname[contains(@attributename,'partialattributevalue')] 
Example: //input[contains(@class,'decorative')]

Partial Text based xpath:
Syntax: //tagname[contains(text(),'partialtextvalue')]
  Example: //a[contains(text(),'M/S')]

Index based xpath:
 Syntax: (//tagname[@attributename='attributeValue'])[2]
(//tagname[text()='textvalue'])[3] 
Example: 
(//input[@class='inputLogin'])[2]
index value should go beyond 5

(//input[@class='data'])[18] ->



Load Url :https://login.salesforce.com/?locale=in
Enter username:dilip@testleaf.com
Enter password:Test@2025
Click on Login



 Wait:
  Java wait -Thread.sleep(5000); it will wait till time given to be completed

Thread.sleep(10000)

  Selenium wait :
  1.Implicit wait
  2.Explicit wait

  Implicit wait :
  10mins

  at 7mins
  30sec -element action completed it will to next line 
  it will not completed 30sec


  driver.findElement(By.id("username")).senKeys("user");
  thread.sleep(5000);

  but if i am using implicit wait


  its common for both findElement() and findElements()

  https://login.salesforce.com/?locale=in
  username: dilip@testleaf.com
  password: leaf@2024