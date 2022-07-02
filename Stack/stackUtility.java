public class stackUtility {
    public boolean duplicateBrackets(String s){
        StackImpl<Character> st = new StackImpl<Character>();
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch == ')'){
           if(st.top()== '('){
            return true;
           }else {
              while(st.top()!= '('){
                st.pop();
              }
           }
    
        }else{
           st.push(ch);
        }
       }
       return false;
    }
}
