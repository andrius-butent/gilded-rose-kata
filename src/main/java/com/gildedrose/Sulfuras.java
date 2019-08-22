package com.gildedrose;

public class Sulfuras implements IItemQuality {

    private Item item;

    public Sulfuras(Item item) {
        this.item = item;
    }

    @Override
    public void updateItem() {

    }

    @Override
    public void changeQuality(int value) {

    }

    @Override
    public void decreaseSellIn() {
        item.sellIn--;
    }
}
