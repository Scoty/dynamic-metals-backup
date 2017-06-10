package bg.free.antonov.service;

import bg.free.antonov.domain.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (C) 2017-2027 antonov.free.bg.
 *
 * @author <a mailto:anton.tz.antonov@gmail.com>Anton Antonov</a>
 * @since 04.06.2017 г.
 */
@Service
public class SupplierService {

    @Autowired
    private SupplierRepo supplierRepo;

    public String listAll() {

        final StringBuilder toReturn = new StringBuilder();
        supplierRepo.findAll().forEach(supplier ->
                toReturn.append(supplier.getCompanyName())
                        .append(", ")
                        .append(supplier.getAddress())
                        .append(", ")
                        .append(supplier.getContactEmail())
                        .append(", ")
                        .append(supplier.getMainContactName())
                        .append("<br/>")
        );

        return toReturn.toString();
    }
}
