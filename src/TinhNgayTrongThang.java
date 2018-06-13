import java.util.Scanner;

public class TinhNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ban muon tinh cua thang may");
        int Thang = scanner.nextInt();
        String Songaycuathang;
        switch (Thang){
            case 2:
                Songaycuathang = "28 hoac 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                Songaycuathang = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                Songaycuathang = "30";
                break;
                default:
                    Songaycuathang = "";
                    break;
                    }
                    if (Songaycuathang != "") System.out.printf("Thang '%d' co %s ngay!",Thang,Songaycuathang);
        else System.out.print("Vo li");
    }
}
