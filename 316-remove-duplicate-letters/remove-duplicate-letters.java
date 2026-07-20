class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        Stack<Character> stack=new Stack<>();
        boolean[] visited=new boolean[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mp.put(ch,mp.get(ch)-1);

            if(visited[ch-'a']){
                continue;
            }
            
            while(!stack.isEmpty() && stack.peek()>ch && mp.get(stack.peek())>0){
                char removed=stack.pop();
                visited[removed-'a']=false;
            }
            stack.add(ch);
            visited[ch-'a']=true;

        }
        StringBuilder res=new StringBuilder();
        for(char x:stack){
            res.append(x);
        }

        return res.toString();

    }
}