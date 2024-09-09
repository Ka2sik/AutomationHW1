package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainShouldReturn200WithAmount800() {
        Assert.assertEquals(service.remain(800), 200);
    }

    @Test
    public void testRemainShouldReturn0WithAmount1000() {
        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void testRemainShouldReturn999WithAmount1001() {
        Assert.assertEquals(service.remain(1001), 999);
    }

    @Test
    public void testRemainShouldReturn1WithAmount999() {
        Assert.assertEquals(service.remain(999), 1);
    }
}