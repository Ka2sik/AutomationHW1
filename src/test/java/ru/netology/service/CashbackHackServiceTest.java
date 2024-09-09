package ru.netology.service;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainShouldReturn200WithAmount800() {
        Assert.assertEquals(200, service.remain(800));
    }

    @Test
    public void testRemainShouldReturn0WithAmount1000() {
        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void testRemainShouldReturn999WithAmount1001() {
        Assert.assertEquals(999, service.remain(1001));
    }

    @Test
    public void testRemainShouldReturn1WithAmount999() {
        Assert.assertEquals(1, service.remain(999));
    }
}