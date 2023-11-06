package charCountInString;

public class Main {
    public static void main(String[] args) {
        String msg = "tobeto";
        System.out.println(msg);
        charCountInString(msg);
    }

    public static void charCountInString(String msg){
        msg = msg.toLowerCase();
        int[]charCount = new int[128];

        for(int i = 0; i < msg.length();i++){
            char c = msg.charAt(i);
            charCount[c] += 1;
        }
        for (int i=0; i<charCount.length;i++){
            if (charCount[i]>0){
                char c = (char) i;
                System.out.println(c + ":" + charCount[i]);
            }
        }
    }














}
