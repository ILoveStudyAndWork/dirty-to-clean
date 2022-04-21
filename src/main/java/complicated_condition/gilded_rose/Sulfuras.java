package complicated_condition.gilded_rose;

public class Sulfuras extends Item {

    public Sulfuras(int sell_in, int quality) {
        super("Sulfuras, Hand of Ragnaros", sell_in, quality);
    }

    @Override
    protected boolean isSulfuras() {
        return super.isSulfuras();
    }

    @Override
    protected void updateQuality() {
    }

    @Override
    protected void updateSellIn() {
    }

    @Override
    protected void updateQualityAfterExpired() {
    }
}
