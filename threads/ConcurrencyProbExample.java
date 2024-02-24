public class ConcurrencyProbExample implements Runnable{
    public static int amount = 0;

    public static void main(String[] args) {
        ConcurrencyProbExample obj = new ConcurrencyProbExample();
        Thread thread = new Thread(obj);
        thread.start();

        // we wait here for the thread to finish!
        while(thread.isAlive()) {
            System.out.println("Waiting...");
        }
        
        // these values are now guaranteed to be one and two, respectively!
        System.out.println(amount); 
        amount++;
        System.out.println(amount); 
    }

    public void run() {
        amount++;
    }
}
