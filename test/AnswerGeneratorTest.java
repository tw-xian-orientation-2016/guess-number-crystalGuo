import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class AnswerGeneratorTest {

        @Test
        public void should_return_fout_digits_String() {
            AnswerGenerator answerGenerator = new AnswerGenerator();
            int length = answerGenerator.generateNumber().length();
            assertThat(length,is(4));
        }
    
}
