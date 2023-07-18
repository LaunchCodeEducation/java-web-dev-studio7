package org.launchcode.studio7;

public class FloppyDisc extends ComputerDisc implements OpticalDisc{
    public FloppyDisc(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void storeData(String data) {

    }

    @Override
    public boolean isFull() {
        return false;
    }
}
