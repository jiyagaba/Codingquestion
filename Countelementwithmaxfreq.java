class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Step 1: Find the maximum element in the array
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        // Step 2: Create a frequency array
        int[] freq = new int[max + 1];
        for (int num : nums) {
            freq[num]++;
        }

        // Step 3: Find the maximum frequency
        int maxFreq = 0;
        for (int frequency : freq) {
            if (frequency > maxFreq) {
                maxFreq = frequency;
            }
        }

        // Step 4: Calculate the total count of elements with the maximum frequency
        int totalCount = 0;
        for (int frequency : freq) {
            if (frequency == maxFreq) {
                totalCount += frequency;
            }
        }

        return totalCount;
    }
}
//https://leetcode.com/problems/count-elements-with-maximum-frequency/description/
