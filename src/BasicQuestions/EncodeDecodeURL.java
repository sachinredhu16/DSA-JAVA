package BasicQuestions;

import java.util.HashMap;
class Codec{
    static HashMap<String, String> map = new HashMap<>();

    public static String encode(String url){
        String str = String.valueOf((int)Math.random()*10000);
        str.contains("1");
        map.put(str,url);
        return str;
    }
    public static String decode(String shortUrl){
        String str = map.get(shortUrl);
        return str;
    }

}
public class EncodeDecodeURL {

    public static void main(String[] args) {
        String url = "https://leetcode.com/problems/design-tinyurl";
        Codec codec = new Codec();
        System.out.println(codec.decode(codec.encode(url)));
    }
}
