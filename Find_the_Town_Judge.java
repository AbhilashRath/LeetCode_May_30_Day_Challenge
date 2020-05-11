class Solution {


    public int findJudge(int N, int[][] trust) {
        if(trust.length==0){
            return N==1?N:-1;
        }    
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<trust.length;i++){
            h.put(trust[i][1],h.getOrDefault(trust[i][1],0)+1);
        }
        if(!h.containsValue(N-1)){
            return -1;
        }
        int judge = 0;
        for(Map.Entry<Integer,Integer> e: h.entrySet()){
            if(e.getValue()==N-1){
                 judge  = e.getKey();
            }
        }
        for(int i=0;i<trust.length;i++){
            if(trust[i][0]==judge){
                return -1;
            }
        }
        return judge;
        
    }
}
