public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lpf=new LazyPrimeFactorization(100);
        OptimizedPrimeFactorization opf=new OptimizedPrimeFactorization(100);

        Thread t1=new Thread(lpf);
        Thread t2=new Thread(opf);
        t1.start();
        t2.start();
    }
}
