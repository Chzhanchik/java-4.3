public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int mounth = 36;
        double percent = 9.99;
        int amount = 1_000_000;
        int payment = service.calculate(mounth, percent, amount);
        System.out.println(payment);
    }
}

