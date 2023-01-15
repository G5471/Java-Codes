// create thread using runnable interface..........
public class MyThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            };
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread thr = new Thread(t);
        MyThread2 t1=new MyThread2();
        thr.start();
        t1.start();
    }
}