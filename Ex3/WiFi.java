package itec3030.assignments.a2;

public class WiFi extends PlainGasF1Decorator {

    WiFi(OurFurnace f) { super.f = f; }

    @Override
    public void turnOn() {
        f.turnOn();
        System.out.println("Wifi: Initialized");
    }
}
