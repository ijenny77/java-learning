enum TrafficL {
    RED,
    YELLOW,
    GREEN
}

public class TrafficLight {
    public static void main(String[] args) {
        TrafficLight light = TrafficL.RED;

        switch(light) {
            case RED:
                System.out.println("Stop");
                break;

            case YELLOW:
                System.out.println("Prepare");
                break;

            case GREEN:
                System.out.println("Go");
                break;
        }
    }
} 
