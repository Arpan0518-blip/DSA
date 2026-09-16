class Solution {
    public boolean isAnagram(String s, String t) {
        int [] f = new int [26];
        for(char c:s.toCharArray()){
            f[c-'a']++;

        }
        for(char c:t.toCharArray()){
            f[c-'a']--;

        }
        for(int i:f){
            if(i!= 0) return false;
        }
        return true;
   
    }
}