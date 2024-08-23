public class MyThread implements Runnable{
    @Override
    // we should override if we are implementing any interface
    public void run() {
        //task for thread..
        for(int i = 0;i<=10;i++){
            System.out.println(i);
            try{Thread.sleep(1000);
            }catch(Exception e){}
        }
    }

    public static void main(String [] args){
        //Create a object of MyThread class..
        MyThread t1 = new MyThread();
        Thread thread = new Thread(t1);
        thread.start();
    }
}
