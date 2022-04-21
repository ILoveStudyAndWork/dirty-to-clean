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

    void updateQuality() {
        if (isNormalItem())
            if (quality > 0) {
                quality = quality - 1;
            }

        if (isAgedBrie() || isBackstagePass()) {
            if (quality < 50) {
                quality = quality + 1;

            }
        }

        if (isBackstagePass()) {
            if (sell_in < 11) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }

            if (sell_in < 6) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }

    }

    private boolean isNormalItem() {
        return !isAgedBrie() && !isBackstagePass() && !isSulfuras();
    }


    void updateSellIn() {
        if (isSulfuras()) {
            return;
        }
        sell_in = sell_in - 1;
    }


    void updateQualityAgain() {
        if (sell_in < 0) {
            if (!isAgedBrie()) {
                if (!isBackstagePass()) {
                    if (quality > 0) {
                        if (!isSulfuras()) {
                            quality = quality - 1;
                        }
                    }
                } else {
                    quality = 0;
                }
            } else {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        }
    }

    private boolean isBackstagePass() {
        return name.equals("Backstage passes to a TAFKAL80ETC concert");
    }

    private boolean isAgedBrie() {
        return name.equals("Aged Brie");
    }

    private boolean isSulfuras() {
        return name.equals("Sulfuras, Hand of Ragnaros");
    }
}
