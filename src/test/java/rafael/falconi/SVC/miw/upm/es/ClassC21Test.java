package rafael.falconi.SVC.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassC21Test {
    private ClassC21 c21;
    @Test
    public void testM1() {
        c21=new ClassC21();
        assertEquals("m1",c21.m1());
    }

    @Test
    public void testM2() {
        c21=new ClassC21();
        assertEquals("m2",c21.m2());
    }

}
