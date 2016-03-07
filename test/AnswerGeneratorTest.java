import org.junit.Test;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnswerGeneratorTest {

    @Test
    public void should_return_four_digits_String() {
        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1, 2, 3, 4);
        AnswerGenerator answerGenerator = new AnswerGenerator(random);

        assertThat(answerGenerator.generate(),is("1234"));
    }

    @Test
    public void should_return_no_duplicate_four_digit_String() {
        Random random = mock(Random.class);
        when(random.nextInt(10)).thenReturn(1, 2, 2, 3, 4);
        AnswerGenerator answerGenerator = new AnswerGenerator(random);

        assertThat(answerGenerator.generate(),is("1234"));
    }

}
