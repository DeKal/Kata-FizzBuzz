class FizzBuzzAlgoTest extends GroovyTestCase{
    FizzBuzzAlgo algo

    @Override
    protected void setUp() throws Exception {
        algo = new FizzBuzzAlgo()
    }

    void testFizzBuzzStartWithOne() throws Exception {
        String str = algo.getFizzBuzz(1)
        assertEquals("", str)
    }

    void testFizzCase() throws Exception {
        String str = algo.getFizzBuzz(3)
        assertEquals("Fizz", str)
    }

    void testBuzzCase() throws Exception {
        String str = algo.getFizzBuzz(5)
        assertEquals("Buzz", str)
    }

    void testFizzBuzzCase() throws Exception {
        String str = algo.getFizzBuzz(15)
        assertEquals("FizzBuzz", str)
    }

    void testNotFizzBuzzCase() throws Exception {
        String str = algo.getFizzBuzz(8)
        assertEquals("", str)
    }
}
