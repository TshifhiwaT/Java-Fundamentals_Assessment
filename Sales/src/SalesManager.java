import java.util.Arrays;
import java.util.Scanner;

public class SalesManager {
    private String[] arPersons;
    private double[][] arSales;
    private SalesPerson[] salesPerson;
    private int basicSalary = 7500;

    public SalesManager(){
        initialize();
    }

    public void initialize(){
        arPersons = new String[]{"Thabo", "Loraine", "Zama", "Peter"};
        arSales = new double[][]{
                {17550, 14500, 11000, 12500},
                {15000, 12000, 12500, 16800},
                {15620, 18100, 21500, 17630},
                {15755, 13900, 12950, 19200}
        };

        salesPerson = new SalesPerson[4];

        for(int i = 0; i <arPersons.length; i++){
            salesPerson[i] = new SalesPerson(arPersons[i], arSales[i]);
        }
    }

    public int findSalesPerson(String name){
        for(int i = 0; i < arPersons.length; i++){
            if(name.toLowerCase().trim().equals(arPersons[i].toLowerCase())){
                return i;
            }
        }
        return -1;
    }

    public double calcTotalMonthlySales(){
        double total = 0;
        System.out.print("Search for salesperson: ");
        String name = getInput();

        int pos = findSalesPerson(name);

        if(pos == -1){
            return -1;
        }

        for(int i = 0; i < arSales[pos].length; i++){
            total += arSales[pos][i];
        }
        return total;
    }

    public double calcMonthlySalary(){
        double monthlySales = calcTotalMonthlySales();

        return basicSalary + (monthlySales * 0.10);
    }

    public double calcMonthlyTurnOver(){
        double turnOver = 0;
        for(int i = 0; i < arPersons.length; i++){
            for(int n = 0; n < arSales[i].length; n++){
                turnOver += arSales[i][n];
            }
        }
        return turnOver;
    }

    public double calcSalaryExpenditure(){
        return (basicSalary * arPersons.length) + (calcMonthlyTurnOver() * 0.10);
    }

    public String getBestSalesPerson(){
        String name = "";
        double monthlySales = 0;

        for(SalesPerson person : salesPerson){
            if(person.getMonthlySales() > monthlySales){
                name = person.getNames();
                monthlySales = person.getMonthlySales();
            }
        }
        return name + " " + monthlySales;
    }


    public void display(){
        for(SalesPerson person : salesPerson){
            System.out.format("""
                    name week1 week2 week3 week4 Total Sales
                    %s   %s  %.1f
                    """, person.getNames(), Arrays.toString(person.getWeeklySales()), person.getMonthlySales());
        }
    }


    public void menu(){
        int choice;
        char proceed = 'Y';
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Please select a menu item below");
            System.out.println("1 - See All Salespeople");
            System.out.println("2 - Find Salesperson");
            System.out.println("3 - Total Monthly Sales");
            System.out.println("4 - Monthly Salary");
            System.out.println("5 - Best Salesperson");
            System.out.println("6 - Monthly Turnover");
            System.out.println("7 - Total Salary Expenditure");
            System.out.print("Your Option: ");

             while (!input.hasNextInt()) {
                System.out.print("Enter a valid number: ");
                input.nextLine();
            }

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    display();
                    break;

                case 2: {
                    System.out.print("Search for salesperson: ");
                    String name = getInput();
                    int position = findSalesPerson(name);

                    if (position == -1) {
                        System.out.println("Salesperson not found.");
                    } else {
                        System.out.println("Salesperson: "
                                + arPersons[position]);
                        System.out.println("Position: " + position);
                    }
                    break;
                }

                case 3: {
                    double total = calcTotalMonthlySales();

                    if (total != -1) {
                        System.out.printf("Monthly sales: R%.2f%n", total);
                    }
                    break;
                }

                case 4: {
                    double salary = calcMonthlySalary();

                    if (salary != -1) {
                        System.out.printf("Monthly salary: R%.2f%n",
                                salary);
                    }
                    break;
                }

                case 5:
                    System.out.println("Best salesperson: "
                            + getBestSalesPerson());
                    break;

                case 6:
                    System.out.printf("Monthly turnover: R%.2f%n",
                            calcMonthlyTurnOver());
                    break;

                case 7:
                    System.out.printf("Salary expenditure: R%.2f%n",
                            calcSalaryExpenditure());
                    break;
                
                default:
                    System.out.println("Invalid option.");
            }

            while (true) {
                System.out.print("\nDo you want to continue? (Y/N): ");
                String answer = getInput();

                if (answer.equalsIgnoreCase("Y")) {
                    proceed = 'Y';
                    break;
                } else if (answer.equalsIgnoreCase("N")) {
                    proceed = 'N';
                    break;
                } else {
                    System.out.println("Please enter Y or N.");
                }
            }

        }while(proceed == 'Y');
    }


    public String getInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
