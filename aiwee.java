class aiwee{
    public int firstUniqChar(String s) {
      
            for(int i = 0; i<s.length();i++){
                for(int j = i + 1; j< s.length();j++){
                    if(s.charAt(i) != s.charAt(j))
                        return i;
                }
            }
            return -1;
        }
        public static void main(String [] args)
        {
            aiwee sc = new aiwee();
             String s = "shashank";
              
            int result =  sc.firstUniqChar(s);
            System.out.println(result);
        }
        
    }
