import java.util.Observable;

public class Speedometer extends Observable {
    private int currentSpeed = 0;

    public Speedometer(){
       // this.currentSpeed = 0;

    }

    /**
     * Sets the current speed*
     * @param speed as an integer
     */
    public void setCurrentSpeed(int speed){
        this.currentSpeed = speed;

        //Tell all observers so they know speed has changed.
        setChanged();
        notifyObservers();

    }

    public int getCurrentSpeed(){
        return this.currentSpeed;

    }

}