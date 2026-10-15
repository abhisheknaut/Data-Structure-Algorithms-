class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ls = new ArrayList<>();
        for(int i =0 ;i<words.length;i++){
            if(words[i].contains(String.valueOf(x))){
                ls.add(i);
            }
        }
        return ls;
    }
}