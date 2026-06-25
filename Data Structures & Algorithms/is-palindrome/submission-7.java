class Solution {
    public boolean isPalindrome(String s) {
          s = s.trim().toLowerCase();
        s = s.replace("?", "");
        s = s.replaceAll(",", "");
        s = s.replace("?", "");
        s = s.replace("'", "");
        s = s.replace(".", "");
        s = s.replace(":", "");
        s = s.replaceAll("/[!@#$%^&*]/g", "");
        s = s.replaceAll(" " , "");
        int r = s.length()-1;


        for(int i = 0 ; i<r ;i++){

            if(s.charAt(i) != s.charAt(r)){
                return false;
            }
            r--;

        }
        return true;
    }
}
