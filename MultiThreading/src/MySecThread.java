public class MySecThread extends Thread{
    public void run(){
        int i =10;
        while(i >= 1){
            System.out.println("value of i = "+ i);
            i--;
            try{
                Thread.sleep(3000);
            }catch(Exception e){}
        }
    }
    public static void main(String [] args){
        Thread tm = Thread.currentThread();
        MyThread t1 = new MyThread();
        Thread thread  = new Thread(t1);
        MySecThread t = new MySecThread();

        thread.start();
        t.start();

    }
}
