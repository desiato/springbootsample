package org.sample;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

@RestController
public class Sample {

    @RequestMapping("/")
    String home() {
        return "Hello World! v4" + new Date();
    }
}
