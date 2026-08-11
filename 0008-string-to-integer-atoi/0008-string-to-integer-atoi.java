class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        long ans = 0;
        int sign = 1;

     
        while (i < n && s.charAt(i) == ' ') i++;

   
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // 3. Digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            ans = ans * 10 + (s.charAt(i) - '0');

            // 4. Overflow clamp
            if (ans * sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (ans * sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int)(ans * sign);
    }
}