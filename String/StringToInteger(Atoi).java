class Solution {
    public int myAtoi(String str) {
        
        int i=0;
        int result=0;
        int signMultiplier=1;
        
        
        if(str==null || str.isEmpty()) return 0;
        
        //step 1: remove all white spaces
        while(i<str.length() && str.charAt(i)==' ')
            i++;
        
        if(i>=str.length()) return 0;
        //step 1: assign the sign based on +, -
        if(i<str.length() && (str.charAt(i)=='+' || str.charAt(i)=='-')){
                signMultiplier=(str.charAt(i++)=='-')?-1:1;
        }
        // step 3: if string character is within 0-9 then proceed
        while(i<str.length() && str.charAt(i)-'0'>=0 && str.charAt(i)-'0'<=9){
         
            //step 4: handle over and under flow issue
        
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && str.charAt(i)-'0'> Integer.MAX_VALUE%10))
               return (signMultiplier==-1)?Integer.MIN_VALUE:Integer.MAX_VALUE;
            
               result =result*10+str.charAt(i++)-'0';
        }
        return signMultiplier*result;
   }     
        
}
