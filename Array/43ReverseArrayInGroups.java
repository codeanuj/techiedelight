void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        
        int i=0;
        while( i<n){
            int j=i+k-1;
            j=Math.min(j, n-1);
            reverse(arr, i, j);
            i=j+1;
        }
    }
    
    void reverse(ArrayList<Integer> arr, int l, int r){
        
        while(l<=r){
            int temp=arr.get(l);
            int t=arr.get(r);
            
            arr.set(r, temp);
            arr.set(l, t);
            l++;
            r--;
        }
    }
