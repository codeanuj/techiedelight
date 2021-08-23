   int distinctCount(int[] arr, int n) {
        // code here
        
        int i=0;
        int j=n-1;
        int count=n;
        
        while(i<j){
            while(i!=j && arr[i]==arr[i+1]){
                count--;
                i++;
            }
            
            while(i!=j && arr[j]==arr[j-1]){
                count--;
                j--;
            }
            
            if(i==j)
              break;
            
            if(arr[i]+arr[j]==0){
                count--;
                i++;
                j--;
            }else if(arr[i]+arr[j]>0){
                j--;
            }else{
                i++;
            }
        }
        
        return count;
    }
