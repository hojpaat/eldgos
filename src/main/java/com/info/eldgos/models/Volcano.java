package com.info.eldgos.models;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public record Volcano(String name, LocalDate date, String rockId) {
    private static final List<Volcano> volcanoList = Arrays.asList(
            new Volcano("Hekla", LocalDate.of(2024, 1, 1), "1"),
            new Volcano("Katla", LocalDate.of(2021, 1, 1), "2")
    );

    public static Volcano getByName(String name) {
        return volcanoList.stream().filter(volcano -> volcano.name().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public static List<Volcano> getAllVolcano() {
        return volcanoList;
    }
}
