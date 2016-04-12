package no.kodehuset.junit5;

import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.*;

public class JUnit5Test {

    @Test
    void equalsTest() {

        assertEquals(1, 1);
    }


    @Test
    void assertAllTest() {

        Person person = new Person("Jaran Flaath", 34, true);

        assertAll(
                () -> assertEquals("Jaran Flaath", person.name),
                () -> assertEquals(34, person.age),
                () -> assertEquals(true, person.isMale)
        );
    }


    @Test
    void assertThrowsTest() {

        assertThrows(IllegalArgumentException.class, this::throwIllegalArgumentException);

    }

    @Test
    void expectThrowsTest() {

        IllegalArgumentException ex = expectThrows(IllegalArgumentException.class, this::throwIllegalArgumentException);
        assertEquals("Fo'sho!", ex.getMessage());
    }


    private void throwIllegalArgumentException() {

        throw new IllegalArgumentException("Fo'sho!");

    }

}
