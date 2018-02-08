import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class FoodProduct extends Product implements Edible {
    // Private Data Attributes
    private Date expDate = new java.util.Date();
    // Refrigeration not needed if product is stable at 70
    // servingSize is in grams
    private int refrigerationTemp, servingSize, caloriesPerServing;
    private ArrayList<String> allergens;
    // Fully Overloaded Constructor
    public FoodProduct(String name, int sku, double price, Date expDate, int refrigerationTemp, int servingSize, int caloriesPerServing, ArrayList<String> allergens) {
        super(name, sku, price);
        this.expDate = expDate;
        this.refrigerationTemp = refrigerationTemp;
        this.servingSize = servingSize;
        this.caloriesPerServing = caloriesPerServing;
        this.allergens = allergens;
    }
    //Getter/Setter Methods
    @Override
    public Date getExpDate() {
        return expDate;
    }
    @Override
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
    @Override
    public int getRefrigerationTemp() {
        return refrigerationTemp;
    }
    @Override
    public void setRefrigerationTemp(int refrigerationTemp) {
        this.refrigerationTemp = refrigerationTemp;
    }
    @Override
    public int getServingSize() {
        return servingSize;
    }
    @Override
    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }
    @Override
    public int getCaloriesPerServing() {
        return caloriesPerServing;
    }
    @Override
    public void setCaloriesPerServing(int caloriesPerServing) {
        this.caloriesPerServing = caloriesPerServing;
    }
    @Override
    public ArrayList<String> getAllergens() {
        return allergens;
    }
    @Override
    public void setAllergens(ArrayList<String> allergens) {
        this.allergens = allergens;
    }
    // Overridden toString with custom formatting
    @Override
    public String toString() {
        DateFormat formatter = new SimpleDateFormat("MM/yyyy");
        String customExpDate = formatter.format(expDate);
        return super.toString() +
                "\nExpiration Date: " + customExpDate +
                "\nRefrigeration Temp: " + refrigerationTemp +
                "\nServing Size: " + servingSize +
                "\nCalories Per Serving: " + caloriesPerServing +
                "\nAllergens: " + allergens;
    }
}
