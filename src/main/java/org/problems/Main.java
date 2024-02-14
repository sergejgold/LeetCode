package org.problems;

import org.problems.service.EasyProblemsImpl;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EasyProblemsImpl service = new EasyProblemsImpl();
        System.out.println(Arrays.toString(service.twoSum(new int[]{1, 3, 4, 2}, 6)));
    }
}