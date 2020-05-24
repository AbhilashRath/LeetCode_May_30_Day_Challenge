class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<List<Integer>> l = new ArrayList<>();
        int a =0;
        int b =0;
        while((a<A.length)&&(b<B.length)){
            List<Integer> x = new ArrayList<>();
            int one = Math.max(A[a][0],B[b][0]);
            int two = Math.min(A[a][1],B[b][1]);
            if(one<=two){
                x.add(one);
                x.add(two);
                l.add(x);                
            }
            if(B[b][1]>A[a][1]){
                a++;
            }else{
                b++;
            }
        }
        int[][] ans = new int[l.size()][2];
        for(int i=0;i<ans.length;i++){
            ans[i][0] = l.get(i).get(0);
            ans[i][1] = l.get(i).get(1);
        }
        return ans;
    }
}
