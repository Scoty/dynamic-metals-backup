package bg.free.antonov.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C) 2017-2027 antonov.free.bg.
 *
 * @author <a mailto:anton.tz.antonov@gmail.com>Anton Antonov</a>
 * @since 03.06.2017 г.
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String showIndex() {
        return "Hello World!";
    }
}
