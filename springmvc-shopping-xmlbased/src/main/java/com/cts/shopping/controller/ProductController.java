package com.cts.shopping.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.shopping.model.Product;
import com.cts.shopping.service.ProductService;

@Controller
public class ProductController {
	
	public Logger logger=Logger.getLogger(ProductController.class.getName());
	
	
	@Autowired
	private ProductService productService;
	@Autowired
	private Product product;
	
	@RequestMapping("/")
	public String showIndexPage() {
		logger.info("=========showIndexPage() called=============="); 
		return "index";
	}
	
	@RequestMapping("/addproduct")// requestname
	public String showAddProductPage() {
		logger.info("=========showAddProductPage() called=============="); 
		return "add-product"; // view name
	}
	
	@RequestMapping(value="/addnewproduct",method=RequestMethod.POST)
	public String addNewProduct(@RequestParam("productid") int pid,@RequestParam("productname") String pname,@RequestParam("quantity") int quantity,@RequestParam("price") double price) {
		logger.info("=========addNewProduct() called=============="); 
		logger.info("=========Product ============="+pid + " "+pname+" "+ " " +quantity + " " + price);
		product.setPid(pid);
		product.setProductName(pname);
		product.setQuantity(quantity);
		product.setPrice(price);
		productService.addProduct(product);
		return "success";
	}
	
	@RequestMapping("/displayproduct")
	public ModelAndView showAllProduct() {
		logger.info("=========showAllProduct() called=============="); 
			List<Product> allproduct=productService.getProduct();
			ModelAndView modelAndView=new ModelAndView("view-product");
			modelAndView.addObject("productlist", allproduct);
			logger.info("=========product retrieved from table called=============="); 
			return modelAndView;
		
	}
}
