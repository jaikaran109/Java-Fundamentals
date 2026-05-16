class Solution {
    public static boolean isPalindrome(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] != arr[n - i - 1]) return false;
        }
        return true;
    }
}
