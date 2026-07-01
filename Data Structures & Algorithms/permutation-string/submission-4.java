class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

        if(s1.length()==s2.length() && s1.equals(s2)){
            return true;
        }


        int[] freqs1 = new int[26];
        int[] freqs2 = new int[26];
        for(int i = 0 ; i< s1.length();i++){
            freqs1[s1.charAt(i) - 'a']++;
            freqs2[s2.charAt(i) - 'a']++;

        }
        if (Arrays.equals(freqs1, freqs2)) {
            return true;
        }

        for(int i = s1.length(); i < s2.length(); i++){

           
            freqs2[s2.charAt(i) - 'a']++;
            freqs2[s2.charAt(i - s1.length()) - 'a']--;
           /* for(int j = 0;j<s1.length() && R<s2.length();j++){


                freqs2[s2.charAt(R) - 'a']++;

                R++;

            }*/
            if(Arrays.equals(freqs1,freqs2))
                return true;

        }


        return false;



    }
}
