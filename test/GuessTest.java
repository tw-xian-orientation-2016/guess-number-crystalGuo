import org.junit.Test;
import org.mockito.Mock;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {

    @Test
    public void should_return_2A2B_when_input_is_1234_and_result_is_5328() {
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn("5328");

        CompareNumber compareNumber = mock(CompareNumber.class);
        when(compareNumber.compareNumber("1234", "5328")).thenReturn("2A2B");

        Guess guess = new Guess(answerGenerator, compareNumber);
        assertEquals("2A2B", guess.guess("1234"));
    }
}
