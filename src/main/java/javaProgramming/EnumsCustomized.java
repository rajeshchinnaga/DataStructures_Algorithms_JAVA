package javaProgramming;

enum TrafficSignals{
    RED("STOP"),GREEN("GO"),ORANGE("READY TO START");

    private String action;

    public String getAction() {
        return this.action;
    }

    private TrafficSignals(String action){
        this.action = action;
    }
}
public class EnumsCustomized {
    public static void main(String[] args){

        TrafficSignals[] signals = TrafficSignals.values();
        for(TrafficSignals signal: signals){
            System.out.println("Color: "+signal.name()+"-----> Required Action: "+signal.getAction());
        }
    }
}
