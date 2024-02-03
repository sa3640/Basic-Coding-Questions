class BinarySearch{

    int binarySearch(int arr[],int x,int low,int high){
       
       while(low<=high)
       {
        int mid = low +(high-low)/2;

        if(arr[mid]==x)
         return mid;

         if(arr[mid]<x)
         {
            low = mid + 1;
         }
       else
          high = mid -1;
          
          }
       
       return -1;

    }

  public static void main(String [] args)
  {
    BinarySearch ob = new BinarySearch();

    int [] arr = {2,6,22,28,30,36,48};
    int x = 22;
    int n = arr.length;

    int result = ob.binarySearch(arr,x,0,n-1);
    if(result==-1)
    {
        System.out.println("Item not found");
    }

    else
      System.out.println("Item is" +result+ " "+ arr[result]);

  }

}