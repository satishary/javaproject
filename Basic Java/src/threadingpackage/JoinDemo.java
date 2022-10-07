package threadingpackage;

public class JoinDemo extends Thread {

    int delay;

    public JoinDemo(int delay) {
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println(i);
                Thread.sleep(delay);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinDemo demo1 = new JoinDemo(500);
        JoinDemo demo2 = new JoinDemo(800);
        demo1.start();
        demo2.start();
        demo1.join();
        demo2.join();
        System.out.println("Done");
    }

}
