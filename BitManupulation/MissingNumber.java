class Solution {
    public int missingNumber(int[] nums) {
        
        //we will make use of the fact that x^x=0
        //if one number is missing if we take xor from 0 to all numbers(n) with the  number present in array
        int xor_result=0;
        for(int i=0; i<nums.length; i++){
            xor_result=xor_result^i^nums[i];
        }
        //here nums.length because range is 0 to n so we are running out loop till nums.length-1 not till nums.length
        return xor_result^nums.length;
      
    }
}
