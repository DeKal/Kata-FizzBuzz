import javafx.util.Pair;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
    FizzBuzzAlgo fizzBuzzAlgo;

    FizzBuzz(FizzBuzzAlgo algo) {
        fizzBuzzAlgo = algo;
    }

    public List<Pair<Integer, String>> generateSeries(int num) {
        LinkedList<Pair<Integer, String>> series = new LinkedList<>();
        for (int fizzBuzzNum = 1; fizzBuzzNum <= num; ++fizzBuzzNum) {
            String fizzBuzzStr = fizzBuzzAlgo.getFizzBuzz(fizzBuzzNum);
            series.add(new Pair<>(fizzBuzzNum, fizzBuzzStr));
        }
        return series;
    }
}
