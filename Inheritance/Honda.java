package Inheritance;

public class Honda extends Motor {
    int year;
    double manufacturerDiscount;
    double hargahonda;

    public double getSalePrice() {
        regularPrice = (double) (hargahonda - manufacturerDiscount);
        return regularPrice;
    }
}
