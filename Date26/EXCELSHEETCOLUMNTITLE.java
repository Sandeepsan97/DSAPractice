package BreakLeetcode;

public class EXCELSHEETCOLUMNTITLE {

        public static String convertToTitle(int c) {
            if(c<27){
                return Character.toString((char) ('A' + (c- 1)));
            }
            StringBuilder ans=new StringBuilder("");
            while(c>0){
                int x=c%26;
                if(x==0){
                    ans.append('Z');
                    c--;
                }
                else{
                    ans.append((char)('A'+x-1));
                }
                c/=26;
            }
            return ans.reverse().toString();

    }

    public static void main(String[] args) {
        int a=1;
        String res=convertToTitle(a);
        System.out.println(res);
    }
}
