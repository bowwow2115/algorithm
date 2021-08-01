package upto_section2;

public class ReverseString {
    public static void main(String[] args){
        String sample = "12345";
        String answer ="";
        for(int i=sample.length()-1; i>=0; i--){
            answer += sample.charAt(i);
        }
        System.out.println(answer);

    }
}
