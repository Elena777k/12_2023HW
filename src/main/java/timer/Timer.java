package timer;

public class Timer {
    private static volatile int seconds = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread oneSecThread = new Thread(() -> {
            while (true) {
                seconds++;
                    if (seconds % 5 != 0) {
                        System.out.println(seconds + "s від запуску програми");}
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
            }
        });
        Thread fiveSecThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Минуло 5 секунд");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        oneSecThread.start();
        fiveSecThread.start();
    }
}



