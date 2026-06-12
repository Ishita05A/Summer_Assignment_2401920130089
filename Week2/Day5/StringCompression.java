package Week2.Day5;

public class StringCompression {
    static int compress(char[] chars) {
        int cnt = 1;
        int k = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                cnt++;
            } else {
                chars[k++] = chars[i - 1];
                if (cnt > 1) {
                    String s = String.valueOf(cnt);
                    for (int j = 0; j < s.length(); j++) {
                        chars[k++] = s.charAt(j);
                    }
                }
                cnt = 1;
            }
        }
        chars[k++] = chars[chars.length - 1];
        if (cnt > 1) {
            String s = String.valueOf(cnt);
            for (int i = 0; i < s.length(); i++) {
                chars[k++] = s.charAt(i);
            }
        }
        return k;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));
    }

}
