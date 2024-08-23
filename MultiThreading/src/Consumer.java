public class Consumer extends Thread{

    Company com;
    Consumer(Company com){
        this.com = com;
    }
    public void run(){
        while(true){
            try {
                this.com.consume_item();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            try{Thread.sleep(2000);}catch(Exception e){}
        }
    }
}
