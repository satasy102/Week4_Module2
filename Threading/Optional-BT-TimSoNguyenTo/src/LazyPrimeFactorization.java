public class LazyPrimeFactorization implements Runnable{
    private int num;

    public LazyPrimeFactorization(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for(int i=0;i<num;i++){
            boolean check=false;
            for(int j=2;j<i;j++){
                if(i%j==0) {
                    check=false;
                    break;
                } check=true;
            }
            if(check) System.out.println("LPF " + i);
        }
    }
}
