class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
         boolean brackets = false;
        HashMap<String , String> hm = new HashMap<>();  
        if(!s.contains("(")) return s;
        for (List<String> row : knowledge) {
            hm.put(row.get(0), row.get(1));
        }
        String k = "";
        String ans = "";
        for(int i = 0 ; i<s.length() ;i++){
            if(s.charAt(i)=='(') brackets =true;
            if(brackets==true){
                if(s.charAt(i)!='(' && s.charAt(i)!=')' ) k+=s.charAt(i);
            }else{
                ans+=s.charAt(i);
            }
            if(s.charAt(i)==')'){
                brackets =false;
                if(hm.containsKey(k)){
                    ans +=hm.get(k);
                    k = "";
                }
                if(!k.equals("")) {
                    ans+='?'; k="";
                }
            }
        }
        return ans;
    }
}