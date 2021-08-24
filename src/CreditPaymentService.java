public class CreditPaymentService {
    public int calculate(int mounth, double percent, int amount) {
        double a = percent/12/100;
        double b = Math.pow ((1+a),mounth);
        double coefficient = (a * b) / (b - 1);
        int payment = (int) (coefficient * amount);
        return payment;
    }
}
