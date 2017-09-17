package rafael.falconi.SVC.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClassC52Test {

    private ClassC52 c52;
    @Test
    public void testMA() {
        c52=new ClassC52();
        assertEquals("mA",c52.mA());
    }

}
