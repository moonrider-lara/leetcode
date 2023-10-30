class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();
        for (char ch: s.toCharArray()) {
            if (st.peek() == complement(ch)) st.pop();
            else st.push(ch);
        }
        return st.isEmpty();
    }

    private Character complement(char ch) {
        return switch (ch) {
            case ')' -> '(';
            case ']' -> '[';
            case '}' -> '{';
            default -> ' ';
        };
    }
}