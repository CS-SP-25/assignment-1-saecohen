public class FourAndHalfPercent implements SalesTaxBehavior{
    @Override
    public double compute(Double value) {
        return value * 0.045; //multiply value by 0.07
    }
}