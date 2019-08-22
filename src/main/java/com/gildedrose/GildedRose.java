package com.gildedrose;

import java.util.stream.Stream;

class GildedRose {

    private static final String AGE_BRIE = "Aged Brie";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String CONJURED = "Conjured Mana Cake";

    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        Stream.of(items).forEach(item -> getItemByName(item).updateItem());
    }

    private IItemQuality getItemByName(Item item) {

        switch (item.name) {
            case AGE_BRIE:
                return new AgeBrie(item);

            case SULFURAS:
                return new Sulfuras(item);

            case BACKSTAGE_PASSES:
                return new BackstagePasses(item);

            case CONJURED:
                return new Conjured(item);

            default:
                return new CustomItem(item);
        }
    }
}