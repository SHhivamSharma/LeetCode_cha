//1047. Remove All Adjacent Duplicates In String

class Solution {
    public String removeDuplicates(String S) {
        Deque<Character> deq = new LinkedList();
        for (char ch : S.toCharArray()) {
            
            if (!deq.isEmpty() && deq.peekLast() == ch) {
                deq.pollLast();
            } else {
                deq.addLast(ch);
            }
        }
        char[] strArr = new char[deq.size()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = deq.pollFirst();
        }  
        return new String(strArr);
    }
}