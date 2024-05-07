package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        var res = new HashSet<String>();
        for (Map.Entry<String, List<String>> entry: timetable.entrySet()) {
            res.addAll(entry.getValue());
        }
        return res;
    }
}
