public class NumberComparing {

    public String compareNumber(String input, String result) {
        int countA = 0;
        int countB = 0;

        for(int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            if(result.indexOf(digit) == -1) {
                break;
            }
        }

        return countA + "A" + countB + "B";
    }
}
