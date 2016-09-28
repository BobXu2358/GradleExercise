import org.junit.Test;
import static org.junit.Assert.*;

//import Sequence.class;

public class SequenceTest {

    @Test
    public void testLazy1() {
	     assertEquals(Sequence.lazy(1), 1);
    }


    @Test
    public void testTriangle3() {
	     assertEquals(Sequence.triangle(3), 6);
    }


}
