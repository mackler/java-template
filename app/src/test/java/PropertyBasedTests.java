import static org.junit.jupiter.api.Assertions.*;

import net.jqwik.api.*;

class PropertyBasedTests {

    @Property
    public void additionIsCommutative(@ForAll int a, @ForAll int b) {
        assertEquals(a + b, b + a);
    }
}
