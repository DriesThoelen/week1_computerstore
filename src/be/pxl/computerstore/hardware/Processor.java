package be.pxl.computerstore.hardware;

public class Processor extends ComputerComponent {
    private static final double MIN_CLOCKSPEED = 0.7;
    private double clockspeed;

    public Processor(String vendor, String name, double price, double clockspeed) {
        super(vendor, name, price);
        setClockspeed(clockspeed);
    }

    public double getClockspeed() {
        return clockspeed;
    }

    public void setClockspeed(double clockspeed) {
        if (clockspeed < MIN_CLOCKSPEED) {
            this.clockspeed = MIN_CLOCKSPEED;
        } else {
            this.clockspeed = clockspeed;
        }
    }

    @Override
    public String getFullDescription() {
        StringBuilder descriptionStringBuilder = new StringBuilder(super.getFullDescription());
        descriptionStringBuilder.append("Clock speed = ");
        descriptionStringBuilder.append(clockspeed);
        descriptionStringBuilder.append("GHz");
        descriptionStringBuilder.append(System.lineSeparator());
        return descriptionStringBuilder.toString();
    }
}
