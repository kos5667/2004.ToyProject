package com.ToyProject.product.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ToyProject.product.service.ProductService;

@Controller
@RequestMapping("/product/*")
public class ProductController {

	//Field
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
		
	@Resource(name = "ProductService")
	ProductService productService;
	
	
	
	@RequestMapping(value="/selectProductList", method=RequestMethod.POST)
	public ModelAndView selectProductList(Model model) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		
		
		String URL ="";
		try {
			List<Map<String,Object>> productList=productService.selectProductList();
			System.out.println("========================================="+productList);
			URL = "/WEB-INF/jsp/product/selectProductList.jsp";
			model.addAttribute("productList", productList);
			modelAndView.setViewName(URL);
			modelAndView.addObject("productList", productList);
		} catch (NullPointerException e) {
			LOGGER.error("selectProductList NullPointerException : " + e.getMessage());
		} catch (IllegalArgumentException e) {
			LOGGER.error("selectProductList IllegalArgumentException : " + e.getMessage());
		} catch (Exception e) {
			LOGGER.error("selectProductList Exception : " + e.getMessage());
		}
		
		
		
		
		return modelAndView;
	}
	
	
	
}
