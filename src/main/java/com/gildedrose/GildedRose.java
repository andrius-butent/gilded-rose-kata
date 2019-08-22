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
        for (Item item : items) {
            if (item.name.equals("Aged Brie")
                    || item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.quality < 50) {
                            item.quality += 1;

                            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                                if (item.sellIn < 11) {
                                    if (item.quality < 50) {
                                        item.quality += 1;
                                    }
                                }

                                if (item.sellIn < 6) {
                                    if (item.quality < 50) {
                                        item.quality += 1;
                                    }
                                }
                            }
                        }
                    } else {
                if (item.quality > 0) {
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        item.quality -= 1;
                    }
                }
            }

            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn -= 1;
            }

            if (item.sellIn < 0) {
                if (item.name.equals("Aged Brie")) {
                    if (item.quality < 50) {
                        item.quality += 1;
                    }
                } else {
                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        item.quality = 0;
                    } else {
                        if (item.quality > 0) {
                            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                                item.quality -= 1;
                            }
                        }
                    }
                }
            }
        }
    }

    private IItemQuality getItemByName(Item item) {

        switch (item.name) {
            case AGE_BRIE:
                return new AgeBrie(item);

            case SULFURAS:
                return new Sulfuras(item);

            case BACKSTAGE_PASSES:
                return new BackstagePasses(item);

            default:
                return new CustomItem(item);
        }
    }
}