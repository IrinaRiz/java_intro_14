package homework_1;

public class Payment {
    int amount;
    String speed;

    public Payment(int amount, String speed) {
        this.amount = amount;
        this.speed = speed;
    }

    void calculatePaymentFee() {
        if (amount >= 5000 && speed.equals("Immediate")) {
            System.out.println("Payment fee is high and equal to $" + amount * 0.05);
        }
        if (amount >= 5000 && speed.equals("Standard") || amount < 5000 && speed.equals("Immediate")) {
            System.out.println("Payment fee is moderate and equal to $+" + amount * 0.02);
        }
        if (amount < 5000 && speed.equals("Standard")){
            System.out.println("Your payment is totally free!");
        }
    }
}

