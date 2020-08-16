import java.util.regex.Pattern;

public class patternmatching {
    public  static  void main(String args[]){
        String text = "Hello world!! this is man from another world";
        String pattern = ".*Hello.*";
        boolean mathces = Pattern.matches(pattern, text);
        System.out.println("Matches " +mathces);


    }
}
