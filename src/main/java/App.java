/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws Exception {
        thread(new HelloWorldProducer(), false);
        thread(new HelloWorldConsumer(), false);
        Thread.sleep(1000);

    }

    public static void thread(Runnable runnable, boolean daemon) {
        Thread brokerThread = new Thread(runnable);
        brokerThread.setDaemon(daemon);
        brokerThread.start();
    }

}