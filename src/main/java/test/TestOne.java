package test;


import org.example.weblab3finale.tests.Hello;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestOne {

    @Test
    public void helloTest() {
        Hello hello = new Hello();
        assertEquals("HELLO MEOW", hello.helloLOL());
    }
}