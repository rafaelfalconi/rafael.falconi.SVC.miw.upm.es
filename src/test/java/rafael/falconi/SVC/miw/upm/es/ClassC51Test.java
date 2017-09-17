package rafael.falconi.SVC.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassC51Test {

    private ClassC51 c51;

    @Test
    public void testM1() {
        c51 = new ClassC51();
        assertEquals("m1", c51.m1());
    }

    @Test
    public void testM2() {
        c51 = new ClassC51();
        assertEquals("m2", c51.m2());
    }

}
