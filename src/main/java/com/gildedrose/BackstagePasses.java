package com.gildedrose;

public class BackstagePasses implements IItemQuality {

    private static final int MAX_QUALITY = 50;
    private static final int MIN_SELL_IN = 0;
    private Item item;

    public BackstagePasses(Item item) {
        this.item = item;
    }

    @Override
    public void updateItem() {
        decreaseSellIn();
        changeQuality(1);

        if (item.sellIn < 10) {
            changeQuality(1);
        }

        if (item.sellIn < 5) {
            changeQuality(1);
        }

        if (item.sellIn < MIN_SELL_IN) {
            changeQuality(-item.quality);
        }
    }

    @Override
    public void changeQuality(int value) {
        if (item.quality < MAX_QUALITY) {
            item.quality += value;
        }
    }

    @Override
    public void decreaseSellIn() {
        item.sellIn--;
    }
}
