import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {

            // Store opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {

                // Closing bracket without an opening bracket
                if (st.isEmpty()) return false;

                char top = st.pop();

                // Check matching pair
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }

        // No unmatched opening brackets should remain
        return st.isEmpty();
    }
}