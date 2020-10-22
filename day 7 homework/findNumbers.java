class Solution {
    public int findNumbers(int[] nums) {
        int[] intArray = new int[nums.length];
        for (int i=0;i<nums.length;i++)
        { int number=nums[i];
          int counter=0;
          
            while(number >0)
            {
                counter=counter+1;
                number=number/10;
            }
           intArray[i]=counter;
         
        }
        
        int even=0;
        for (int i=0;i<intArray.length;i++)
        {if(intArray[i]%2==0)
        {even=even+1;}}
        
        return even;
        
    }
}