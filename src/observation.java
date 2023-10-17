public class observation {

    private int heartRate;
    private String bloodPressure;
    private float temperature;

    //Overriding toString
    public String toString(){
        return heartRate + " BPM, " + bloodPressure + ", " + temperature + " °F";
    }

}
