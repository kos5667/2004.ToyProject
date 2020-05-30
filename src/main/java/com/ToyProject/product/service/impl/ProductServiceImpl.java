package com.ToyProject.product.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ToyProject.product.dao.ProductDao;
import com.ToyProject.product.service.ProductService;
import com.ToyProject.user.dao.UserDao;
import com.ToyProject.user.service.UserService;

@Service("ProductService")
public class ProductServiceImpl implements ProductService{

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="ProductDao")
	ProductDao productDao;
	

	@Override
	public List<Map<String, Object>> selectProductList() throws Exception {
		return productDao.selectProductList();
	}


	@Override
	public int insertProduct(Map<String, Object> param) throws Exception {
		int result=productDao.insertProduct(param);
		return result;
	}


}
