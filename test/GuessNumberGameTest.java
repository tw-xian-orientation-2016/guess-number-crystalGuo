import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class GuessNumberGameTest{

    private PrintStream out;
    private BufferedReader read;
    private AnswerGenerator answerGenerator;
    private CompareNumber compareNumber;
    private GuessGame guessGame;

    @Before
    public void setUp() throws IOException {
        out = mock(PrintStream.class);
        read = mock(BufferedReader.class);
        answerGenerator = mock(AnswerGenerator.class);
        compareNumber = new CompareNumber();

        guessGame = new GuessGame(out, read, answerGenerator, compareNumber);

    }

   @Test
    public void should_print_welcome_when_game_start() throws Exception {

        when(read.readLine()).thenReturn("1234");
        when(answerGenerator.generate()).thenReturn("1234");

        verify(out, never()).println("Welcome!");
        guessGame.guessNumber();
        verify(out).println("Welcome!");
    }
    
}
