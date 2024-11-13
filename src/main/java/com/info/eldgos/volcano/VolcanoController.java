package com.info.eldgos.volcano;

import com.info.eldgos.models.Rock;
import com.info.eldgos.models.Volcano;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VolcanoController {

    @QueryMapping
    public Volcano getByName(@Argument String name) {
        return Volcano.getByName(name);
    }

    @QueryMapping
    public List<Volcano> getAllVolcano() {
        return Volcano.getAllVolcano();
    }

    @SchemaMapping
    public Rock rockType(Volcano volcano) {
        return Rock.getById(volcano.rockId());
    }

}
