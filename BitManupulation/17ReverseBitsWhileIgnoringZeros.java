public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int rev=0;
        int j=0;
        boolean flag=false;
        for(int i=31; i<=0; i--){
            
           int mask=1<<i;
           if(flag){
               if((n & mask)!=0){
                   int smask=1<<j;
                   rev|=smask;
               }
               j++;
           }else{
               if((n & mask) !=0){
                   int smask=1<<j;
                   rev|=mask;
                   flag= true;
                   j++;
               }
           }
        }
        
        return rev;
    }
}
