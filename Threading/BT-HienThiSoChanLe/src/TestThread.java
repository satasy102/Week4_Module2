public class TestThread {
    public static void main(String[] args) {
        OddThread oT=new OddThread();
        EvenThread eT=new EvenThread();

        oT.start();
        try {
            oT.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        eT.start();
    }
}
