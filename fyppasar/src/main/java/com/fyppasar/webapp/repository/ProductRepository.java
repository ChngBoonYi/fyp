/*package com.fyppasar.webapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

	@Query("SELECT p FROM Product p WHERE p.name LIKE %?1%")
	public Page<Product> findAll(String keyword, Pageable pageable);
}
*/