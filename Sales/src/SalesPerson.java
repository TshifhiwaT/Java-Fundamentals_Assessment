public class SalesPerson {
    private String names;
    private double[] weeklySales;

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
}
