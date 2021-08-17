 public int TotalPairs(int[] nums, int k)
    {
        // Code here
        HashMap<Integer,Integer> map = new HashMap();
        
        for(int i=0; i<nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        int count=0;
        for(int i=0; i<nums.length; i++){
            int key = nums[i]-k;
            
           if(map.containsKey(key)){
               int c =map.get(key);
                if(key==nums[i] && c>1){
                    count++;
                }else{
                    count++;
                }
               map.remove(key);
           }
        }
        
        return count;
    }
