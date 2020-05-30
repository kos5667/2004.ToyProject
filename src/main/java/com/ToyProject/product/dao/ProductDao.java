package com.ToyProject.product.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("ProductDao")
public class ProductDao {

	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="sqlSessionTemplate")
	private SqlSession sqlSession;
	
	
	public int insertProduct(Map<String, Object> param) throws Exception {
		LOGGER.debug("[UserDao] insertUser param = "+param);
		int result = 1;
		return result;
	}
	
	public List<Map<String, Object>> selectProductList() throws Exception {
		return sqlSession.selectList("ProductMapper.selectProductList");
	}
	
}
