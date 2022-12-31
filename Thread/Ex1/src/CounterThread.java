
public class CounterThread extends Thread {
    private int i;
    public static int position = 0;

    public CounterThread(String name, int i) {
        super(name);
        this.i = i;
    }

    public void run() {
        Counter c = new Counter(this.getName());
        c.count(this.i);
        System.out.println("Counter " + this.getName() + " finished at position " + ++position + "");

        // for (int i = 1; i <= this.i; i++) {
        // System.out.println("Counter " + this.getName() + " :" + i);
        // try {
        // Thread.sleep((int) (Math.random() * 500));
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        // System.out.println("Counter " + this.getName() + " finished");
    }

}
