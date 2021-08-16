static int trappingWater(int arr[], int n) { 
        
        // Your code here
        int max_bar=Integer.MIN_VALUE;
        int result=0;
        int max_index=-1;
  
        for(int i=0; i<n; i++){
            if(max_bar<arr[i]){
                max_index=i;
                max_bar=arr[i];
            }
        }
        
        int max_left=0;
        for(int i=0; i<max_index; i++){
            max_left= Math.max(max_left, arr[i]);
            result+=(max_left-arr[i]);
        }
        
        int max_right=0;
        for(int i=n-1; i>max_index; i--){
            max_right = Math.max(max_right, arr[i]);
            result+=(max_right-arr[i]);
        }
     return result;   
    } 
