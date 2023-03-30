package demo.bt3;

public class Main {
    public static void main(String[] args) {
        int num = 1117;
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization(num);
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization(num);
        Thread lazy = new Thread(lazyPrimeFactorization);
        Thread optimized = new Thread(optimizedPrimeFactorization);
        lazy.start();
        optimized.start();
    }
}
