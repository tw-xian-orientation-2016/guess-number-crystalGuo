import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NumberComparingTest {

    @Test
    public void should_return_0A0B_when_input_is_1234_result_is_5678() {

        NumberComparing numberComparing = new NumberComparing();
        String result = numberComparing.compareNumber("1234", "5678");
        assertEquals(result,"0A0B");
    }

}
