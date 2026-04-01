class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            seen.add(num);
        }

        int maxSequence = 0;

        for (int num : nums) {
            if (!seen.contains(num + 1)) {
                int current = num;
                int length = 1;

                while (seen.contains(current - 1)) {
                    current--;
                    length++;
                }

                maxSequence = Math.max(maxSequence, length);
            }
        }

        return maxSequence;
    }
}
