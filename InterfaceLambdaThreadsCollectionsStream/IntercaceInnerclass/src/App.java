public class App{
    public static void main(String[] args) throws Exception {
        // Scanner scan= new Scanner(System.in);
        // String userInput = scan.nextLine();
        // System.out.println("Hej "+userInput); 
        //scan.close();
        
        // Runnable obj1= new One();
        // Runnable obj2= new Two();
        Runnable objX = new Runnable(){
            public void run ()
        {
            for(int i=0;i<100;i++){
                System.out.println("Hi ");} 
        }
        };
        Runnable objY = ()->
                {
        for(int i=0;i<100;i++){
            System.out.println("Hello ");
        }
        };
        Thread t1 = new Thread(objX);
        Thread t2 = new Thread(objY);

        t1.start();
        t2.start();
        System.out.println(t1.getPriority());
    }
}