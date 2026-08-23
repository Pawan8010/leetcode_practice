class Solution {
    static boolean comparater(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;

        int count1[] = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            count1[ch - 'a']++;
        }
        int windowf = s1.length();
        int i = 0;
        int count2[] = new int[26];
        for (i = 0; i < windowf; i++) {
            char ch = s2.charAt(i);
            count2[ch - 'a']++;
        }

        if (comparater(count1, count2) == true) {
            return true;
        }

        else {
            // for updating next window
            while (i < s2.length()) {
       /* take new char
       dlet form table 2
        */
                char ch = s2.charAt(i);
                int old = i - windowf;
                count2[s2.charAt(old) - 'a']--;

                // addign new value
                count2[ch - 'a']++;

                if (comparater(count1, count2) == true) {
                    return true;
                }

                i++;
            }

        }
        return false;
    }
}