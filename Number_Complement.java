class Solution {
    public int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '1') {
                arr[i] = '0';
            } else {
                arr[i] = '1';
            }
        }
        
        return Integer.parseUnsignedInt(new String(arr), 2);        
    }
}
