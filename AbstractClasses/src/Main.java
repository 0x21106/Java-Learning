public class Main {

    public static void main(String[] args) {

        GameCalculator[] gameCalculator = {new WomanGameCalculator(), new KidsGameCalculator()};

        for(GameCalculator calculator : gameCalculator) {
            calculator.calculate();
        }

    }
}
