package itec3030.assignments.a2;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.TemperatureSensor;
import oldtempinc.drivers.OldTempSensor;

public class OldTempSensorAdapter implements TemperatureSensor {
    protected ControllerInterface c;
    protected float currTemp = 0.0F;
    protected String ID;
    protected boolean enabled;
    OldTempSensor s = new OldTempSensor();

    @Override
    public void newTemperature(int i) {
        this.currTemp = i;
        s.newTemperature(i);
    }
    public ControllerInterface getController() {
        return this.c;
    }

    public void setController(ControllerInterface controllerInterface) { this.c = c; }

    public String getID() {
        return null;
    }

    public void setID(String s) {
        ID = s;
    }

    public void enable() {
        this.enabled = true;
    }

    public void disable() {
        this.enabled = false;
    }

    public boolean enabled() { return this.enabled; }

    public int getReading() {
        return (int) currTemp;
    }
}
