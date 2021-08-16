String printLargest(String[] arr) {
        // code here
        
        if(arr.length==1){
            return arr[0];
        }
        
        
       
        
        Collections.sort(arr, (a, b) -> (b + a).compareTo(a + b));
    
        
        if(arr[0].equals("0")){
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
