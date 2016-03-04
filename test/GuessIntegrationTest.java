import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessIntegrationTest {

    private Guess guess;

    @Before
    public void setUp() {

        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(5,6,7,8);

        AnswerGenerator answerGenerator = new AnswerGenerator(random);
        CompareNumber compareNumber = new CompareNumber();

        guess = new Guess(answerGenerator, compareNumber);
    }

    @Test
    public void should_return_0A0B_when_input_is_1234_and_result_is_5678() {

        assertEquals("0A0B", guess.guess("1234"));
    }

    @Test
    public void should_return_4A0B_when_input_is_5678_and_result_is_5678() {

        assertEquals("4A0B", guess.guess("5678"));
    }

    @Test
    public void should_return_2A2B_when_input_is_5768_and_result_is_5678() {

        assertEquals("2A2B", guess.guess("5768"));
    }
}
