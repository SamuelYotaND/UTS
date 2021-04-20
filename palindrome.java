import java.util.Scanner;
public class palindrome {
    
    public static void main (String[] args) {
    // menyatakan variabel 
        String userInput; 
        Scanner scn = new Scanner(System.in);
    // mendapatkan inputan 
        System.out.println("masukkan kata : ");
        userInput = scn.nextLine();
    // menukar kata yang di input
    String reverse ="";
    for(int i = userInput.length() -1; i>= 0; i--){
            reverse += userInput.charAt(i);
            System.out.println(reverse);
        }
    // di panggil adalah palindrome
        ispalindrome(userInput);
    }
    //static is palindrome method
    public static Boolean ispalindrome(String userInput) {
        for (int i = 0; i<= userInput.length()/2; i++ ) {
            if(userInput.charAt(i) != userInput.charAt(userInput.length() - i - 1)) {
                System.out.println("this is not palindrome");
                return false;
            }
        }
        System.out.println("this is palindrome");
        return true;
    }
} 