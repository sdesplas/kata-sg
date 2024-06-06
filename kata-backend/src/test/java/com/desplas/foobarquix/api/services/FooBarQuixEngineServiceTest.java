package com.desplas.foobarquix.api.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FooBarQuixEngineServiceTest {

    private final FooBarQuixEngineService service = new FooBarQuixEngineService();

    @Test
    public void test1() {
        assertEquals("1", service.transform(1));
    }

    @Test
    public void test3() {
        assertEquals("FOOFOO", service.transform(3));
    }

    @Test
    public void test5() {
        assertEquals("BARBAR", service.transform(5));
    }

    @Test
    public void test7() {
        assertEquals("QUIX", service.transform(7));
    }

    @Test
    public void test9() {
        assertEquals("FOO", service.transform(9));
    }

    @Test
    public void test51() {
        assertEquals("FOOBAR", service.transform(51));
    }

    @Test
    public void test53() {
        assertEquals("BARFOO", service.transform(53));
    }

    @Test
    public void test33() {
        assertEquals("FOOFOOFOO", service.transform(33));
    }

    @Test
    public void test15() {
        assertEquals("FOOBARBAR", service.transform(15));
    }
}
