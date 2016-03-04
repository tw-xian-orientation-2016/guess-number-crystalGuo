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
        answerGenerator.setRandom(random);

        assertThat(answerGenerator.generateNumber(),is("1234"));
    }
}
