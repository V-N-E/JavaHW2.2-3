public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditAmount = 1_000_000;
        double percentageRate = 9.99;

        double monthlyPaymentForOneYear = service.calculate(creditAmount, percentageRate, 12);
        System.out.println("Сумма ежемесячного платежа: " + Math.round(monthlyPaymentForOneYear) + " ₽");

        double monthlyPaymentForTwoYears = service.calculate(creditAmount, percentageRate, 24);
        System.out.println("Сумма ежемесячного платежа: " + Math.round(monthlyPaymentForTwoYears) + " ₽");

        double monthlyPaymentForThreeYears = service.calculate(creditAmount, percentageRate, 36);
        System.out.println("Сумма ежемесячного платежа: " + Math.round(monthlyPaymentForThreeYears) + " ₽");
    }
}