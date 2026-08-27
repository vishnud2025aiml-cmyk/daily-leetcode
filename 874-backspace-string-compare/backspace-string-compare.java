class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!stack1.isEmpty() && ch=='#'){
                stack1.pop();
            }
            else{
                if(ch=='#'){
                    continue;
                }
                stack1.push(ch);
            }
        }
        // System.out.println(stack1);

        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!stack2.isEmpty() && ch=='#'){
                stack2.pop();
            }
            else{
                if(ch=='#'){
                    continue;
                }
                stack2.push(ch);
            }
        }

        // System.out.println(stack2);

        if(stack1.equals(stack2)){
            return true;
        }
        return false;

    }
}