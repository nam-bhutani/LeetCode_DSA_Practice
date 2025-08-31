class Solution {
    public String toLowerCase(String s) {
        StringBuilder ss=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ss.append((char)(s.charAt(i) | ' '));
            }
            else{
                ss.append(s.charAt(i));
            }
        }
        return ss.toString();
    }
}