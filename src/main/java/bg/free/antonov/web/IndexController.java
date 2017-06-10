package bg.free.antonov.web;

import bg.free.antonov.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private SupplierService supplierService;

    @RequestMapping("/")
    public String showIndex() {
        return supplierService.listAll();
    }
}
