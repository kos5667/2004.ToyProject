package com.ToyProject.product.service;

import java.util.List;
import java.util.Map;

public interface ProductService {
	
	public List<Map<String,Object>> selectProductList() throws Exception;
	
	public int insertProduct(Map<String, Object> param) throws Exception;

	
}
