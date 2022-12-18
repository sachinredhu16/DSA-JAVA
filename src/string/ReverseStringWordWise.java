package string;

public class ReverseStringWordWise {
    public static void main(String[] args) {
        String s= "Welcome to Coding Ninjas";

        // using Array
        String [] arr = s.split(" ");
        String result="";
        for (int i=arr.length-1;i>=0;i--){
            result +=arr[i];
            result +=" ";
        }
        System.out.println(result);

        // without using any extra space
        int  end =s.length();
        int i =end-1;
        String output = "";
        while (i>=0){
            if(s.charAt(i)==' '){
                output += s.substring(i+1,end)+" ";
                end =i;
            }
            i--;
        }
        output += s.substring(i+1,end);
        System.out.println(output);
    }
}
