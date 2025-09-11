package atoi;
class Solution {
    public int myAtoi(String s){
        boolean start=false;
        boolean neg =false;
        int result=0;
        int i=0;
        while(i<s.length()){
            
            if (s.charAt(i)==' ' && !start) i++;
            
            else if(s.charAt(i)=='+' &&!start){
                i++;
                start=true;
            } 
            else if (s.charAt(i)=='-' && !start) {
                neg = true;
                start = true;
                i++;
            }
            else if (!Character.isDigit(s.charAt(i))){
                break;
            }
            else{
               if (result > Integer.MAX_VALUE / 10 ||
    (result == Integer.MAX_VALUE / 10 && (s.charAt(i) - '0') > 7)) {
    return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
}
                start=true;
                result= result*10 +(s.charAt(i)-'0');
                i++;
            }
            
        }

        return (neg)? -(1)*result :result;
    }
}
