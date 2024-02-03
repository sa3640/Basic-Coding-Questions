class LinearSearch{

    int linearSearch(int [] arr,int x){

    for(int i = 0; i<arr.length; i++)
    {
        if(arr[i]==x)
        return i;
        
        
    }
    return -1;
}
    public static void main(String [] args)
    {
        int [] arr = {23,56,-2,8,67,45};
        int x = 8;
        LinearSearch ob = new LinearSearch();

        int result = ob.linearSearch(arr,8);

        System.out.println("Element found"+" "+ +result);


    }
}