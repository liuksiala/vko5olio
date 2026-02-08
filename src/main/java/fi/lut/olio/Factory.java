package fi.lut.olio;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Factory { 
    private String factoryName;
    private ArrayList<Machine> machines;

    public Factory(String factoryName) {
        this.factoryName = factoryName;
        this.machines = new ArrayList<Machine>();
    }

    public void addMachine(Machine machine) {
        machines.add(machine);
    }

    public ArrayList<Machine> getMachines() {
        return machines;
    }

    public String getName() {
        return factoryName;
    }
}