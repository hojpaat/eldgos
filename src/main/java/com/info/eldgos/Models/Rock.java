package com.info.eldgos.Models;

import java.util.Arrays;
import java.util.List;

public record Rock(String id, String name) {
    private static final List<Rock> rocks = Arrays.asList(
            new Rock("1", "granite"),
            new Rock("2", "basalt"),
            new Rock("3", "unknown")
    );

    public static Rock getById(String rockId) {
        return rocks.stream().filter(rock -> rock.id().equalsIgnoreCase(rockId)).findFirst().orElse(null);
    }
}
