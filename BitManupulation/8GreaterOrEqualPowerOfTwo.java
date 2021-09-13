class Solution{
    static long nearestPowerOf2(long N){
        //code here
        
        if((N&(N-1))==0)
          return N;
          
        while((N &(N-1))!=0){
            N=N&(N-1);
        }
        
        N=N<<1;
        return N;
    }
}
