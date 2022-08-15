import java.util.Observable;

/**
 * Class that represents the speedometer itself
 * This class registers the actual speed and notify the "listeners" about the change * *
 */
public class Speedometer extends Observable {

    //Private variables
    private int currentSpeed;

    //Constructor
    public Speedometer(){
       this.currentSpeed = 0;
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

    /**
     * Sets the current speed*
     * @return int. The current speed.
     */
    public int getCurrentSpeed(){
        return this.currentSpeed;

    }

}