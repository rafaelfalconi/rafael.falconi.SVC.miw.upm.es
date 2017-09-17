package rafael.falconi.SVC.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassC12Test {
    private ClassC12 c12;
    @Test
    public void testMA() {
        c12=new ClassC12();
        assertEquals("mA",c12.mA());
    }

}
