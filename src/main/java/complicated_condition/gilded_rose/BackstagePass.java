package complicated_condition.gilded_rose;

public class BackstagePass extends Item {
    public BackstagePass(int sell_in, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sell_in, quality);
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
        if (sell_in < 11) {
            increaseQuality();
        }

        if (sell_in < 6) {
            increaseQuality();
        }
    }

    @Override
    protected void updateQualityAfterExpired() {
        if (sell_in < 0) {
            quality = 0;
        }
    }
}
