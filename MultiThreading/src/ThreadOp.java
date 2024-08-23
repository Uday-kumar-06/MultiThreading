public class ThreadOp {
    public static void main(String [] args){
        System.out.println("Program Started...");
        int x = 56+34;
        System.out.println("sum is "+x);
        //Thread...
        Thread t = Thread.currentThread();
        String tName =t.getName();
        System.out.println("Current running thread is "+ tName);

        //Set the Thread name
        t.setName("MyMain");
        System.out.println(t.getName());

        try{Thread.sleep(5000);}catch(Exception e){};
        System.out.println(t.getId());

        System.out.println("Program is Ended..");
        UserThread user =new UserThread();
        user.start();
    }
}

class UserThread extends Thread{
    public void run(){
        //task
        System.out.println("user thread");
    }
}
