class Solution
{
    int isPowerOfFour(long n)
    {
     
     if((n &(n-1))!=0)
       return 0;
    
    long i=1;
    int pos=0;
    while((n&i)==0){
        
        i=i<<1;
        pos++;
    }
		
		if(pos%2!=0)
		   return 0;
		
		return 1;
    }
}
