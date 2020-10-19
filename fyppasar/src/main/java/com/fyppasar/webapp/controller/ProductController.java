/*package com.fyppasar.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fyppasar.webapp.service.ProductService;

//refer CodeJava

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public String viewCatalog(Model model) {
		String keyword = null;
		return listByPage(model, 1, "name", "asc", keyword);
		
	}
	
	@GetMapping("/page/{pageNumber}")
	public String listByPage(Model model, @PathVariable("pageNumber") int currentPage,
			@Param("sortField") String sortField,
			@Param("sortDir") String sortDir,
			@Param("keyword") String keyword) {
		
		Page<Product> page = productService.listAll(currentPage, sortField, sortDir, keyword);
		
		long totalItems=page.getTotalElements();
		int totalPages=page.getTotalPage();
		
		List<Product> listProducts = page.getContent();
	
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("totalItems", totalItems);
		model.addAttribute("totalPages", totalPages);
		model.addAttribute("listProducts", listProducts);
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("keyword",keyword);
		
		String reverseSortDir = sortDir.equals("asc") ? "desc" : "asc";
		model.addAttribute("reverseSortDir", reverseSortDir);
	}
}
*/