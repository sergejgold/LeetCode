package org.problems.service;

public class EasyProblemsImpl implements EasyProblems {

    @Override
    public int[] twoSum(int[] nums, int target) {
        int i = 0, head = 1;
        int[] result = new int[2];
        while (i < nums.length) {
            if (head == nums.length) {
                i++;
                head = 1;
                continue;
            }
            if (i == head && nums[i] + nums[head] == target) {
                head++;
                continue;
            }
            if (nums[i] + nums[head] == target) {
                result[0] = i;
                result[1] = head;
                return result;
            }
            head++;
        }
        return result;
    }
}