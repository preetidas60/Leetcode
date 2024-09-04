public class Q1945 {
    public static int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            int c = ((int)s.charAt(i)) - 96;
            str.append(c);
        }
        return sumOfDigits(str.toString(), k);
    }
    public static int sumOfDigits(String s, int k){
        int num = 0;
        for(int i=0; i<s.length(); i++){
            num += (int)s.charAt(i) - '0';
        }
        k--;
        int result = num;
        while(k>0){
            int sum = 0;
            while(num>0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
            }
            num = sum;
            result = sum;
            k--;
        }
        return result;
    }
}
