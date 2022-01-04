class Solution {
    public int[] countBits(int n) {
        
        int[] ans= new int[n+1];
        int temp=n;
        ans[0]=0;
        int res=0;
        while(n!=0){
            
            while(temp!=0){
                temp=temp&(temp-1);
                res++;
            }
            
            ans[n]=res;
            res=0;
            n--;
            temp=n;
        }
        
        return ans;
    }
}
