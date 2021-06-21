package javaProgramming;

public class PhoneNumbers {

    public static int isValid(String s){
        int length = s.length();
        boolean flag = false;
        switch (length){

            case 10:
                if(s.charAt(0) == 57 || s.charAt(0) == 56 || s.charAt(0) == 55)
                    flag = true;
                break;
            case 11:
                if(s.charAt(0) == 48 && (s.charAt(1) == 57 || s.charAt(1) == 56 || s.charAt(1) == 55))
                    flag = true;
                break;
            case 12:
                if((s.charAt(0) == 57 && s.charAt(1) == 49) && (s.charAt(2) == 57 || s.charAt(2) == 56 || s.charAt(2) == 55))
                    flag = true;
                break;
            default:
                    flag = false;
        }
        if(flag == true)
            return 1;
        else
            return 0;
    }



    public static void main(String[] args){

        String s = "119791121063";
        int value = isValid(s);
        if(value == 1){
            System.out.println("Valid Number");
        }
        else
        {
            System.out.println("Invalid Number");
        }

    }
}
