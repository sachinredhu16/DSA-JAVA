package string;

public class CompressTheString {
    public static void main(String[] args) {

        String str = "aaabbccdsa";

        String res = "";
        char c = 0;
        int count = 1;
        res += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count > 1) {
                    res += count;
                    count = 1;
                }
                res += str.charAt(i);
            }
        }
        if(count>1){res += count;}
        System.out.println(res);
    }
}
