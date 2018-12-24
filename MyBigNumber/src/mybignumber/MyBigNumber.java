package mybignumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**.
 *
 * @author Box.
 */
public class MyBigNumber {

    private IReceiver ireceiver;

    public MyBigNumber(final IReceiver ireceiver) {
        this.ireceiver = ireceiver;
    }

    /**.
     * @param str1 string s1.
     * @param str2 string s2.
     */

    public String sum(final String str1,final String str2) {
        final String fResult = ""; //save the result 2 num
        String step = ""; //variable to get parameter of interface
        String conver = "";
        int len1 = str1.length(); 
        int len2 = str2.length(); 
        final int maxLen = (len1 > len2) ? len1 : len2; //compare length s1 vs s2
        int index1; //index character s1
        int index2; //index character s2
        char c1; //character of index of s1
        char c2; //character of index of s1
        int d1; //convert string to number of s1
        int d2; //convert string to number of s1
        int total; 
        int totalNoMem; //not remember
        int remember = 0; 
        int remember1 = 0; //temp remember
        Pattern p = Pattern.compile("\\D");
        final Matcher  flag1 = p.matcher(str1); 
        final Matcher  flag2 = p.matcher(str2); //check negative
        int idx; 
        
        if ((str1 == null) || (str1.trim().isEmpty())) {
            str1 = "0";
        }
        if ((str2 == null) || (str2.trim().isEmpty())) {
            str2 = "0";
        }
        
        if (str1.charAt(0) == '-' && str2.charAt(0) != '-') {
            idx = 1;
            this.ireceiver.send(" NumberFormatException(\" not inlcude negative number in s1 : " + str1);
            throw new NumberFormatException("error at index " + idx);
        }
    
        if (str1.charAt(0) != '-' && str1.charAt(0) == '-') {
            idx = 1;
            this.ireceiver.send(" NumberFormatException(\"not inlcude negative number in s2  : " + str2);
            throw new NumberFormatException(" error at index " + idx);
        }
        
        if (str1.charAt(0) == '-' && str2.charAt(0) == '-') {
            idx = 1;
            this.ireceiver.send(" NumberFormatException(\"not inlcude negative number in s2  : " 
                                + str1 + " \n not inlcude negative number in s2" + str2);
            throw new NumberFormatException(" error at index of s1 " + idx + " and error at index of s2 " + idx);
        }
       

        if (flag1.find()) {
            idx = flag1.start();
            this.ireceiver.send(" NumberFormatException(\"not include symbols in s1 : " + str1);
            throw new NumberFormatException(" error at index of s1 " + ++idx);
        }

        if (flag2.find()) {
            idx = flag2.start();
            this.ireceiver.send(" NumberFormatException(\"not include symbols in s2  : " + str2);
            throw new NumberFormatException(" error at index of s1 " + ++idx);
        }
       
        for (int i = 0; i < maxLen; i++) { //loop
            index1 = len1 - i - 1;
            index2 = len2 - i - 1; 
            
            c1 = (index1 >= 0) ? str1.charAt(index1) : '0';
            c2 = (index2 >= 0) ? str2.charAt(index2) : '0';
            
            d1 = c1 - '0'; //number in d1
            d2 = c2 - '0'; 
            
            remember1 = remember;
            total = d1 + d2 + remember;
            totalNoMem = d1 + d2;
            
            fResult = (total % 10) + fResult;
            remember = total / 10; //số remember
            
            if (i == 0) {
                conver = "step " + i + " : get " + d1 + " plus " + d2 + " we have " + totalNoMem
                    + " , " + " write " + (total % 10) + " , " + " remember " + remember
                    + ", result : " + fResult + "\n";
            } else if (i == (maxLen - 1) && total >= 10) {
                conver = "step " + i + " : get " + d1 + " plus " + d2 + " plus " + remember1
                    + " we have " + total + " , " + "write " + total + " , " + "remember " + remember
                    + ", result : 1" + fResult + "\n";
            } else {
                conver = "step " + i + " : get " + d1 + " plus " + d2 + " plus " + remember1
                    + " we have " + total + " , " + "write " + (total % 10) + " , " + "remember " + remember
                    + ", result : " + fResult + "\n";
            }
            step = step + conver;
        } //end loop
        if (remember > 0) {
            String tempSre = fResult;
            fResult = remember + fResult;
            step = step + "Take " + remember + " forward " + tempSre + " , " + " Result: " + fResult + "\n";
        }
        step = "\n" + str1 + " + " + str2 + " = " + fResult + "\n" + " Process implementation: \n" + step;
        this.ireceiver.send(step);
        
        return fResult;
    }
}