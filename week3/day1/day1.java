Todays Agenda!!
================
   09:00 - 09:50 -Arrays
   09:50 - 10:15 -Breakout+Break
   10:15 - 11:00 -String
   11:00 - 11:20 -Breakout+Break
   11:20 - 11:50 -Continue with String
   11:50 - 12:10 -Xpath
   12:10 - 12:25 -Recap

Arryas:
=======

what is array?

An array is collection of similar datatypes
Array index start from '0'
its fixed data 
if you not given values to arrya .its aste and e cannot reuse




 Arrays:
 An array in Java is a data structure that allows you to store multiple values of
 the same data type under a single variable name. Arrays provide a way to efficiently
 manage and access a collection of elements of the same type. Each element in an 
 array is identified by an index, starting from 0 for the first element.

 Example: int[] myArray = {1, 2, 3, 4, 5};

array will be work on index value -start from '0'

char[] data ={'a','d','g','c','e','s'}
starting index -0
ending index -5

 store all 575 names String={"a","b","c"}
 String[] name={"","",""}

 
 String[] name={"             "}










String:
=======
String is class
collection of characters

String is immutable--- we cannot changeable


to types e can create string
1.STRING LITERAL
2.STRING OBJECT

STRING LITERAL
String company ="TestLeaf";

STRING OBJECT:
String company=ne String("TestLeaf");

Methods:
length()--to find 	ho many characters --int
toCharArray()-- covert string to character array--char[]
equals("")-- to compare String content--boolean
equalIgnoreCase()--it ill not compare loercase or uppercase
contins()--  compare the string ith matching content-- boolean
indexOf()-- ill return the index  position of the given character---int
CharAt()--character available in the given  position---character




















   Classroom 1:
Find the duplicate number in the given Arrays
int[] input={2,5,3,1,4,5,7,6,3,2}

1.Declare values
2.get the length of the array 
3.iterate from 0 to the array length-1 (outer loop starts here)
4.iterate from i to the length of the array by adding 1 to it (inner loop starts here)
5.compare both the loop variables & check they're equal
6.print the matching value


Classroom 2:
FindSecondLargest 
// Here is the input
		int[] data = {3,2,11,4,6,7};
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it





Classroom 3:
ReverseString 

// Here is the input
		String test = "Amazon";

		// Build the logic to find the count of each
		/* Pseudo Code: 1
			a) Convert the String to character array
			b) Traverse through each character (using loop in reverse direction)
			c) Print the character (without newline -> like below
			   System.out.print(ch);
		*/

Classroom 4:

Reverse the String
==================
String  input=“Amazon development centre,Chennai"; 
Output = Chennai,centre development Amazon
Goal: To understand String , loop
a)Convert the string to lower case
b)split the sentence with white space and get the count of the words
c)Use for loop to iterate (from end to go to the first)
d)Print the  reversed String
*Hint  Use system.out.print() 