class IntegerOfSum{


    public static void main ( String [] args)
    {
        int sum = 46;
        int first,second;
    


        int [] arr = {8,21, 14, 10,18,20};

        for(int i = 0; i< arr.length; i++)
        {
            first = arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                second = arr[j];

                if((first + second) == sum)
                {
                    System.out.println("the numbers are" +""+first+" "+second);
                }
            }
            
        }


    }
}