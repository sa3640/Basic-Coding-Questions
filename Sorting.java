class Sorting{

    public static void main(String [] args)
    {
       int [] num = {56,9,-3,7,-16};
        int temp;
        System.out.println("Number before sorting:");
        for(int i=0;i<num.length;i++)
        {
            System.out.println(num[i]);
        }
        
        for(int i=0; i<num.length;i++)
        {
            for(int j = 0; j<num.length-1;j++)
            {
                if(num[j] > num[j+1])
                {
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.println("After sorting:");
        for(int i =0; i< num.length; i++)
        {
            System.out.println(num[i]);
        }
    }
}