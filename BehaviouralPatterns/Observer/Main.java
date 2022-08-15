public class Main {

    public static void main(String[] args){

        //Creating a monitor...
        SpeedMonitor monitor = new SpeedMonitor();

        //Creating the speedometer and register the monitor to it...
        Speedometer sp = new Speedometer();
        sp.addObserver(monitor);

        //Driving at different speeds...

        sp.setCurrentSpeed(50);
        sp.setCurrentSpeed(70);
        sp.setCurrentSpeed(40);
        sp.setCurrentSpeed(100);
        sp.setCurrentSpeed(69);

    }
}
