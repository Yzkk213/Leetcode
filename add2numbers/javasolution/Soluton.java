package add2numbers.javasolution;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      
        int carry= 0;
        ListNode result = new ListNode(0);
        ListNode tmp= result;
        
        while(l1!=null || l2!=null|| carry!=0){
            int vall1= (l1!=null) ? l1.val:0;
            int vall2= (l2!=null) ? l2.val:0;
            int sum = vall1+vall2+carry;

            carry=sum/10;
            tmp.next=new ListNode(sum%10);
            tmp=tmp.next;

            if (l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;   
        }
        return result.next;
    }
}

            