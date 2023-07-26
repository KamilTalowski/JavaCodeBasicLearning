class Counter{
    int count;

    public synchronized void icrement(){
        count++;
    }
}
public class App{
    public static void main(String[] args) throws Exception {
        Counter counter= new Counter();

        Runnable objX = new Runnable(){
            public void run ()
        {
                for(int i=0;i<1000;i++){
                    counter.icrement();
        }
        }
        };
        Runnable objY = ()->{
            for(int i=0;i<1000;i++){
                counter.icrement();
        }
        };
        //thread states: new start()-> Runnable rubn()-> Running sleep(),wait()-> waiting notify()-> Runnable
        // or Runnable/Running stop() ->  Dead
        Thread t1 = new Thread(objX);
        Thread t2 = new Thread(objY);

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        Thread.sleep(1);
        System.out.println(counter.count);
    }
}