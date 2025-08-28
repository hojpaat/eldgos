package com.info.eldgos.volcano;

import com.info.eldgos.models.Rock;
import com.info.eldgos.models.Volcano;
import com.info.eldgos.service.VolcanoService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor
@Controller
public class VolcanoController {

    private VolcanoService volcanoService;

    @QueryMapping
    public Volcano getByName(@Argument String name) {
        return Volcano.getByName(name);
    }

    @QueryMapping
    public List<Volcano> getAllVolcano() {
        return volcanoService.getAllVolcanos();
    }

    @SchemaMapping
    public Rock rockType(Volcano volcano) {
        return Rock.getById(volcano.rockId());
    }

}
