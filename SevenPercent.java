public class SevenPercent implements SalesTaxBehavior{
    @Override
    public double compute(Double value) {
        return value * 0.07; //multiply value by 0.07
    }
}