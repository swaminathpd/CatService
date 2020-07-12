package com.category.demo.CalegoryService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.category.demo.CalegoryService.Dao.CategoryServiceDao;
import com.category.demo.vo.CategoryVO;

@RestController
public class CategoryDetails {

	@Autowired(required=true)
	CategoryServiceDao categoryServiceDao;
	
 @RequestMapping("/category")
	public List<CategoryVO> getCategoryDetails(){
	 List<CategoryVO> categoryVOs = categoryServiceDao.getCategoryDetails();
	
		return categoryVOs;
	}
}
