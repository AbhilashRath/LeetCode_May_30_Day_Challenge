class Solution {

    public String removeKdigits(String num, int k) {
        if(k==0){
            return num;
        }else if(num.length()==k){
            return "0";
        }
        Stack<Character> s = new Stack<>();
        for(int i=0;i<num.length();i++){
            while((k>0)&&(!s.isEmpty())){
                int a = Integer.valueOf(num.charAt(i));
                int b = Integer.valueOf(s.peek());
                if(a<b){
                    s.pop();
                    k--;
                }else{
                    break;
                }
            }
            s.push(num.charAt(i));

            
        }
        while(k>0){
            s.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.peek());
            s.pop();
        }
        sb.reverse();
        while((sb.length()>0)&&(sb.charAt(0)=='0')){
            sb.deleteCharAt(0);
        }
        if(sb.length()==0){
            return "0";
        }
        return sb.toString();
    }
}
