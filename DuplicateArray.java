class DuplicateArray{

   int arrayDuplicate(int [] arr){

    int n = arr.length,i=0;

    while(i<n)
    {
        for(int j = i;j<n;j++){
            if(arr[j]==arr[j+1])
            {
             return j; 
            }
        
        }
        
        i++;
    }
    return -1;
   }



   public static void main(String [] args)
   {
     int [] arr = {2,5,6,6,7,10,10};

     DuplicateArray ob = new DuplicateArray();

     int result = ob.arrayDuplicate(arr);

     System.out.println("Duplicate item is"+" "+result+" "+ arr[result]);

   }

}