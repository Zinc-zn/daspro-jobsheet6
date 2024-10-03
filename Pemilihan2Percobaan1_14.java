import java.util.Scanner;

public class Pemilihan2Percobaan1_14 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         int tahun;

         System.out.print("Masukkan tahun: ");
         tahun = input.nextInt();

        boolean Kabisat = false;

        if  ((tahun % 4) == 0){ 
            if ((tahun % 100) != 0)
                if ((tahun % 400) == 0)
                Kabisat = true;
        }
        if (Kabisat) {
            System.out.println("tahun kabisat");
        } else {
            System.out.println("bukan tahun kabisat");
        }
    }
}
