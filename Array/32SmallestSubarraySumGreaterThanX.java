  public static int sb(int a[], int n, int x) {
        
        int j=0;
        int sum=0;
        int result=Integer.MAX_VALUE;;
        
        for(int i=0; i<n; i++){
            
           sum+=a[i];
           
           while(sum>x && j<=i){
               sum-=a[j];
              
               result= Math.min(result, i-j+1);
               j++;
           }
            
        }
        return result;
    }
