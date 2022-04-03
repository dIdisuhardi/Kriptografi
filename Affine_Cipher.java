import java.util.Scanner;

public class Affine_Cipher {
    public static String enkripsi (String message) {
        Scanner sc = new Scanner(System.in);
        String chiperText = "";
        int a = 0;
        int b = 0;
        System.out.println("\nNilai a : ");
        a = sc.nextInt();
        System.out.println("\nNilai b : ");
        b = sc.nextInt();
        for (int i = 0; i < message.length(); i++) {
            chiperText = chiperText + (char) ((((a * message.charAt(i)) + b) % 26)+65);
        }
        return chiperText;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String message = new String ();
        System.out.println(" Masukkan Pesan : ");
        message = sc.next();
        System.out.println("\nPesan Terenkripsi : " + enkripsi(message));
    }
}
