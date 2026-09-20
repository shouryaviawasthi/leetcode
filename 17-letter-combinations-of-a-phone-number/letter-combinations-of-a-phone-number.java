class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length() == 0)
        return res;

        String keypad[] = { "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(digits,0,"",keypad,res);
        return res;
    }
    private void backtrack(String digits, int index, String current, String[] keypad,List<String> res)
    {
        if(index == digits.length())
        {
            res.add(current);
            return;
        }
        int digit = digits.charAt(index) -'0';
        String letters = keypad[digit];
        for(char ch : letters.toCharArray())
        {
            current = current+ch;
            backtrack(digits,index+1,current,keypad,res);
            current = current.substring(0,current.length()-1);
        }
    }
}