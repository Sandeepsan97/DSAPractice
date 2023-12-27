package BreakLeetcode;
import java.util.*;
public class FindTheDifference {

    public static char findTheDifference(String s, String t) {
        ArrayList al=new ArrayList<>();
        for(int i=0;i<t.length();i++)
        {
            al.add(t.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {
            al.remove(al.indexOf(s.charAt(i)));
        }
        return (char) al.get(0);
    }

    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
     char res =  findTheDifference(s,t);
        System.out.println(res);

    }
}
