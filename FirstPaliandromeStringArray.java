public class FirstPaliandromeStringArray {


    public static String paliandromeString(String[] words )
    {
       for(String w : words)
       {
        boolean ok = true;
       
        for(int i=0,j =w.length()-1;i<j && ok;++i,--j)
        {
            if(w.charAt(i) != w.charAt(j))
            {
                ok = false;
            }

        }
          if(ok)
          {
            return w;
          }
       }
           return " ";
    }

    public static void main(String[] args) {
        String [] words = {"abc","aac","mom","dad"};
        
        String result = paliandromeString(words);

        System.out.println(result);

    }
    
}
