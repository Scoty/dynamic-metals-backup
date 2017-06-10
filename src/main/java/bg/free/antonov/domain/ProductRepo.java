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
public interface ProductRepo extends PagingAndSortingRepository<Product, Long> {

    public Product findByMaterial(String material);
}
