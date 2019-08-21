package com.gildedrose;

class GildedRose {

    private static final String AGE_BRIE = "Aged Brie";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String CONJURED = "Conjured Mana Cake";
    private static final String CUSTOM_ITEM = "Custom Item";
    
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (items[i].name.equals("Aged Brie")
                    || items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality < 50) {
                            items[i].quality += 1;

                            if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                                if (items[i].sellIn < 11) {
                                    if (items[i].quality < 50) {
                                        items[i].quality += 1;
                                    }
                                }

                                if (items[i].sellIn < 6) {
                                    if (items[i].quality < 50) {
                                        items[i].quality += 1;
                                    }
                                }
                            }
                        }
                    } else {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality -= 1;
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn -= 1;
            }

            if (items[i].sellIn < 0) {
                if (items[i].name.equals("Aged Brie")) {
                    if (items[i].quality < 50) {
                        items[i].quality += 1;
                    }
                } else {
                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        items[i].quality = 0;
                    } else {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality -= 1;
                            }
                        }
                    }
                }
            }
        }
    }
}