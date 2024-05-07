package com.epam.mjc.collections.combined;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        var temp = new ArrayList<String>();
        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            if (entry.getValue().contains(developer)) {
                temp.add(entry.getKey());
            }
        }
        temp.sort(Comparator.comparingInt(String::length).reversed());
        var res = new ArrayList<String>();
        for (int i = 1; i < temp.size(); i += 2) {
            if (temp.get(i - 1).compareTo(temp.get(i)) < 0) {
                res.add(temp.get(i));
                res.add(temp.get(i - 1));
            } else {
                res.add(temp.get(i - 1));
                res.add(temp.get(i));
            }
        }
        if (temp.size() != 0) {
            res.add(temp.get(temp.size() - 1));
        }
        return res;
    }
}
