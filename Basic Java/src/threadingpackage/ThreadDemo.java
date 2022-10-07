package threadingpackage;

public class ThreadDemo implements Runnable{
/****
    A thread is a separate process inside a single program.
    * To create a thread we implement the Runnable Interface or extend the Thread class.
    * 
    * The Thread class itself implements the Runnable interface, so it is the same thing.
    * 
    * The job of the Thread is coded inside the run method.
    * Lifecycle methods are
    * start. Starts a Thread
    * stop. Stops a Thread permanently
    * resume. Restarts a paused Thread
    * suspend, Pauses a Thread
     
      
     
     
     
     
 */
 

    

    @Override
    public void run() {
    for(int i=1;i<=10;i++){
        try{
            System.out.println(i);
            Thread.sleep(1000);
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
        
    }
    public static void main(String[] args) {
        ThreadDemo th1=new ThreadDemo();
        ThreadDemo th2=new ThreadDemo();
        Thread t1=new Thread(th1);
           Thread t2=new Thread(th2);
        
        t1.start();
        t2.start();
    }
}
