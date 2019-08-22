package com.gildedrose;

public class Conjured implements IItemQuality {

    private static final int MIN_QUALITY = 0;
    private static final int MIN_SELL_IN = 0;
    Item item;

    public Conjured(Item item) {
        this.item = item;
    }

    @Override
    public void updateItem() {
        decreaseSellIn();
        changeQuality(2);

        if(item.sellIn < MIN_SELL_IN)
            changeQuality(2);
    }

    @Override
    public void changeQuality(int value) {
        if (item.quality > MIN_QUALITY)
            item.quality -= value;
    }

    @Override
    public void decreaseSellIn() {
        item.sellIn--;
    }
}
