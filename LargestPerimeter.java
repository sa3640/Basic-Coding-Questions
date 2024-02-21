public class LargestPerimeter {

     public static int largestPerimeter(int[] nums) {

         int size  = nums.length;
         int perimeter=0;

        for(int i = 0;i< size-1;i++)
        {
            for(int j = 0;j<size-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp = nums[j];
                      nums[j] = nums[j+1];
                     nums[j+1] = temp;
                    
                }
            }
        }
        
        for(int i = size-1;i>2;i--)
        {
            if(nums[i]<nums[i-1] + nums[i-2])
            {
                perimeter = nums[i] + nums[i-1] + nums[i-2];
                return perimeter;

            }
            
        }
          
       return 0;
        
    }

    public static void main(String[] args) {
        int [] nums = {2,1,2};

        int result = 
    }
}

    

