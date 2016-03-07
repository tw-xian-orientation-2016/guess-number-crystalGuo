public class Guess {

    private String answer;
    private CompareNumber compareNumber;

    public Guess(AnswerGenerator answerGenerator, CompareNumber compareNumber) {
        this.answer = answerGenerator.generate();
        this.compareNumber = compareNumber;
    }

    public String guess(String input) {
        return compareNumber.compareNumber(input, answer);
    }
}
