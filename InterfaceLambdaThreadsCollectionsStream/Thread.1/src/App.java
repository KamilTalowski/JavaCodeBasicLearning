class One extends Thread{
    @Override
    public void run() {
        
        for(int i=0;i<100;i++){
            
            System.out.println("Hi ");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
}
class Two extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello ");
        }
    }
}
public class App{
    public static void main(String[] args) throws Exception {
        // Scanner scan= new Scanner(System.in);
        // String userInput = scan.nextLine();
        // System.out.println("Hej "+userInput); 
        //scan.close();
        
        One obj1= new One();
        Two obj2= new Two();
        obj1.setPriority(6);
        obj1.start();
        obj2.start();
        System.out.println(obj1.getPriority());
    }
}