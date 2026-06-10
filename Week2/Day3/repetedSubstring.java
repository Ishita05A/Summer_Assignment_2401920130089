package Week2.Day3;

public class repetedSubstring {

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i != 0)
                continue;

            String pattern = s.substring(0, i);
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n / i; j++) {
                sb.append(pattern);
            }

            if (sb.toString().equals(s)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "ababab";
        System.out.println(repeatedSubstringPattern(s));
    }

}
