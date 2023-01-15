package Inheritance;

class Harley extends Motor {
    int weight;
    double x = 0.1;
    double y = 0.2;
    double harga;

    public double getSalePrice() {

        if (weight >= 2000) {
            regularPrice = (double) (harga - (x * harga));
            System.out.println("terpakai diskon 10% menjadi. kemudian harga menjadi");
        } else {
            regularPrice = (double) (harga - (y * harga));
            System.out.println("terpakai diskon 20%, kemudian harga menjadi");
        }
        return regularPrice;
    }
}

