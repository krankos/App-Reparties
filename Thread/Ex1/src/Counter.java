public class Counter {
    private String name;

    public Counter(String name) {
        this.name = name;
    }

    // add synchronized keyword for last question

    public synchronized void count(int n) {
        // count from 1 to n with a random delay between 0 and 500 milliseconds
        // for (int i = 1; i <= n; i++) {
        // System.out.println("Counter " + this.name + " :" + i);
        // try {
        // Thread.sleep((int) (Math.random() * 500));
        // } catch (InterruptedException e) {
        // e.printStackTrace();
        // }
        // }
        // System.out.println("Counter " + this.name + " finished couting to " + n +
        // "");

        // same logic but using wait rather than sleep for last question
        for (int i = 1; i <= n; i++) {
            System.out.println("Counter " + this.name + " :" + i);
            try {
                this.wait((int) (Math.random() * 500));
            }

            catch (InterruptedException e) {
                e.printStackTrace();
            }
            // wakey waaaaakey
            finally {
                this.notify();
            }
        }

    }
}
