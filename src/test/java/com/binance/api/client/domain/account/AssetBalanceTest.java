package com.binance.api.client.domain.account;

import junit.framework.TestCase;

public class AssetBalanceTest extends TestCase {

    public void testClone() throws CloneNotSupportedException {
        final AssetBalance assetBalance = new AssetBalance();
        assetBalance.setAsset("asset");
        assetBalance.setFree("free");
        assetBalance.setLocked("locked");
        final AssetBalance clone = assetBalance.clone();
        assertEquals(assetBalance.getAsset(), clone.getAsset());
        assertEquals(assetBalance.getFree(), clone.getFree());
        assertEquals(assetBalance.getLocked(), clone.getLocked());
    }
}