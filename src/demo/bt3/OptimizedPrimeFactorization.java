package demo.bt3;

public class OptimizedPrimeFactorization implements Runnable {
    private int number;

    public OptimizedPrimeFactorization(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        boolean check = checkPrime(number);
        if (check) {
            System.out.println(number + " Là số nguyên tố (Tối ưu hóa)");
        } else {
            System.out.println("Không phải là số nguyên tố (tối ưu hóa)");
        }
    }

    private boolean checkPrime(int nub) {
        for (int i = 2; i < Math.sqrt(nub); i++) {
            if (nub % i == 0) {
                return false;
            }
        }
        return true;
    }
}
