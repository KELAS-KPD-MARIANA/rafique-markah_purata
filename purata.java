package markah.purata;
import java.util.Scanner;

public class purata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        int exam;
        double[] markah = new double[5];
        double purata;
        double jumlah = 0; 
        int lebih = 0; // initialize lebih to 0
        
        System.out.print("Peperiksaan / ujian kali ke (1/2/3) : ");
        exam = input.nextInt();
         
        for (int i = 0; i < 5; i++) {
            markah[i] = input.nextDouble();
            jumlah += markah[i]; 
        }
        
        System.out.println("5 markah yang dimasukkan ialah:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1) + ". " + markah[i]);
        }
        
        System.out.println("Hasil tambah 5 markah: " + jumlah);
       
        // Calculate average
        purata = jumlah / 5;
        System.out.println("Purata: " + purata);
       
        for (int i = 0; i < 5; i++) {
            if (markah[i] > purata) { // Compare markah[i] with purata
                lebih++;
            }
        }
       
        System.out.println("Bilangan markah melebihi purata: " + lebih);
    }
}
