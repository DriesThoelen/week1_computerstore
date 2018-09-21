package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Computable;
import be.pxl.computerstore.util.TooManyPeripheralsException;

public class ComputerSystem implements Computable {
    private Processor processor;
    private HardDisk hardDisk;
    private ComputerCase computerCase;
    private Peripheral[] peripherals;
    private int numberOfPeripherals = 0;
    public static final int MAX_PERIPHERAL = 3;

    public ComputerSystem() {
        peripherals = new Peripheral[MAX_PERIPHERAL];
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public Peripheral[] getPeripherals() {
        return peripherals;
    }

    public int getNumberOfPeripherals() {
        return numberOfPeripherals;
    }

    public void addPeripheral(Peripheral peripheral) throws TooManyPeripheralsException {
        if (numberOfPeripherals < MAX_PERIPHERAL) {
            peripherals[numberOfPeripherals] = peripheral;
            this.numberOfPeripherals++;
        } else {
            throw new TooManyPeripheralsException();
        }
    }

    public void removePeripheral(String articleNumber) {
        for (int i=0; i < peripherals.length; i++) {
            if (peripherals[i] != null) {
                if (peripherals[i].getArticleNumber().equals(articleNumber)) {
                    peripherals[i] = null;
                    this.numberOfPeripherals--;
                }
            }
        }
    }

    @Override
    public double totalPriceExcl() {
        double totalPrice = 0.0;

        if (processor != null) {
            totalPrice += processor.getPrice();
        }

        if (hardDisk != null) {
            totalPrice += hardDisk.getPrice();
        }

        if (computerCase != null) {
            totalPrice += computerCase.getPrice();
        }

        for (Peripheral peripheral : peripherals) {
            if (peripheral != null) {
                totalPrice += peripheral.getPrice();
            }
        }

        return totalPrice;
    }
}
