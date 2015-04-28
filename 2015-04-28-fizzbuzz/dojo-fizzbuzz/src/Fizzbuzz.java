public class Fizzbuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String transform(Integer number) {
        String result = "";
        if (number % 3 == 0) {
            result += FIZZ;
        }
        if (number % 5 == 0) {
            result += BUZZ;
        }
        if (result.isEmpty()) {
            return number.toString();
        }
        return result;
    }
}