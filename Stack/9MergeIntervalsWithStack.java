public int[][] merge(int[][] intervals) {
        
        
        Arrays.sort(intervals, new Comparator<int[]>(){
            
            public int compare(int a[], int b[]){
                return a[0]-b[0];
            }
        });
        
        Stack<int[]> stack = new Stack();
       
        for(int i=0; i<intervals.length; i++){
            
            if(stack.isEmpty()){
                stack.push(intervals[i]);
            }else{
                int peek[] = stack.peek();
                int current_ele[] = intervals[i];
                
                if(peek[1]>=current_ele[0]){
                    if(peek[1]<=current_ele[1]){
                        current_ele[0]=peek[0];
                        stack.pop();
                        stack.push(current_ele);
                    }
                }else{
                    stack.push(intervals[i]);
                }
            }
        }
        
        int[][] result = new int[stack.size()][2];
        
        int j=0;
        while(!stack.isEmpty()){
            result[j]=stack.pop();
            j++;
        }
        
        return result;
    }
