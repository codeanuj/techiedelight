  long countTriplets(long arr[], int n,int sum)
    {
        int count=0;
        
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length-2; i++){
            
            int j= i+1;
            int k=arr.length-1;
            long target = sum-arr[i];
            while(j<k){
                
                if(arr[j]+arr[k]>=target){
                    k--;
                }else{
                    
                    count=count+(k-j);
                    j++;
                }
            }
        }
    return count;
    }
