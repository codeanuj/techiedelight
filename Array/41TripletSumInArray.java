public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       
       Arrays.sort(A);
       
       int i=-1;
       int j=-1;
       int k=-1;
       for(i=0; i<n ; i++){
           
           j=i+1;
           k=n-1;
           int target=X-A[i];
           while(j<k){
               
               if(A[j]+A[k]<target){
                   j++;
               }else if(A[j]+A[k]>target){
                   k--;
               }else{
                   return true;
               }
           }
       }
       
       return false;
    
    }
