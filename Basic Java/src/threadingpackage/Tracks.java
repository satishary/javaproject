package threadingpackage;

public class Tracks {

    int trackname;

    public Tracks(int trackname) {
        this.trackname = trackname;

    }

    public synchronized void passTheTrain(Train train) {
        try {
            System.out.println(train + " is crossing " + this);
            for (int i = 1; i <= 5; i++) {
                System.out.println(train + " " + i);
                Thread.sleep(1000);
            }
            System.out.println(train + " has crossed " + this);
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }

    @Override
    public String toString() {
        return "Tracks{" + "trackname=" + trackname + '}';
    }
}
