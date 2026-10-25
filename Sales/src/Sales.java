/*Problem Statement:
The company have employed salespeople to handle their sales for the furniture
shop. Each salesperson employed is given a basic wage of R7500 plus the 10%
commission of the sales they make per month. However, the company record sales
for each salesperson and can only pay them at the end of the month. The company
wants you to develop a program that will help them do the following:
• Calculate each salesperson’s monthly salary by getting 10% commission of
the monthly sales they made plus a basic wage of R7500.
• Calculate the company monthly sales turnover made by all salespersons,
which is the amount the company will get per month before deducting
employees’ salaries. It can be calculated by accumulating the calculated total
monthly sales.
• Calculating the monthly expenditure on salaries only, it can be calculated by
accumulating the calculated monthly salaries.
• Determine the best salesperson of the month by finding the highest total
monthly sales.
2
JAVA ASSESSMENT
Your program should implement the following methods / functions:
• Initialize() – it must initialize the arrays with 4 salespeople’ names and 4 sales
(weekly sales) per salesperson (arPersons and arSales)
• findSalesPerson(name) method that takes the salesperson’s name as a
parameter, search the array and return the position of the salesperson.
• calcTotalMonthlySales() method that takes no parameter, and it must
calculate and return the total monthly sales of salesperson, it calls the
findSalesPerson() method to get the position of the salesperson and return
their total monthly sales.
• calcMonthlySalary() method takes no parameters and it must calculate and
return monthly salary for salesperson. (Hint: use the findSalesPerson()
method to search for the salesperson)
• calcMonthlyTurnOver() method that takes no parameter and calculates and
returns the total sale value (total of all the sales amounts).
• calcSalaryExpenditure() method that takes no parameters, calculates and
returns the monthly salary expenditure value as explained (total of all the
salaries of the 4 salespersons).
• getBestSalesPerson() method that takes no parameters, search the array(s)
and displays the name and monthly sales of the salesperson with the highest
monthly sales.
• display() method to display all the salespeople with their weekly sales and
total monthly sales.
3
JAVA ASSESSMENT
Program implementation:
Your program should implement a menu functionality as follows:
1 – See All Salespeople
2 – Find Salesperson
3 – Total Monthly Sales
4 – Monthly Salary
5 – Best Salesperson
6 – Monthly Turnover
7 – Total Salary Expenditure
Execute / invoke necessary method(s) for each option selected by the user. */
public class Sales {
}
