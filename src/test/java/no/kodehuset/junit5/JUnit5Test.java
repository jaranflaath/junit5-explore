package no.kodehuset.junit5;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;

public class JUnit5Test {

    @Test
    void aSimpleTest() {

        assertEquals(1, 1);
    }
}
