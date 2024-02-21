public class RearrangeArraySign {


    public static void rearrangeArray(int [] nums)
    {
        

        int size = nums.length;

        int [] arr = new int[size];
        int i;
        for(int j=0; j<size;j++)
        {
            if(nums[j] <0)
            {
                for(i=0;i<size-1;i++)
                    arr[i] = nums;
                    System.out.println(arr[i]);
            }
        }

    }


    public static void main(String[] args) {

        int [] nums = {-2,32,-23,22,24,-36};

        rearrangeArray(nums);
        
    }
    
}
