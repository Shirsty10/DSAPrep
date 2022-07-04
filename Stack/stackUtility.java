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

    public boolean balancedBrackets(String s){
      StackImpl<Character> st = new StackImpl<>();
      for(int i=0;i<s.length();i++){
         char ch = s.charAt(i);
         if(ch == '{' || ch == '(' || ch == '['){
            st.push(ch);
         }else if(ch == '}'){
            if(st.top() == '{') st.pop();
            else return false;
         }else if(ch == ')'){
            if(st.top() == '(') st.pop();
            else return false;
         }else if(ch == ']'){
            if(st.top() == '[') st.pop();
            else return false;
         }
      }
      return true;
    }

    
}
