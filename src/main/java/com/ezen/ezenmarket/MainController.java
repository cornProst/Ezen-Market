package com.ezen.ezenmarket;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ezen.ezenmarket.product.dto.Post;
import com.ezen.ezenmarket.product.mapper.ProductMapper;

import lombok.extern.log4j.Log4j2;


@Log4j2
@Controller
public class MainController {
	
	
	
	@Autowired
	ProductMapper productMapper;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		
		List<Post> posts = productMapper.selectAllProducts();
		if(posts != null && posts.size() >= 15) {
			model.addAttribute("posts", posts.subList(0, 15));			
		}
		
		return "main"; 
	}
	
	
	
}