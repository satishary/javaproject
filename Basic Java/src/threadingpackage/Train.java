package threadingpackage;

public class Train {
    String trainname;
    int trainnumber;

    public Train(String trainname,int trainnumber ) {
        this.trainname = trainname;
        this.trainnumber=trainnumber;
    }

    @Override
    public String toString() {
        return "Train{" + trainnumber + '}';
    }

    
}
