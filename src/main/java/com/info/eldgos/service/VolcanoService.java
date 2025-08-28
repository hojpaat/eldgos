package com.info.eldgos.service;
import com.info.eldgos.models.Volcano;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class VolcanoService {
    private final WebClient webClient;

    public void getAllVolcanos() {
         Mono<Volcano> volcanos = webClient
                 .get()
                 .uri("/volcano/general-information/list-of-volcanoes?format_type=JSON")
                 .retrieve()
                 .bodyToMono(Volcano.class);
         
    }
}
