package complicated_condition.gilded_rose;

public class AgedBrie extends Item {

    public AgedBrie(int sell_in, int quality) {
        super("Aged Brie", sell_in, quality);
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
    }

    @Override
    protected void updateQualityAfterExpired() {
        if (sell_in < 0) {
            increaseQuality();
        }
    }
}
