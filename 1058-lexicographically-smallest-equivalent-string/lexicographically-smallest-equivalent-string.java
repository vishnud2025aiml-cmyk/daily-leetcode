class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        List<List<Character>> adj=new ArrayList<>();
        for(int i=0;i<=26;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<s1.length();i++){
            char u=s1.charAt(i);
            char v=s2.charAt(i);
            adj.get(u-'a'+1).add(v);
            adj.get(v-'a'+1).add(u);
        }

        for(int i=0;i<=26;i++){
            Collections.sort(adj.get(i));
        }

        StringBuilder res=new StringBuilder();
        
        for(int i=0;i<baseStr.length();i++){
            char ch=baseStr.charAt(i);
            Queue<Character> q=new LinkedList<>();
            char check=ch;
            q.add(ch);
            boolean[] visited=new boolean[27];
            while(!q.isEmpty()){
                char c=q.poll();
                for(char s:adj.get(c-'a'+1)){
                    if(visited[s-'a'+1]==false){
                        if(s<check){
                            check=s;
                        }
                        visited[s-'a'+1]=true;
                        q.add(s);
                    }
                }
            }
            res.append(check);
            
        }

        return res.toString();
        

    }
}