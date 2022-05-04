package test;


import org.example.weblab3finale.entity.Hit;
import org.example.weblab3finale.tests.Hello;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestOne {
    @Test
    public void addHitCircleTest() {
        Hit hit = new Hit(-1, -1, 2);
        hit.checkHit();
        String prevRes = "yes";
        assertEquals(prevRes, hit.getRes());
    }

    @Test
    public void helloTest() {
        Hello hello = new Hello();
        assertEquals("HELLO MEOW", hello.helloLOL());
    }

    @Test
    public void addHitRecTest() {
        Hit hit = new Hit(1, 1, 2);
        hit.checkHit();
        String prevRes = "yes";
        assertEquals(prevRes, hit.getRes());
    }

    @Test
    public void addHitTriangleTest() {
        Hit hit = new Hit(-0.45, 1, 2);
        hit.checkHit();
        String prevRes = "yes";
        assertEquals(prevRes, hit.getRes());
    }

    @Test
    public void addHitZeroTest() {
        Hit hit = new Hit(0, 0, 2);
        hit.checkHit();
        String prevRes = "yes";
        assertEquals(prevRes, hit.getRes());
    }

    @Test
    public void addHitBoundRecTest() {
        Hit hit = new Hit(2, 2, 2);
        hit.checkHit();
        String prevRes = "yes";
        assertEquals(prevRes, hit.getRes());
    }

    @Test
    public void addHitBoundRecCloseTest() {
        Hit hit = new Hit(2, 2.0001, 2);
        hit.checkHit();
        String prevRes = "no";
        assertEquals(prevRes, hit.getRes());
    }

    @Test
    public void addHitZeroRTest() {
        Hit hit = new Hit(1, 2, 0);
        hit.checkHit();
        String prevRes = "no";
        assertEquals(prevRes, hit.getRes());
    }

    @Test
    public void addHitNegRTest() {
        Hit hit = new Hit(1, 2, -1);
        hit.checkHit();
        String prevRes = "no";
        assertEquals(prevRes, hit.getRes());
    }

    @Test
    public void addHitOutBoundTest() {
        Hit hit = new Hit(1, -1, 2);
        hit.checkHit();
        String prevRes = "no";
        assertEquals(prevRes, hit.getRes());
    }

    @Test
    public void addHitOutBoundCircleTest() {
        Hit hit = new Hit(-1, -1, 0.5);
        hit.checkHit();
        String prevRes = "no";
        assertEquals(prevRes, hit.getRes());
    }

    @Test
    public void addHitOutBoundTriTest() {
        Hit hit = new Hit(-1, -1, 0.5);
        hit.checkHit();
        String prevRes = "no";
        assertEquals(prevRes, hit.getRes());
    }


}

// commit 1
// commit 2

// commit 4
// commit 5
// commit 6
// commit 7
// commit 8
// commit 9
// commit 10

// commit 12
// commit 13
// commit 14

// commit 16
// commit 17
// commit 18