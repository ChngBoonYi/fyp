/*package com.fyppasar.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

//filter,search,paging &sorting

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Page<Product> listAll(int pageNumber, String sortField, String sortDir, String keyword){
		Sort sort = Sort.by(sortField);
		sort = sortDir.equals("asc")? sort.ascending():sort.descending();
		
		Pageable pageable = PageRequest.of(pageNumber - 1, 6, sort);
		
		if(keyword !=null) {
			return productRepository.findAll(keyword, pageable);
			
		}
		return productRepository.findAll(pageable);
	}
	
	public Product get(Long id){
		return productRepository.findById(id).get();
}
*/
