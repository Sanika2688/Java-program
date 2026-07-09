import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ThreadSleepDemo {

    static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm:ss");

    static void log(String message) {
        System.out.println("[" + LocalTime.now().format(fmt) + "] " + message);
    }

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            String[] messages = {
                "Thread starting...",
                "Working on step 1",
                "Working on step 2",
                "Working on step 3",
                "Thread finished!"
            };

            for (String message : messages) {
                log(message);
                try {
                    Thread.sleep(2000); 
                } catch (InterruptedException e) {
                    System.out.println("Thread was interrupted!");
                    Thread.currentThread().interrupt(); 
                    return;
                }
            }
        });

        thread.start();

        try {
            thread.join(); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main program complete.");
    }
} 