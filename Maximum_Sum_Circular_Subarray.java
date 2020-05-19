class Solution {
    
    public int maxSubarraySumCircular(int[] A) {
        int max_non_circular = kadaneAlgorithm(A);
        System.out.print(max_non_circular);
        int sum = 0;
        for(int i=0;i<A.length;i++){
            sum = sum + A[i];
            A[i] = -A[i];
        }
        int max_circular = kadaneAlgorithm(A);
        max_circular = sum + max_circular;
        if(max_circular==0){
            return max_non_circular;
        }
        
        return Math.max(max_non_circular,max_circular);
    }
    
    public int kadaneAlgorithm(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum>max){
                max = sum;
            }            
            if(sum<0){               
                sum = 0;
            }

        }
        return max;
    }
}
