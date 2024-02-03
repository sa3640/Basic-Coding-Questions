class ReverseString{

    public static void main(String [] args)
    {
       
       String stringExample = "shashank";

       System.out.println("Original String"+" " +stringExample);

       int n = stringExample.length();

       String reversedString = "";

       char ch ;
        
        for(int i = n-1;i>=0;i--)
        {
            ch = stringExample.charAt(i);
            reversedString = reversedString + ch;
        }

          System.out.println("Reverse String is"+" " +reversedString);
    }
}