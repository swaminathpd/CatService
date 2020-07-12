package com.category.demo.CalegoryService.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.category.demo.vo.CategoryVO;

@Service
public class CategoryServiceDao {
	
	@Autowired(required=true)
	private JdbcTemplate jdbcTemplate;  
	
	public int saveCategory(CategoryVO categoryVO){  
	    String query="insert into Category values('"+categoryVO.getCatNo()+"','"+categoryVO.getCatName()+"')";  
	    return jdbcTemplate.update(query);  
	} 
	public int updateCategory(CategoryVO categoryVO){  
	    String query="update Category set catNamr='"+categoryVO.getCatName()+"' where catNo='"+categoryVO.getCatNo()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteCategory(CategoryVO categoryVO){  
	    String query="delete from Category where catNo='"+categoryVO.getCatNo()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	
	public List<CategoryVO> getCategoryDetails(){
		List<CategoryVO> categoryVOs = new ArrayList<CategoryVO>();
	 // SQL Operation #3 - SQL READ Operation
    String sqlSelectQuery = "SELECT catNo, catName  FROM Category";
    categoryVOs = jdbcTemplate.query(sqlSelectQuery, new RowMapper(){
    		public CategoryVO mapRow(ResultSet result, int rowNum) throws SQLException {
        	CategoryVO categoryVO = new CategoryVO();
        	categoryVO.setCatNo(result.getString("catNo"));
        	categoryVO.setCatName(result.getString("catName"));
            return categoryVO;
        }
    });
    return categoryVOs;
	}

}
