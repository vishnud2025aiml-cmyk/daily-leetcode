class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> perm=new ArrayList<>();
        for(int i=1;i<=m;i++){
            perm.add(i);
        }
       
        int[] res=new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int index=perm.indexOf(queries[i]);
            int x=queries[i];
            res[i]=index;
            perm.remove(index);
            perm.add(0,x);
            
        }

        return res;

    }
}