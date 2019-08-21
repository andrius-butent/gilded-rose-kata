package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    private static final String AGE_BRIE = "Aged Brie";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String CONJURED = "Conjured Mana Cake";
    private static final String CUSTOM_ITEM = "Custom Item";

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    @Test
    public void when_CustomItemSellInIsZero_Expect_QualityDegradesTwice() {
        Item[] items = {new Item(CUSTOM_ITEM, 0, 20)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(18, items[0].quality);
    }

    @Test
    public void when_AgeBrieSellInIsZero_Expect_QualityIncreasesTwice() {
        Item[] items = {new Item(AGE_BRIE, 0, 10)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(12, items[0].quality);
    }

/*    @Test
    public void when_BackstagePassesSellInIsZero_Expect_QualityDegradesTwice() {
        Item[] items = {new Item(BACKSTAGE_PASSES, 0, 20)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(18, items[0].quality);
    }*/

    @Test
    public void when_ConjuredSellInIsZero_Expect_QualityDegradesTwice() {
        Item[] items = {new Item(CONJURED, 12, 10)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(8, items[0].quality);
    }

    @Test
    public void when_CustomItemSellInIsZero_Expect_QualityDegradesTwiceAndQualityIsNotNegative() {
        Item[] items = {new Item(CUSTOM_ITEM, 0, 1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(0, items[0].quality);
    }

/*    @Test
    public void when_BackstagePassesSellInIsZero_Expect_QualityDegradesTwiceAndQualityIsNotNegative() {
        Item[] items = {new Item(BACKSTAGE_PASSES, 0, 1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(0, items[0].quality);
    }*/

    @Test
    public void when_ConjuredSellInIsZero_Expect_QualityDegradesTwiceAndQualityIsNotNegative() {
        Item[] items = {new Item(CONJURED, 0, 1)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(0, items[0].quality);
    }

    @Test
    public void when_CustomItemSellInIsNotZero_Expect_QualityDegradesOnce() {
        Item[] items = {new Item(CUSTOM_ITEM, 2, 20)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(19, items[0].quality);
    }

    @Test
    public void when_AgeBrieSellInIsNotZero_Expect_QualityIncreasesOnce() {
        Item[] items = {new Item(AGE_BRIE, 2, 20)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(21, items[0].quality);
    }

    @Test
    public void when_SulfurasItem_Expect_QualityAndSellInValuesAreSame() {
        Item[] items = {new Item(SULFURAS, 5, 20)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(5, items[0].sellIn);
        assertEquals(20, items[0].quality);
    }

/*
    @Test
    public void when_BackstagePassesSellInIsNotZero_Expect_QualityDegradesOnce() {
        Item[] items = {new Item(BACKSTAGE_PASSES, 2, 20)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(19, items[0].quality);
    }
*/

    @Test
    public void when_ConjuredSellInIsNotZero_Expect_QualityDegradesOnce() {
        Item[] items = {new Item(CONJURED, 2, 20)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(19, items[0].quality);
    }

    @Test
    public void when_AgeBrieSellInIsNotZeroAndQualityIsFifty_Expect_QualityIsFifty() {
        Item[] items = {new Item(AGE_BRIE, 2, 50)};
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateQuality();

        assertEquals(50, items[0].quality);
    }
}
