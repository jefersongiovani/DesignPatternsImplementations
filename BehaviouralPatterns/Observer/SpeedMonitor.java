import java.util.Observable;
import java.util.Observer;

public class SpeedMonitor implements Observer {

    public static final int SPEED_ALERT = 70;

    public void update(Observable o, Object obj){
        Speedometer spd = (Speedometer) obj;
        if(spd.getCurrentSpeed() > SPEED_ALERT){
            System.out.println("*** Alert *** Driving too fast! (" + spd.getCurrentSpeed() + ")");
        }
        else{
            System.out.println("... nice and steady ...(" + spd.getCurrentSpeed() + ")");
        }

    }

}