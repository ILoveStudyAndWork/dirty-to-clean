package complicated_condition.gilded_rose;

public class Item {

    public String name;

    public int sell_in;

    public int quality;

    public Item(String name, int sell_in, int quality) {
        this.name = name;
        this.sell_in = sell_in;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sell_in + ", " + this.quality;
    }

    public void updateAfterOneDay() {
        updateQuality();
        updateSellIn();
        updateQualityAfterExpired();
    }

    protected void updateQuality() {
        if (isBackstagePass()) {
            increaseQuality();

            if (sell_in < 11) {
                increaseQuality();
            }

            if (sell_in < 6) {
                increaseQuality();
            }
            return;
        }
        decreaseQuality();
    }

    protected void updateSellIn() {
        sell_in = sell_in - 1;
    }

    protected void updateQualityAfterExpired() {
        if (sell_in < 0) {
            if (isBackstagePass()) {
                quality = 0;
                return;
            }
            decreaseQuality();
        }
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }

    private boolean isBackstagePass() {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    protected boolean isAgedBrie() {
        return false;
    }

    protected boolean isSulfuras() {
        return false;
    }


}
