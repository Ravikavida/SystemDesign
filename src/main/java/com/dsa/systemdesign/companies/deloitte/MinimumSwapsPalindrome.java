package com.dsa.systemdesign.companies.deloitte;


public class MinimumSwapsPalindrome {

    public static int minSwaps(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        int swaps = 0;

        while (left < right) {

            if (arr[left] == arr[right]) {
                left++;
                right--;
                continue;
            }

            int k = right;

            // Find a matching character from the right
            while (k > left && arr[k] != arr[left]) {
                k--;
            }

            if (k == left) {
                // No matching character: move the
                // current character one position right
                char temp = arr[left];
                arr[left] = arr[left + 1];
                arr[left + 1] = temp;
                swaps++;
            } else {
                // Move the matching character to the right
                while (k < right) {
                    char temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                    swaps++;
                    k++;
                }

                left++;
                right--;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        String s = "mamad";

        System.out.println(minSwaps(s));
    }
}

