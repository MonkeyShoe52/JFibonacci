public class Fibonacci implements Runnable {
    int amountofNumbersInSequence;
    int number1;
    int number2;

    public int getAmountofNumbersInSequence() {
        return amountofNumbersInSequence;
    }

    public void setAmountofNumbersInSequence(int amountofNumbersInSequence) {
        this.amountofNumbersInSequence = amountofNumbersInSequence;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public Fibonacci(int amountofNumbersInSequence, int number1, int number2) {
        this.amountofNumbersInSequence = amountofNumbersInSequence;
        this.number1 = number1;
        this.number2 = number2;
    }


    public void calculate() {
        // System.out.print();
        int num1;
        int num2;
        int num3;

        num1 = number1;
        num2 = number2;


        for (int i = 0; i <= amountofNumbersInSequence; i = i + 1) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
            System.out.println(amountofNumbersInSequence );

            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        calculate();
    }
}








