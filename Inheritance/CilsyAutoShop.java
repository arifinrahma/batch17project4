package Inheritance;

public class CilsyAutoShop {
    public static void main(String[] args) {

        //HARLEY
        Harley harley = new Harley();
        harley.speed = 100;
        harley.color ="hitam";
        harley.weight = 9000;
        harley.harga = 3000000;
        System.out.println("motor tipe harley speednya " + harley.speed + " berwarna " + harley.color);
        System.out.println(harley.getSalePrice());
        System.out.println("======================================================");

        //YAMAHA
        Yamaha yamaha = new Yamaha();
        yamaha.speed = 50;
        yamaha.color = "putih";
        yamaha.cubicalCentimeter = 100;
        yamaha.hargayamaha = 2000000;
        System.out.println("motor tipe yamaha speednya " + yamaha.speed + " berwarna " + yamaha.color);
        System.out.println(yamaha.getSalePrice());
        System.out.println("======================================================");

        //HONDA
        Honda honda = new Honda();
        honda.speed = 30;
        honda.color = "hijau";
        honda.year = 2020;
        honda.manufacturerDiscount = 150000;
        honda.hargahonda = 1000000;
        System.out.println("motor tipe honda speednya " + honda.speed + " berwarna " + honda.color);
        System.out.println("keluaran motor honda tahun " +honda.year);
        System.out.println("harga final menjadi");
        System.out.println(honda.getSalePrice());

    }
}
