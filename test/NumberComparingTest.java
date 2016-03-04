import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NumberComparingTest {

    @Test
    public void should_return_0A0B_when_input_is_1234_result_is_5678() {

        NumberComparing numberComparing = new NumberComparing();
        String result = numberComparing.compareNumber("1234", "5678");
        assertEquals("0A0B", result);
    }

    @Test
    public void should_return_4A0B_when_input_is_1234_result_is_1234() {

        NumberComparing numberComparing = new NumberComparing();
        String result = numberComparing.compareNumber("1234", "1234");
        assertEquals("4A0B", result);
    }

    @Test
    public void should_return_0A4B_when_input_is_1234_result_is_4321() {

        NumberComparing numberComparing = new NumberComparing();
        String result = numberComparing.compareNumber("1234", "4321");
        assertEquals("0A4B", result);
    }

}
