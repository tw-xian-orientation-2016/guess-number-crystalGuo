public class NumberComparing {

    public String compareNumber(String input, String result) {
        int A = 0;
        int B = 0;

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == result.charAt(i)) {
                A ++;
            } else if(result.contains(String.valueOf(input.charAt(i)))) {
                B++;
            }
        }

        return A + "A" + B + "B";
    }
}
