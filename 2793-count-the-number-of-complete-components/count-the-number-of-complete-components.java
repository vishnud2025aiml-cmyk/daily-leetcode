class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] row : edges){
            adj.get(row[0]).add(row[1]);
            adj.get(row[1]).add(row[0]);
        }

        boolean[] visited=new boolean[n];
        
        int count=0;

        for(int i=0;i<n;i++){
            if(visited[i]==false){
                Queue<Integer> q=new LinkedList<>();
                boolean check=true;
                q.offer(i);
                visited[i]=true;
                Set<Integer> node=new HashSet<>(adj.get(i));
                node.add(i);
            
                while(!q.isEmpty()){
                    int curr=q.poll();
                    Set<Integer> temp=new HashSet<>(adj.get(curr));
                    temp.add(curr);
                    if(!node.equals(temp)){
                        check=false;
                    }
                    
                    for(int nei:adj.get(curr)){
                        if(!visited[nei]){
                            temp.add(nei);
                            visited[nei]=true;
                            q.offer(nei);
                        }
                    }
                    
                }
                if(check){
                    count++;
                }
            }
            
        }
        return count;


    }

}