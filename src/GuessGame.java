import java.io.BufferedReader;
import java.io.PrintStream;

public class GuessGame {

    private PrintStream out;
    private BufferedReader read;
    private AnswerGenerator answerGenerator;
    private CompareNumber compareNumber;

    public GuessGame(PrintStream out, BufferedReader read, AnswerGenerator answerGenerator, CompareNumber compareNumber) {
        this.out = out;
        this.read = read;
        this.answerGenerator = answerGenerator;
        this.compareNumber = compareNumber;
    }

    public void guessNumber() throws Exception{

        out.println("Welcome!");
        int count = 6;
        String result = answerGenerator.generate();
        String comparingResult = "";

        while (count > 0) {
            out.println("please input your number(" + count + "):");
            String input = read.readLine();

            if(isDuplicate(input)) {
                out.println("Cannot input duplicate numbers!");
                out.println("please input your number(" + count + "):");
                input = read.readLine();
            }
            comparingResult = compareNumber.compareNumber(input, result);
            if (comparingResult.equals("4A0B")) {
                break;
            }
            out.println(comparingResult);
            count --;
        }
        if (comparingResult.equals("4A0B")) {
            out.println("congratulate!");
        }
        out.println("game over");
    }

    private boolean isDuplicate(String number) {
        int length = number.length();
        for(int i = 0; i < length; i++) {
            char digit = number.charAt(i);
            if(number.indexOf(digit) != number.lastIndexOf(digit)) {
                return false;
            }
        }

        return true;
    }
}
