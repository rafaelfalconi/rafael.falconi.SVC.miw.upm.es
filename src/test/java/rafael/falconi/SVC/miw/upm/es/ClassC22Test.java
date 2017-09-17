package rafael.falconi.SVC.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassC22Test {
    private ClassC22 c22;
    @Test
    public void testMA() {
        c22=new ClassC22();
        assertEquals("mA",c22.mA());
    }

}
