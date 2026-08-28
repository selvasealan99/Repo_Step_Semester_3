package Step;

import java.util.Scanner;

public class MaskPhoneNumber {
    static void maskPoneNumber(String phone)
    {
        if (phone.length()<10)
        {
            return;
        }
        for (int i=0;i<phone.length();i++)
        {
            if (!Character.isDigit(phone.charAt(i)))
            {
                return;
            }
        }
        StringBuffer result = new StringBuffer("XXXXXX");
        result.insert(6,"-");
        result.append(phone.substring(6));
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone = sc.next();
        maskPoneNumber(phone);
    }
}
