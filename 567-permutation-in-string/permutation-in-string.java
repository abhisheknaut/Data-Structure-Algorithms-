class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        Arrays.sort(arr1);
        String sorteds1 = new String(arr1);
        int length = s2.length()-s1.length();
        for(int i = 0;i<=length;i++){
            String str= s2.substring(i , i+s1.length());
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(sorted.equals(sorteds1)){
                return true;
            }
        }
        return false;
    }
}