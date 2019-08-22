package com.gildedrose;

public class CustomItem implements IItemQuality {

    private Item item;

    public CustomItem(Item item) {
        this.item = item;

    }

    @Override
    public void updateItem() {

    }

    @Override
    public void changeQuality(int value) {

    }

    @Override
    public void changeSellIn(int value) {

    }
}
