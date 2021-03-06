import java.util.Random;

public class AnswerGenerator {

    private Random random;

    public AnswerGenerator(Random random) {
        this.random = random;
    }

    public String generate() {
        String result = "";

       while(result.length() < 4) {
           String digit = String.valueOf(random.nextInt(10));

           if(result.indexOf(digit) == -1) {
               result += digit;
           }
       }

        return result;
    }
}
