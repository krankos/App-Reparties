public class CounterThreadRunnable implements Runnable {
    private int i;
    private static int position = 0;

    public CounterThreadRunnable(int i) {
        super();
        this.i = i;
    }

    public void run() {
        Counter c = new Counter(Thread.currentThread().getName());
        c.count(this.i);
        System.out.println("Counter " + Thread.currentThread().getName() + " finished at position " + ++position + "");
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
