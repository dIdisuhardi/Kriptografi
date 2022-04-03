import java.util.Scanner;

public class Caesar_Cipher {
    public static final String x = "abcdefghijklmnopqrstuvwxyz";
    public static String enkripsi( String message, int shiftKey){
        message = message.toLowerCase();
        String chiperText = "";
        for (int i = 0; i < message.length();i++){
            int charPosition = x.indexOf(message.charAt(i));
            int keyVal = (shiftKey+charPosition)% 26;
            char replaceVal = x.charAt(keyVal);
            chiperText += replaceVal;
        }
        return chiperText;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String message = new String ();
        int key = 0;
        System.out.println(" Masukkan Pesan : ");
        message = sc.next();
        System.out.println("\nNilai Shift Key : ");
        key = sc.nextInt();
        System.out.println("\nPesan Terenkripsi : " + enkripsi(message,key));
    }
}
