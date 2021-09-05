class Solution{
    static String printMinNumberForPattern(String S){
        
        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<=S.length(); i++){
            
        
            stack.push(i+1);
            if(i==S.length()|| S.charAt(i)=='I'){
                
                
                while(!stack.empty()){
                    sb.append(stack.pop());
                }
            }
        }
        
        return sb.toString();
    }
}
