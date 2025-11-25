import java.util.*;

public class Solution{
  public static boolean isSubstringPalindrome(String string, int left, int right) {
        while (left < right) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }

    public static boolean isPalindrome(String string) {
        int leftIndex = 0;
        int rightIndex = string.length() - 1;
        while (leftIndex < rightIndex) {
            if (string.charAt(leftIndex) != string.charAt(rightIndex)) {
                return (isSubstringPalindrome(string, leftIndex + 1, rightIndex) || 
                        isSubstringPalindrome(string, leftIndex, rightIndex - 1));
            }
            leftIndex++;
            rightIndex--;
        }
        
        return true;
    }
        
    
}
