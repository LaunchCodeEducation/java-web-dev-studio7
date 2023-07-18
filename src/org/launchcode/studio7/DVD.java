package org.launchcode.studio7;

public class DVD extends ComputerDisc implements OpticalDisc {
    public DVD( String tittle) {
        super(4000, 1600, tittle);
    }


    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of: " + this.getSpinSpeed() + "rpm");
    }

    @Override
    public void storeData(String data) {
  this.writeData(data);
    }

    @Override
    public boolean isFull() {
        if(this.readData().length() >= this.getStorageCapacity() ) {
            return true;
        } else {
            return false;
        }
    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
