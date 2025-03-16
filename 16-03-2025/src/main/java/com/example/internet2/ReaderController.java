package com.example.internet2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class ReaderController {


    @GetMapping("/reader")
    public Map<String, Object> reader(@RequestParam String name) {
        Reader reader = new Reader(name);
		
        return Map.of("entity", reader, "format", reader.format());
    }
}
