class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }else if(s2.length()<s1.length()){
            return false;
        }
        int i=0;
        while(i+s1.length()<=s2.length()){
            String a = s2.substring(i,i+s1.length());
            if(isAnagram(s1,a)){
                return true;
            }
            i++;
        }
        return false;
    }
    public boolean isAnagram(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }
        HashMap<Character,Integer> h= new HashMap<>();
        for(int i=0;i<s1.length();i++){
            h.put(s1.charAt(i),h.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++){
            if(h.containsKey(s2.charAt(i))&&(h.get(s2.charAt(i))>0)){
                h.put(s2.charAt(i),h.get(s2.charAt(i))-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
