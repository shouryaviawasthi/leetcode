class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        //store vowels seperately
        for(char ch : s.toCharArray())
        {
            if(isVowel(ch))
            {
                vowels.add(ch);
            }
        }
        Collections.sort(vowels);
        int index=0;
        char resultarr[] = s.toCharArray();
        for(int i=0;i<resultarr.length;i++)
        {
            if(isVowel(resultarr[i]))
            {
                resultarr[i] = vowels.get(index);
                index++;
            }

        }
        return new String(resultarr);

    }
     public Boolean isVowel(char ch)
     {
        char ch1= Character.toLowerCase(ch);
        if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u')
        return true;
        return false;
     }
}