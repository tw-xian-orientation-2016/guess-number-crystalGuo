public class NumberComparing {

    public String compareNumber(String input, String result) {
        int countA = 0;
        int countB = 0;

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == result.charAt(i)) {
                countA ++;
            } else if(result.contains(String.valueOf(input.charAt(i)))) {

            }
        }

        return countA + "A" + countB + "B";
    }
}
