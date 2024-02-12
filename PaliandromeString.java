public class PaliandromeString {


    public static void palindromeNumber(){

        String beforePalin = "madam";

        int n = beforePalin.length();

        String afterPalin = "";

        char ch;

        for(int i = n-1;i>=0;i--){

            ch = beforePalin.charAt(i);

            afterPalin = afterPalin + ch;

        }

        if(beforePalin.equals(afterPalin))
        {
            System.out.print("Its palindrome: " + afterPalin);
        }

        else
        System.out.print("Not a palindrome");
    



    }

    

    public static void main (String[] args) {

        palindromeNumber();
        
    }
}
