class Solution {

    public String frequencySort(String s) {
        Map<Character,Integer> m = new HashMap<>();
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>> l = new ArrayList<>(m.entrySet());
        Collections.sort(l,new Comparator<Map.Entry<Character,Integer>>(){
            public int compare(Map.Entry<Character,Integer> e1,Map.Entry<Character,Integer> e2){
                return (e1.getValue().compareTo(e2.getValue()));
            }
        });
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<l.size();i++){
            char a = l.get(i).getKey();
            int x = l.get(i).getValue();
            for(int j=0;j<x;j++){
                ans.append(String.valueOf(a));
            }
            
        }
        return String.valueOf(ans.reverse());

    }
}
