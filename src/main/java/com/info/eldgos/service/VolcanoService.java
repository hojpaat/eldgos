package com.info.eldgos.service;
import com.info.eldgos.models.Volcano;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service

public class VolcanoService {

    private final RestClient restClient;

    public VolcanoService(RestClient.Builder restClientBuilder) {
        this.restClient = restClientBuilder
                .baseUrl("https://api.epos-iceland.is/v1/volcano")
                .build();
    }

    public List<Volcano> getAllVolcanos() {
        return restClient.get().uri("/general-information/list-of-volcanoes").retrieve().body(List.class);
    }
}
