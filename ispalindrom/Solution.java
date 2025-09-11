package ispalindrom;
// Tried the string conversion to check efficiency but result is slower than usual method
class Solution {
    public boolean isPalindrome(int x) {
        String s1= String.valueOf(x);
        String s2= new StringBuilder(s1).reverse().toString();
        return s1.equals(s2);
    }

    public boolean isPalindromeVersion2(int x){

        int copy = x;
        int reversed = 0;

        while(x>0){
            reversed= (reversed*10) + x%10;
            x/=10;
        }
        return copy==reversed;
    }
}