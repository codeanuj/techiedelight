 String solve(int[] arr, int n) {
        // code here
        
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        int carry=0;
        for(int i=n-1; i>=1; i-=2){
          int num1=arr[i];
          int num2=arr[i-1];
          
          int num =num1+num2+carry;
          
          carry=num/10;
          int rem=num%10;
          sb.append(String.valueOf(rem));
        }
        if((n&1)==1){
             carry=carry+arr[0]; 
        }
      
        if(carry>0){
           sb.append(carry);
        }
        
        String s=sb.reverse().toString();
         int c=0;
         for(int i=0; i<s.length(); i++) {
        	 if(s.charAt(i)=='0') {
        		c++; 
        	 }else {
        		 break;
        	 }
         }
        return s.substring(c);
    }
