package itec3030.assignments.a2;

import itec3030.smarthome.standards.ControllerInterface;
import newtemp.NewTempSensor.NewTempSensorDriver;
import newtemp.NewTempSensor.Observer;

public class NewTempSensorAdapter implements AbstractNewTempSensorAdapter, Observer
{
    protected ControllerInterface c;
    protected float currTemp = 0.0F;
    protected boolean enabled;
    protected String ID;
    NewTempSensorDriver n = new NewTempSensorDriver();

    NewTempSensorAdapter() {
        this.n.registerObserver(this);
    }
    public NewTempSensorDriver getAdatptee() {
        return n;
    }

    @Override
    public void newTemperature(int i) {
        this.currTemp = i;
        n.newTemperature(i);
    }

    public void update(int i) {
        this.currTemp = i;
        System.out.println("Sensor " + this.getID() + " receiving new temperature: " + i);
    }

    public ControllerInterface getController() {
        return this.c;
    }

    public void setController(ControllerInterface controllerInterface) { this.c = c; }

    public String getID() {
        return this.ID;
    }
    public void setID(String s) {
        this.ID = s;
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
