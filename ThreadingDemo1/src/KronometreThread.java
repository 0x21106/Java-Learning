public class KronometreThread implements Runnable {

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Oluşturuluyor : " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor : " + this.threadName);
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(this.threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Kesildi: " + this.threadName);
        }
        System.out.println("Thread bitti: " + this.threadName);
    }

    public void start() {
        System.out.println("Thread nesnesi oluşturuluyor");
        if(thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
