import javafx.util.Pair

class FizzBuzzTest extends GroovyTestCase {
    FizzBuzz fizzBuzz
    @Override
    protected void setUp() throws Exception {
        fizzBuzz = new FizzBuzz(new FizzBuzzAlgo())
    }

    void addEmptyPairs(List<Pair<Integer, String>> expectedResultSeries, int num) {
        expectedResultSeries.add(new Pair<Integer, String>(num, ""))
    }

    void testFizzBuzzWithOne() throws Exception {
        List<Pair<Integer, String>> fizzBuzzSeries = fizzBuzz.generateSeries(1)
        List<Pair<Integer, String>> expectedResultSeries = new LinkedList<>()
        addEmptyPairs(expectedResultSeries, 1)
        assertEquals(expectedResultSeries, fizzBuzzSeries)
    }

    void testIncludeFizz() throws Exception {
        List<Pair<Integer, String>> fizzBuzzSeries = fizzBuzz.generateSeries(3)
        List<Pair<Integer, String>> expectedResultSeries = new LinkedList<>()
        addEmptyPairs(expectedResultSeries, 1)
        addEmptyPairs(expectedResultSeries, 2)
        expectedResultSeries.add(new Pair<Integer, String>(3, "Fizz"))
        assertEquals(expectedResultSeries, fizzBuzzSeries)
    }

    void testIncludeFizzOrBuzz() throws Exception {
        List<Pair<Integer, String>> fizzBuzzSeries = fizzBuzz.generateSeries(5)
        List<Pair<Integer, String>> expectedResultSeries = new LinkedList<>()
        addEmptyPairs(expectedResultSeries, 1)
        addEmptyPairs(expectedResultSeries, 2)
        expectedResultSeries.add(new Pair<Integer, String>(3, "Fizz"))
        addEmptyPairs(expectedResultSeries, 4)
        expectedResultSeries.add(new Pair<Integer, String>(5, "Buzz"))
        assertEquals(expectedResultSeries, fizzBuzzSeries)
    }

    void testAllCases() throws  Exception {
        List<Pair<Integer, String>> fizzBuzzSeries = fizzBuzz.generateSeries(15)
        List<Pair<Integer, String>> expectedResultSeries = new LinkedList<>()

        addEmptyPairs(expectedResultSeries, 1)
        addEmptyPairs(expectedResultSeries, 2)
        expectedResultSeries.add(new Pair<Integer, String>(3, "Fizz"))
        addEmptyPairs(expectedResultSeries, 4)
        expectedResultSeries.add(new Pair<Integer, String>(5, "Buzz"))
        expectedResultSeries.add(new Pair<Integer, String>(6, "Fizz"))
        addEmptyPairs(expectedResultSeries, 7)
        addEmptyPairs(expectedResultSeries, 8)
        expectedResultSeries.add(new Pair<Integer, String>(9, "Fizz"))
        expectedResultSeries.add(new Pair<Integer, String>(10, "Buzz"))
        addEmptyPairs(expectedResultSeries, 11)
        expectedResultSeries.add(new Pair<Integer, String>(12, "Fizz"))
        addEmptyPairs(expectedResultSeries, 13)
        addEmptyPairs(expectedResultSeries, 14)
        expectedResultSeries.add(new Pair<Integer, String>(15, "FizzBuzz"))
        assertEquals(expectedResultSeries, fizzBuzzSeries)
    }
}
