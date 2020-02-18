public class Main {

    public static void main(String[] args) {
        BaseCreditManager[] creditManager = new BaseCreditManager[]{new TeacherCreditManager(), new FarmingCreditManager()};
        for(BaseCreditManager credit : creditManager) {
            System.out.println(credit.calculate(1000));
        }
    }
}
