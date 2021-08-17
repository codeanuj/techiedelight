int longestCommonSum(boolean arr1[], boolean arr2[], int n) {
        // code here
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);

        
        int arr1_sum=0;
        int arr2_sum=0;
        int length=0;
        for(int i=0; i<n; i++){
            
            int a=(arr1[i]==true)?1:0;
            int b=(arr2[i]==true)?1:0;
            arr1_sum +=a;
            arr2_sum +=b;
            
            int diff= arr1_sum-arr2_sum;
            
            if(map.containsKey(diff)){
                length = Math.max(length, i-map.get(diff));
            }else{
                map.put(diff, i);
            }
        }
        return length;
    }
