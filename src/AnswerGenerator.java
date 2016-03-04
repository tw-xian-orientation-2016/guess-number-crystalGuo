import java.util.Random;

public class AnswerGenerator {

    public String generateNumber() {
        String result = "";

        for(int i = 0; i < 4; i++) {
            Random random = new Random();
            result += String.valueOf(random.nextInt(10));
        }

        return result;
    }
}
