class MaximumString{
    public static char maximumString(String s) {

    //    int n = s.length();

       int count = 0;
        char string[] = s.toCharArray(); 
        char fix = (char)0;


      for(char str : string)
      {
         if(count==0)
          fix = str;

          if(str==fix)
            count++;

            else
             count--;

      }

      return fix;
      
    }       
        public static void main(String [] args)
        {
           
            String s = "rajat";

           char result = maximumString(s);
            
           System.out.println(result);
        }
        
    }
// git changes

