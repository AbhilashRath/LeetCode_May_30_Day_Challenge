class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<J.length();i++){
            h.add(J.charAt(i));
        }
        int count = 0;
        for(int i=0;i<S.length();i++){
            if(h.contains(S.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
