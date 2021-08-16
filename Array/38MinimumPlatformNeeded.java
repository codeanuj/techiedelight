static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i=1;
        int j=0;
        int platform_needed=1;
        int max_platform=1;
        
        while(i<n && j<n){
            
            if(dep[j]>=arr[i]){
                i++;
                platform_needed++;
            }else{
                j++;
                platform_needed--;
            }
            
            max_platform = Math.max(max_platform, platform_needed);
            
        }
        
        return max_platform;
        
    }
