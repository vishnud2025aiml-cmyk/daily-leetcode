class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        String vowel="aeiou";
        for(int i=left;i<=right;i++){
            String word=words[i];
            if(vowel.contains(""+word.charAt(0)) && vowel.contains(""+word.charAt(word.length()-1))){
                count++;
            }
        }
        return count;

    }
}