package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        var res = new HashMap<Integer, Set<String>>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            var length = entry.getKey().length();
            res.computeIfAbsent(length, k -> new HashSet<>()).add(entry.getKey());
        }
        return res;
    }
}
