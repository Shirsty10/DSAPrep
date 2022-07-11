
import java.util.Arrays;


class Pair implements Comparable<Pair>{
   int startTime;
   int endTime;
   Pair(int startTime,int endTime){
       this.startTime = startTime;
       this.endTime = endTime;
   }
   public int compareTo(Pair o){
     if(this.startTime != o.startTime)
        return this.startTime-o.startTime;
      else 
      return this.endTime-o.endTime;  
   }
}




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

    public void mergeIntervals(int [][] a){
      Pair pairs[] = new Pair[a.length];
      for(int i=0;i<a.length;i++){
         pairs[i] = new Pair(a[i][0], a[i][1]);
      }
      Arrays.sort(pairs);
      StackImpl<Pair> stack = new StackImpl<>();
      for(int i=0;i<a.length;i++){
         if(i==0){
            stack.push(pairs[i]);
         }else{
            Pair p = stack.top();
            if(p.endTime<pairs[i].startTime){
               stack.push(pairs[i]);
            }else{
               p.endTime = Math.max(p.endTime,pairs[i].endTime);
            }
         }

      }
      
      while(!stack.isEmpty()){
          Pair pt = stack.pop();
         System.out.println(pt.startTime+ " " + pt.endTime);
      } 
      
    }

    public int[] nextGreaterEleToRight(int [] a){
     int nge[] = new int[a.length];
    StackImpl<Integer> st = new StackImpl<>();
    nge[a.length-1] =-1;
    st.push(a[a.length-1]);
    for(int i=a.length-2;i>=0;i--){
      while(st.sizeStack()>0 && a[i]>= st.top()){
         st.pop();
      }

      if(st.isEmpty()){
        nge[i] = -1;
      }else{
        nge[i] = st.top();
      }
      st.push(a[i]);
    }


     return nge;
    }

    
}
