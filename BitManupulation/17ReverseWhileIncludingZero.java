  public int reverseBits(int n) {
        
        
        int rev=0;
        int pos=31;
    
        while(n!=0 && pos>=0){
            //if lsb is 1 shift it left with position and takr or with answer(rev)
            if((n&1)!=0){
               rev =rev|(1<<pos); 
            }
            pos--;
            n=n>>1;
        }
        
         return rev;
    }
