package com.info.eldgos.models;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public record Volcano(String name, LocalDate date, String rockId, Integer height, String area, Float lat, Float longt) {
    private static final List<Volcano> volcanoList = Arrays.asList(
            new Volcano("Hekla", LocalDate.of(2024, 1, 1), "1", 1235, "Test area", 12.11f, 25.00f),
            new Volcano("Katla", LocalDate.of(2021, 1, 1), "2", 555, "Another area", 12.25f, 12.45f)
    );

    public static Volcano getByName(String name) {
        return volcanoList.stream().filter(volcano -> volcano.name().equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public static List<Volcano> getAllVolcano() {
        return volcanoList;
    }
}
