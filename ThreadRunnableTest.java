public class ThreadRunnableTest implements Runnable {
    public static void main(String[] args) {
        ThreadRunnableTest test=new ThreadRunnableTest();
        Thread thread=new Thread(test);
        thread.start();
    }

    public void run(){
        System.out.println("Inside thread run");
    }
}
