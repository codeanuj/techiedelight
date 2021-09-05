 public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] i1, int[] i2){
                return i1[0]-i2[0];
            }
        });
        
        int index=0;
        
        for(int i=1; i<intervals.length; i++){
             if(intervals[index][1]>=intervals[i][0]){
                 intervals[index][0]=Math.min(intervals[index][0],intervals[i][0]);
                 intervals[index][1]=Math.max(intervals[index][1],intervals[i][1]);
             }else{
                 index++;
                 intervals[index]=intervals[i];
             }
        }
        
        int[][] result=new int[index+1][2];
        
        for(int i=0; i<=index; i++){
            result[i]=intervals[i];
        }
        
        return result;
    }
