public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnotherThread anotherThread;
        Container container = new Container();

        for (int i = 0; i < 100; i++) {
            anotherThread = new AnotherThread(container);
            anotherThread.start();
        }
        Thread.sleep(1500);
        System.out.println(container.x);
        System.out.println(container.y);
        System.out.println(container.z);
    }

}
