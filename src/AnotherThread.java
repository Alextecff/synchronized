public class AnotherThread extends Thread {
    Container container;

    public AnotherThread(Container container){
        this.container = container;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(System.currentTimeMillis()%100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (container) {
            container.x++;
            container.y++;
            container.z++;
        }
    }

}
