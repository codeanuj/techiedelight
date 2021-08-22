boolean areConsecutives(long arr[], int N)
    {

       long min=Integer.MAX_VALUE;
       
       long sum=0;
       
       for(int i=0; i<N; i++){
           sum+=arr[i];
           min=Math.min(min, arr[i]);
       }
       
       
       long ap_sum= (N*(2*min+(N-1)))/2;
       
       if(ap_sum==sum){
           return true;
       }
      return false;
    }
