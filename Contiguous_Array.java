class Solution {
    public int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i] = -1;
            }
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        Map<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum==0){
                int len = i+1;
                if(len>max){
                    max = len;
                }
            }else{
                if(!h.containsKey(sum)){
                    h.put(sum,i);
                }else{
                    int len = i - h.get(sum);
                    if(len>max){
                        max = len;
                    }
                }
            }
            
        }
        if(max==Integer.MIN_VALUE){
            return 0;
        }
        return max;
    }
}
