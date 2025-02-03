public class State {
    private String name;
    private SalesTaxBehavior behavior;
    protected SalesTaxBehavior taxType;

    public State(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        String profileName = args[0]; //sets profile name
    }

    public void setName(String name) {
        this.name = name; //change the name
    }

    public String getName() {
        return name; //return the name
    }

    public void setSalesTaxBehavior(SalesTaxBehavior behaviorinput) {
        this.behavior = behaviorinput;
    }
    public SalesTaxBehavior getSalesTaxBehavior() {
        return this.behavior;
    }
    public void showTax(double value) { // print out the tax
        System.out.println("The sales tax on $" + String.format("%.2f",value) + " in " + this.getName() + " is $" + String.format("%.2f",getSalesTaxBehavior().compute(value)) + ".");
    }

}
