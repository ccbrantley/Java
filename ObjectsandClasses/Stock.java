public class Stock {
    //Private Data attributes
    private String symbol, name;
    private double previousClosingPrice, currentPrice;
    //Overloaded Constructor w/ symbol & name
    public Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = 0;
        this.currentPrice = 0;
    }
    //Mutators and Accessors
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    //Return percent of increase
    public double getChangePercent() {
        return (((this.currentPrice - this.previousClosingPrice)/this.previousClosingPrice)*100);
    }
}
