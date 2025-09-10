package reverseint;
//Wanted to see if string conversion worked and how fast it was (Result : not fast at all)
class Solution {
    public int reverse(int x){
     boolean neg = false;
     if (x<0){
         if (x == Integer.MIN_VALUE) return 0;
         neg = true;
         x=(-1)*x;
     }
         String str = x+"";
         StringBuilder s= new StringBuilder(str);
         str=s.reverse().toString();
         int y=0;
         for (int i = 0; i<str.length();i++){
             if (y>Integer.MAX_VALUE/10) return 0;
             y = (10 * y) + (str.charAt(i) - '0');
         }
         if (neg ) y=(-1)*y;
         if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) return 0;
         return y;
    }
 }
 
 