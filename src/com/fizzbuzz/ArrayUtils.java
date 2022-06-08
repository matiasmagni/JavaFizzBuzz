package com.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    public static List<Object> fizzBuzz(int num) throws Exception {
        List<Object> res = new ArrayList<>();

        if (num <= 0) {
            new Exception("Num debe ser mayor que 0!");
        }

        for (int i = 0; i < num; i++) {
            if ((i+1) % 15 == 0) {
                res.add("fizz-buzz");
            } else if ((i+1) % 3 == 0) {
                res.add("fizz");
            } else if ((i+1) % 5 == 0) {
                res.add("buzz");
            } else {
                res.add(i+1);
            }
        }

        return res;
    }
}
