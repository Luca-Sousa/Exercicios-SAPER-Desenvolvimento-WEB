public class Main {
    public static void main(String[] args) throws Exception {

        TimeService timeService = new TimeService();
        TypeService typeService = new TypeService();

        PayService payService = new PayService(typeService, timeService);

        System.out.println(payService.calcCost(78, "carro"));
    }
}
