package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase extends ComputerComponent {
    private Dimension dimension;
    private double weight;

    public ComputerCase(String vendor, String name, double price) {
        super(vendor, name, price);
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String getFullDescription() {
        StringBuilder descriptionStringBuilder = new StringBuilder(super.getFullDescription());
        descriptionStringBuilder.append("Width = ");
        descriptionStringBuilder.append(dimension.getWidth());
        descriptionStringBuilder.append("mm");
        descriptionStringBuilder.append(System.lineSeparator());
        descriptionStringBuilder.append("Height = ");
        descriptionStringBuilder.append(dimension.getHeight());
        descriptionStringBuilder.append("mm");
        descriptionStringBuilder.append(System.lineSeparator());
        descriptionStringBuilder.append("Depth = ");
        descriptionStringBuilder.append(dimension.getDepth());
        descriptionStringBuilder.append("mm");
        descriptionStringBuilder.append(System.lineSeparator());
        descriptionStringBuilder.append("Weight = ");
        descriptionStringBuilder.append(weight);
        descriptionStringBuilder.append("kg");
        descriptionStringBuilder.append(System.lineSeparator());
        return descriptionStringBuilder.toString();
    }
}
