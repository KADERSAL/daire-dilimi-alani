
import java.util.Scanner;

public class Alan {
    public static void main(String[] args){
        int r, aci;
        double pi= 3.14, alan;
        Scanner a = new Scanner(System.in);
        System.out.println("Lütfen yarıçapı giriniz: ");
        r = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("Lütfen merkez açısının ölçüsünü giriniz: ");
        aci = b.nextInt();
        alan = (pi * (r*r) * aci)/360;
        System.out.println("Daire diliminin alanı: " +alan); 
    }   
}
