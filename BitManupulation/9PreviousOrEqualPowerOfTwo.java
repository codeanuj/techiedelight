class Solution {
    static long nthPosition(long n){
        
        while((n&(n-1))!=0){
            n=n&(n-1);
        }
        return n;
    }
}
