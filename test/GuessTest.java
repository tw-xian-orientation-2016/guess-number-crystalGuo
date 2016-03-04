import org.junit.Test;
import org.mockito.Mock;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTest {

    @Test
    public void should_return_0A0B_when_input_is_1234_and_result_is_5678() {
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn("5678");

        CompareNumber compareNumber = mock(CompareNumber.class);
        when(compareNumber.compareNumber("1234", "5678")).thenReturn("0A0B");

        Guess guess = new Guess(answerGenerator, compareNumber);
        assertEquals("0A0B", guess.guess("1234"));
    }

    @Test
    public void should_return_2A2B_when_input_is_1234_and_result_is_5328() {
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn("5328");

        CompareNumber compareNumber = mock(CompareNumber.class);
        when(compareNumber.compareNumber("1234", "5328")).thenReturn("2A2B");

        Guess guess = new Guess(answerGenerator, compareNumber);
        assertEquals("2A2B", guess.guess("1234"));
    }

    @Test
    public void should_return_4A0B_when_input_is_1234_and_result_is_1234() {
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generate()).thenReturn("1234");

        CompareNumber compareNumber = mock(CompareNumber.class);
        when(compareNumber.compareNumber("1234", "1234")).thenReturn("4A0B");

        Guess guess = new Guess(answerGenerator, compareNumber);
        assertEquals("4A0B", guess.guess("1234"));
    }
}
