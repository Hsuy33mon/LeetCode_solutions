package Interview_practices.Binary_Search.Basic_BS;

// https://leetcode.com/problems/guess-number-higher-or-lower/
// Leetcode = 374
public class GuessNumberhigherOrLower {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int g = guess(mid);
            switch (g) {
                case -1:
                    right = mid - 1;
                    break;
                case 1:
                    left = mid + 1;
                    break;
                case 0:
                    return mid;
            }
        }
        return -1;
    }
}
