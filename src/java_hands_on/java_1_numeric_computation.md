# Problem : Find Interest Value
<b><h3>Create a class Account with below attributes:</h3></b>
int id <br/>
double balance <br/>
double interestRate <br/>

Class should have getters, setters and constructor with parameters in above sequence of attributes.<br/>

Create a class Solution with main method. Read one integer and two double values using Scanner object and create object of Account class. These values should be mapped to id, balance and interestRate attributes. <br/>

Read one more integer value and store it in variable noOfYears. <br/>

Write a method <b>calculateInterest</b> which will take account object and no of years as input parameters and return the interest amount.<br/>

Consider below logic to calculate the interest value: <br/>
<li>For specified no of years, first find out the percentage value those no of years based on specified interestRate. E.g. if no of years is 5 and specified interestRate is 4%, then 4% of 5 is 0.2.</li>
<br/>
<li>This percentage should be added to original interstRate for calculating the final interest value. Hence for above example it will be 4.2 (instead of 4).</li>
<br/>
Display the interest amount rounded upto three decimal places. Even if the result does not have decimal, it should be displayed with suffix ".000".

#### Consider below sample input and output:

Input: <br/>
1<br/>
1000<br/>
10 <br/>
5

Output:<br/>
105.000

Output is 55 since the interest rate is 10 and no of years is 5. Hence, the final interest will be 10 + 10 percentage of 5, which is 10.5. Hence final answer is 105.000.
