public class EvenThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i += 2) {
                System.out.println("Even Thread: " + i);
                Thread.sleep(10);
            }
        } catch (Exception e){
            e.getStackTrace();
        }
    }
}
