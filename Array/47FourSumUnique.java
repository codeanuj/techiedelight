 public ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
        
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>(); 
        
        
        for(int i=0; i<arr.length-3; i++){
            if(i==0 || (i>0 && arr[i]!=arr[i-1])){
            for(int j=i+1; j<arr.length-2; j++){
                if(j== i+1|| (j>(i+1) && arr[j]!=arr[j-1])){
                int target=k-arr[i]-arr[j];
                int l=j+1;
                int r=arr.length-1;
                
                while(l<r){
                    
                    if(arr[l]+arr[r]==target){
                        ArrayList<Integer> list=new ArrayList<Integer>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[l]);
                        list.add(arr[r]);
                        result.add(list);
                        
                        
                    while(l<r && arr[l]==arr[l+1]) l++;
                    while(l<r && arr[r] == arr[r-1]) r--;
                      
                        l++;
                        r--;
                    }else if(arr[l]+arr[r]>target){
                        r--;
                    }else{
                        l++;
                    }
                    
                }
            }}
        }}
        
        return result;
    }
