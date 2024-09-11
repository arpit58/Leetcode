import java.util.*;
public class string_pal{

    public static boolean isPalindrome(String s) {
        String nstr="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            ch = Character.toLowerCase(ch);

            if(Character.isLetter(ch)){
                nstr+=ch;
            }
        }

        System.out.println(nstr);

        String result = "";
        for(int i=nstr.length()-1;i>=0;i--){
            ch = nstr.charAt(i);
            result = result+ch;
        }

        System.out.println(result);

        
       
        if(nstr.equals(result)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        // String s = "A man, a plan, a canal: Panama";
        String s = "race a car";

        System.out.println(isPalindrome(s));
    }
}