import java.util.Scanner;

public class Pemilihan2Percobaan1_21 {
    
    public static void main(String[] args) {
    Scanner input21 = new Scanner(System.in);

    System.out.print("Masukan tahun: ");
    int tahun = input21.nextInt();
    
    if  ((tahun % 4) == 0) {
        if ((tahun % 100) != 0)
            System.out.println("Tahun Kabisat");
        
    } else
        System.out.println("Bukan Tahun Kabisat");

    }
}