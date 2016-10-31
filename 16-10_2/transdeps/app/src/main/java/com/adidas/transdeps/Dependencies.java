package com.adidas.transdeps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dependencies {

    public static String[] findFullDependencies(String[] direct) {

        // read input to map
        Map<String, Set<String>> map = new HashMap<>();
        for (String rule : direct) {
            String[] items = rule.split(" ");
            Set<String> deps = new HashSet<>(items.length - 1);
            for (int i = 1; i < items.length; i++) {
                deps.add(items[i]);
            }
            map.put(items[0], deps);
        }

        // find indirect deps and put to a new map
        Map<String, Set<String>> indirectDepsMap = new HashMap<>();
        for (String item : map.keySet()) {
            Set<String> indirectDeps = new HashSet<>();
            addDeps(item, indirectDeps, map);
            indirectDepsMap.put(item, indirectDeps);
        }
        // merge direct and indirect deps
        for (String item : map.keySet()) {
            Set<String> deps = map.get(item);
            Set<String> indirectDeps = indirectDepsMap.get(item);
            if (indirectDeps != null) {
                deps.addAll(indirectDeps);
            }
        }

        // output
        String[] result = new String[map.size()];
        int index = 0;
        for (String item : map.keySet()) {
            StringBuilder sb = new StringBuilder(item);
            List<String> deps = new ArrayList<>(map.get(item));
            Collections.sort(deps);
            for (String dep : deps) {
                sb.append(" ").append(dep);
            }
            result[index] = sb.toString();
            index++;
        }

        return result;
    }

    private static void addDeps(String item, Set<String> addTo, Map<String, Set<String>> items) {
        Set<String> deps = items.get(item);
        for (String dep : deps) {
            Set<String> depDeps = items.get(dep);
            if (depDeps != null) {
                addTo.addAll(depDeps);
                addDeps(dep, addTo, items);
            }
        }
    }
}
