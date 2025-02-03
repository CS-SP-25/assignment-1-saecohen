public class SalesTaxCalculator {
    public static void main(String[] args) {
        State state = new State("");
        double taxamt = 0;
        String name = args[0];
        double amount = Double.parseDouble(args[1]);
        //check for respective state and set that state
        name = name.toLowerCase();
        if (name.equals("indiana")) {
            state = new Indiana("Indiana");
            state.setSalesTaxBehavior(new SevenPercent());
        } else if (name.equals("alaska")) {
            state = new Alaska("Alaska");
            state.setSalesTaxBehavior(new NoTax());
        } else if (name.equals("hawaii")) {
            state = new Hawaii("Hawaii");
            state.setSalesTaxBehavior(new FourAndHalfPercent());
        } else {
            System.out.println("Invalid state (get it?). please choose alaska or indiana (or hawaii).");
        }
    }
}

