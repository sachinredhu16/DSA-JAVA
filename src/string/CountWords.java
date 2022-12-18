package string;

public class CountWords {
    public static void main(String[] args) {
        String str = "";
        int result = 0;
        if (str.isEmpty()) {
            System.out.println("Words count is : " +result);
        } else {
            result++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    result++;
                }
            }
            System.out.println("Words count is : " + result);
        }
    }
}
