package be.pxl.computerstore.hardware;

import com.sun.deploy.Environment;

public abstract class ComputerComponent {
    private String vendor;
    private String name;
    private double price;
    private String articleNumber;
    private static int uniqueID = 0;

    {
        uniqueID++;
    }

    public ComputerComponent(String vendor, String name, double price) {
        setVendor(vendor);
        setName(name);
        setPrice(price);
        articleNumber = createArticleNumber();
    }

    public String getVendor() {
        return vendor;
    }

    private void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArticleNumber() {
        return articleNumber;
    }

    private String createArticleNumber() {
        StringBuilder articleNumberStringBuilder = new StringBuilder(uniqueID);

        if (vendor.length() < 3) {
            articleNumberStringBuilder.append(vendor.toUpperCase());

            while (articleNumberStringBuilder.length() < 3) {
                articleNumberStringBuilder.append("X");
            }
        } else {
            articleNumberStringBuilder.append(vendor.substring(0, 3).toUpperCase());
        }
        articleNumberStringBuilder.append("-");
        articleNumberStringBuilder.append(String.format("%05d", uniqueID));

        return articleNumberStringBuilder.toString();
    }

    @Override
    public String toString() {
        return name + " (" + articleNumber + ")";
    }

    public String getFullDescription() {
        StringBuilder descriptionStringBuilder = new StringBuilder();
        descriptionStringBuilder.append("ArticleNumber = ");
        descriptionStringBuilder.append(articleNumber);
        descriptionStringBuilder.append(System.lineSeparator());
        descriptionStringBuilder.append("Vendor = ");
        descriptionStringBuilder.append(vendor);
        descriptionStringBuilder.append(System.lineSeparator());
        descriptionStringBuilder.append("Name = ");
        descriptionStringBuilder.append(name);
        descriptionStringBuilder.append(System.lineSeparator());
        descriptionStringBuilder.append("Price = ");
        descriptionStringBuilder.append(price);
        descriptionStringBuilder.append(System.lineSeparator());
        //return String.format("ArticleNumber = %s\nVendor = %s\nName = %s\nPrice = %f\n", articleNumber, vendor, name, price);
        return descriptionStringBuilder.toString();
    }
}
