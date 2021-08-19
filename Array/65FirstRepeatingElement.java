 public static int firstRepeated(int []arr, int n) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index=Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            
            if(map.containsKey(arr[i])){
                int getIndex = map.get(arr[i]);
                index = Math.min(index, getIndex);
            }else{
                map.put(arr[i], i);
            }
        }
        
        if(index == Integer.MAX_VALUE)
           return -1;
        
        return index+1;
    }
