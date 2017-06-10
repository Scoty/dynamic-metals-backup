package bg.free.antonov.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Copyright (C) 2017-2027 antonov.free.bg.
 *
 * @author <a mailto:anton.tz.antonov@gmail.com>Anton Antonov</a>
 * @since 04.06.2017 г.
 */
@Transactional
public interface SupplierRepo extends PagingAndSortingRepository<Supplier, Long>{

    public Supplier findByCompanyName(String companyName);

}
