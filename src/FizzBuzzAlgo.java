public class FizzBuzzAlgo {
    public String getFizzBuzz(int num) {
        if (isFizz(num) && isBuzz(num)) {
            return "FizzBuzz";
        } else if (isFizz(num)) {
            return "Fizz";
        } else if (isBuzz(num)) {
            return "Buzz";
        }
        return "";
    }

    boolean isFizz(int num) {
        return num % 3 == 0;
    }

    boolean isBuzz(int num) {
        return num % 5 == 0;
    }
}
