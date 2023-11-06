package armstorngNumber;

public class Main {
    public static void main(String[] args) {

        int num = 153;

        if (isArmstrong(num)){
            System.out.println(num + " armstrong sayısıdır.");
        }else {
            System.out.println(num + " armstrong sayısı değildir.");
        }

    }

    public static boolean isArmstrong(int num) {
        int armstrong = num;
        int n = String.valueOf(num).length();
        int sum = 0;

        while(num>0){
            int digit = num % 10;
            //System.out.println("digit = "+ digit);
            sum += Math.pow(digit, n);  //27 + 125 + 1"
            //System.out.println(sum);
            num = num / 10;
        }
        if (sum == armstrong){
            return true;
        }
        return false;


    }
}









