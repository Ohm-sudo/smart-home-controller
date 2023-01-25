package itec3030.assignments.a2;

public class Humidifier extends PlainGasF1Decorator {

    Humidifier(OurFurnace f) { super.f = f; }

    @Override
    public void turnOn() {
        f.turnOn();
        System.out.println("Humidifier: On");
    }
}
