  public String is_power_of_eight(Long n)
    {
        if(n != 0 && (n & (n - 1)) == 0 && (n & 0xB6DB6DB6) == 0){
         //(n>0 && ((n&(n-1))>0) && (n&0xB6DB6DB6)>0){
            return "Yes";
        }
        
        return "No";
    }
