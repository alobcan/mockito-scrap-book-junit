import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ATest {

    @Mock
    B b;
    private A a;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        a = new A(b);
    }

    @Test
    public void usesVoidMethodShouldCallVoidMethod() throws Exception {
        assertEquals(1, a.usesVoidMethod());
        verify(b).voidMethod();
    }



}