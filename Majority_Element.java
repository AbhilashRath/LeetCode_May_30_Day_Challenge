class Solution {
    public int majorityElement(int[] nums) {
        //Solution 1
        
        Arrays.sort(nums);
        return nums[(nums.length-1)/2];
        
        //Solution 2
        
        // Map<Integer,Integer> m = new TreeMap<>(Collections.reverseOrder());
        // for(int i=0;i<nums.length;i++){
        //     if(m.containsKey(nums[i])){
        //         m.put(nums[i],m.get(nums[i])+1);
        //     }else{
        //         m.put(nums[i],1);
        //     }
        // }
        // int mxkey = nums[0];
        // for(Map.Entry<Integer,Integer> en:m.entrySet()){
        //     if(en.getValue()>m.get(mxkey)){
        //         mxkey = en.getKey();
        //     }
        // }
        // return mxkey;
        
    }
}
