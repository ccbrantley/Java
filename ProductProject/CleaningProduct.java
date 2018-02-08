import java.util.ArrayList;
public class CleaningProduct extends Product implements Chemical {
    // Private Data Attributes
    private String chemicalName, hazards, precautions, firstAid;
    private ArrayList<String> uses;

    // Fully Overloaded Constructor
    public CleaningProduct(String name, int sku, double price, String chemicalName, String hazards, String precautions, String firstAid, ArrayList<String> uses) {
        super(name, sku, price);
        this.chemicalName = chemicalName;
        this.hazards = hazards;
        this.precautions = precautions;
        this.firstAid = firstAid;
        this.uses = uses;
    }

    //Getter/Setter Methods
    @Override
    public String getChemicalName() {
        return chemicalName;
    }

    @Override
    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
    }

    @Override
    public String getHazards() {
        return hazards;
    }

    @Override
    public void setHazards(String hazards) {
        this.hazards = hazards;
    }

    @Override
    public String getPrecautions() {
        return precautions;
    }

    @Override
    public void setPrecautions(String precautions) {
        this.precautions = precautions;
    }

    @Override
    public String getFirstAid() {
        return firstAid;
    }

    @Override
    public void setFirstAid(String firstAid) {
        this.firstAid = firstAid;
    }

    @Override
    public ArrayList<String> getUses() {
        return uses;
    }

    @Override
    public void setUses(ArrayList<String> uses) {
        this.uses = uses;
    }

    // Overridden toString with custom formatting
    @Override
    public String toString() {
        return super.toString() +
                "\nChemical Name: " + chemicalName +
                "\nHazards: " + hazards +
                "\nPrecautions: " + precautions +
                "\nFirst Aid: " + firstAid +
                "\nUses: " + uses;
    }
}
