import java.util.Scanner;

public class Vigenere_Cipher {
    public static String enkripsi (String message, final String key){
        String chiperText = "";
        message = message.toUpperCase();
        for (int i = 0, j = 0; i < message.length(); i++){
            char x = message.charAt(i);
            if (x < 'A' || x > 'Z') continue;
            chiperText += (char) ((x + key.charAt(j)-2*'A')%26 + 'A');
            j = ++j % key.length();
        }
        return chiperText;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Masukkan Pesan : ");
        String message = sc.next();
        System.out.println(" Masukkan Key : ");
        String key = sc.next();
        System.out.println("\nPesan Terenkripsi : " + enkripsi(message,key));
    }
}
