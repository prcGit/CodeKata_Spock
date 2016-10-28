package com.adidas.transdeps;

import android.util.ArraySet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dependencies {

    public static String[] findFullDependencies(String[] direct) {

        Map<String, Set<String>> map = new HashMap<>();

        for (String rule : direct) {
            String[] items = rule.split(" ");

            Set<String> deps = new HashSet<String>(items.length - 1);
            for (int i = 1; i < items.length; i++) {
                deps.add(items[i]);
            }
            map.put(items[0], deps);
        }

        for (Iterator<String> it = map.keySet().iterator(); it.hasNext(); ) {
            addDeps(it.next(), map);
        }

        String[] result = new String[map.size()];
        int index = 0;
        for (String item : map.keySet()) {
            StringBuilder sb = new StringBuilder(item);
            for (String dep : map.get(item)) {
                sb.append(" ").append(dep);
            }
            result[index] = sb.toString();
            index++;
        }

        return result;
    }

    private static void addDeps(String item, Map<String, Set<String>> items) {
        Set<String> deps = items.get(item);
        for (String dep : deps) {
            Set<String> depDeps = items.get(dep);
            deps.addAll(depDeps);
        }
    }
}
