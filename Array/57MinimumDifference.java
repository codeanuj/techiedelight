  public int minimum_difference(int[] nums)
    {
        Arrays.sort(nums);
        
        int diff=Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length-1; i++){
            
            diff=Math.min(diff, nums[i+1]-nums[i]);
        }
        
        return diff;
    }
