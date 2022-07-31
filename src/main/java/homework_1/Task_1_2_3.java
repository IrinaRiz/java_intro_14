package homework_1;

public class Task_1_2_3 {
    public static void main(String[] args) {
        int a = 14;
        int b = 52;
        double c = 7.9;
        short sh1 = (short) (-32768 - 1);
        short sh2 = (short)(32767 + 1);
        if(a > b){
            System.out.println(a - b);
        }
        else if (a == b){
            System.out.println(a * b);
        }
        else{
            System.out.println(b - a);
        }

        System.out.println(a + b);
        System.out.println(b / a);
        System.out.println(a % b);
        System.out.println(b * c);
        System.out.println(Math.pow(2, 15));
        System.out.println( a > b);
        System.out.println(3 == 3);
        System.out.println(sh1);
        System.out.println(sh2);
        System.out.println(-2147483648 - 1);
        System.out.println(2147483647 + 1);
        System.out.println(0.1 * 0.1);

        System.out.println("_______________________________________________________________________________________________________");

        Payment payment1 = new Payment(5001,"Immediate");
        Payment payment2 = new Payment(4999,"Immediate");
        Payment payment3 = new Payment(5001,"Standard");
        Payment payment4 = new Payment(4999,"Standard");

        payment1.calculatePaymentFee();
        payment2.calculatePaymentFee();
        payment3.calculatePaymentFee();
        payment4.calculatePaymentFee();
    }
}
