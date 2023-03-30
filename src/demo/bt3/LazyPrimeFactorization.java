package demo.bt3;

public class LazyPrimeFactorization implements Runnable {
    private int number;

    public LazyPrimeFactorization(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        boolean checkPrime = checkPrime(number);
        if (checkPrime) {
            System.out.println(number + " Là số nguyên tố (không tối ưu hóa)");
        } else
            System.out.println(number + " Không phải là số nguyên tố (Không tối ưu hóa)");
    }

    private boolean checkPrime(int n) {
        for (int j = 2; j < n; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }
}
