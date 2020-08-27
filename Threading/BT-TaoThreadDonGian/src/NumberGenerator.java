public class NumberGenerator implements Runnable{
    private String name;

    public NumberGenerator() {}

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(this.name +" "+ i);
                Thread.sleep(500);
            }
        } catch (Exception e){
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t1=new Thread(new NumberGenerator("Num1"));
        Thread t2=new Thread(new NumberGenerator("Num2"));

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        
        t1.start();
        t2.start();


    }

}
