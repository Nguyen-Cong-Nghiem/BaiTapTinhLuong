import java.util.Scanner;

public class TinhLuong {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        float HeSoLuong;
        double SoNam;
        System.out.println("HeSoLuong:");
        HeSoLuong=scanner.nextFloat();

        if (HeSoLuong > 5){
            System.out.println("Nhap lai he so luong");

        } else {
            System.out.println("SoNam");
            SoNam=scanner.nextDouble();
            double Luongthang;
            Luongthang = (HeSoLuong*4000000) + (SoNam*500000);
            System.out.println("Luong thang cua ban la:"+ Luongthang);
        }


        }



    }



