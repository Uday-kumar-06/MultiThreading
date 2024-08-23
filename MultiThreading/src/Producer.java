public class Producer extends Thread{
    Company com;

    Producer(Company com){
        this.com =com;
    }

    public void run(){
        int i =1;
        while(true){
            try{this.com.produce_item(i);}
            catch(Exception e){}
            try{Thread.sleep(1000);}catch(Exception e){}
            i++;
        }
    }
}
