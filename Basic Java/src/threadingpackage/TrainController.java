
package threadingpackage;

public class TrainController extends Thread{
Train train;
Tracks tracks;

    public TrainController(Train train, Tracks tracks) {
        this.train = train;
        this.tracks = tracks;
    }
public void run()
{
    System.out.println(train + " attempting to  cross " + tracks);
    tracks.passTheTrain(train);
}
    public static void main(String[] args) {
        Tracks t1 = new Tracks(1);
        Tracks t2 = new Tracks(2);
        Tracks t3 = new Tracks(3);
        Tracks t4 = new Tracks(4);

        Train train1 = new Train("Darbhanga Beijing Express", 1);
        
        Train train2 = new Train("InterCity Express", 2);
      
        Train train3 = new Train("Garibrath Express", 3);
        
        Train train4 = new Train("lucknow Express", 4);
        
TrainController tc1=new TrainController(train1, t1);
TrainController tc2=new TrainController(train2, t1);
TrainController tc3=new TrainController(train3, t2);
TrainController tc4=new TrainController(train4, t1);
tc1.start();
tc4.start();
tc2.start();
tc3.start();
    }

}