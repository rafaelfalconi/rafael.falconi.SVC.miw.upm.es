package rafael.falconi.SVC.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassC11Test {
    private ClassC11 c11;

    @Test
    public void testM1() {
        c11 = new ClassC11();
        assertEquals("m1", c11.m1());
    }

    @Test
    public void testM2() {
        c11 = new ClassC11();
        assertEquals("m2", c11.m2());
    }

}
