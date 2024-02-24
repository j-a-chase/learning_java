public class ConcurrencyProbExample implements Runnable{
    public static int amount = 0;

    public static void main(String[] args) {
        ConcurrencyProbExample obj = new ConcurrencyProbExample();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println(amount); // not guaranteed to be zero
        amount++;
        System.out.println(amount); // not guaranteed to be two (or one)
    }

    public void run() {
        amount++;
    }
}
