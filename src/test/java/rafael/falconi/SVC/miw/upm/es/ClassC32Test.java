package rafael.falconi.SVC.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassC32Test {
    private ClassC32 c32;

    @Test
    public void testMA() {
        c32 = new ClassC32();
        assertEquals("mA", c32.mA());
    }

}
