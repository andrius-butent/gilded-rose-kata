package com.gildedrose;

public class CustomItem implements IQuality{

    private Item item;

    public CustomItem(Item item) {
        this.item = item;

    }

    @Override
    public void updateItem(Item item) {

    }

    @Override
    public void changeQuality(int value) {

    }

    @Override
    public void changeSellIn(int value) {

    }
}
