class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while((i+p.length())<=s.length()){
            String a  = s.substring(i,i+p.length());
            if(isAnagram(a,p)){
                ans.add(i);
            }
            i++;
        }
        return ans;
    }
    public boolean isAnagram(String a, String b){
        if(a.equals(b)){
            return true;
        }
        if(a.length()!=b.length()){
            return false;
        }
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i=0;i<a.length();i++){
            h.put(a.charAt(i),h.getOrDefault(a.charAt(i),0)+1);
        }
        for(int i=0;i<b.length();i++){
            if((h.containsKey(b.charAt(i)))&&(h.get(b.charAt(i))!=0)){
                h.put(b.charAt(i),h.get(b.charAt(i))-1);
            }else{
                return false;
            }
        }
        return true;
        
    }
}
