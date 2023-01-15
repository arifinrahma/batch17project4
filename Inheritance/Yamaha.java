package Inheritance;

public class Yamaha extends Motor {
    int cubicalCentimeter;
    double a = 0.15;
    double b = 0.1;
    double hargayamaha;
    public double getSalePrice() {
        if (cubicalCentimeter >= 250) {
        regularPrice = (double) (hargayamaha - (a * hargayamaha));
        System.out.println("terpakai diskon 15% harga menjadi");
        } else {
        regularPrice = (double) (hargayamaha - (b * hargayamaha));
        System.out.println("terpakai diskon 10% harga menjadi");
        }
        return regularPrice;
    }
}
