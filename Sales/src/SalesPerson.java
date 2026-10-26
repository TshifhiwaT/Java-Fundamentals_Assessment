public class SalesPerson {
    private String names;
    private double[] weeklySales;
    private double monthlySalary;
    private double monthlySales;

    public SalesPerson(String names, double[] weeklySales){
        setNames(names);
        setWeeklySales(weeklySales);
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public double[] getWeeklySales() {
        return weeklySales;
    }

    public void setWeeklySales(double[] weeklySales) {
        this.weeklySales = weeklySales;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales() {
        double sales = 0;
        for (double weeklySale : weeklySales) {
            sales += weeklySale;
        }
        monthlySales = sales;
    }
}
