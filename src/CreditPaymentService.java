public class CreditPaymentService {

    public double calculate(double creditAmount, double percentageRate, double creditTermInMonths) {
        double monthlyInterestRate = percentageRate / 12 / 100;
        double annuityRate = monthlyInterestRate * Math.pow((1 + monthlyInterestRate), creditTermInMonths) / (Math.pow((1 + monthlyInterestRate), creditTermInMonths) -1);
        double theAmountOfTheAnnuityPayment = annuityRate * creditAmount;
        return theAmountOfTheAnnuityPayment;
    }
}