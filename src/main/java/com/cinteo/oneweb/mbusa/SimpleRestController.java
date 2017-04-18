package com.cinteo.oneweb.mbusa;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Gregor Zurowski
 *
 */
@RestController
public class SimpleRestController {

    @Value("${simple.greeting:Hello}")
    private String greeting;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable(value = "name") String name) {
        return String.format("%s %s!", greeting, name);
    }

}
