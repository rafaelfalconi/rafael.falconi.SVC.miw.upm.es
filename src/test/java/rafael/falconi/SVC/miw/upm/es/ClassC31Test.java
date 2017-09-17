package rafael.falconi.SVC.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassC31Test {
    private ClassC31 c31;

    @Test
    public void testM1() {
        c31 = new ClassC31();
        assertEquals("m1", c31.m1());
    }

    @Test
    public void testM2() {
        c31 = new ClassC31();
        assertEquals("m2", c31.m2());
    }

}
