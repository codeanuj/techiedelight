class Solution {
    public int[] countBits(int n) {
        
        int[] ans= new int[n+1];
        ans[0]=0;
        
        for(int i=1;i<ans.length; i++){
            if(i%2==0){
                ans[i]=ans[i/2];
            }else{
                ans[i]=1+ans[i/2];
            }
        }
        
        return ans;
    }
}
