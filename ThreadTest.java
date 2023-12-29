class ThreadTest extends Thread{
    public static void main(String[] args) {
        System.out.println("Thread");
        ThreadTest test=new ThreadTest();
        test.start();
    }

    public void run(){
        System.out.println("Inside Thread");
    }
}