class BadaChota{

     public static void main(String [] args)
    {

        int [] arr = {28,54,-2,10,0};
         
            int n = arr.length;
         int temp;

       for(int i = 0; i<n;i++){

        for(int j = 0; j<n-1;j++)
        {
            if( arr[j] > arr[j+1])
            {  
                temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;   

            }
        }
     }
      
        
        System.out.println("Smallest number is:" +arr[0]+" "+" Largest number is:"+" "+arr[n-1]);
       }

    }

      
    

    

   
