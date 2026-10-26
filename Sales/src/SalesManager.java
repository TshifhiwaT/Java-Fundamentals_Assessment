import java.util.Scanner;

public class SalesManager {
    private String[] arPersons;
    private double[][] arSales;
    private SalesPerson salesPerson;

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

        for(int i = 0; i <arPersons.length; i++){
            salesPerson = new SalesPerson(arPersons[i], arSales[i]);
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
        Scanner sc = new Scanner(System.in);
        System.out.print("Search for salesperson: ");
        String name = sc.nextLine();

        int pos = findSalesPerson(name);

        if(pos == -1){
            return -1;
        }

        for(int i = 0; i < arSales[pos].length; i++){
            total += arSales[pos][i];
        }
        return total;
    }


}
