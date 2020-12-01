package com.evan.wj.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.evan.wj.pojo.Category;

@Service
public class CategoryService {
//    @Autowired
//    CategoryDAO categoryDAO;

    public List<Category> list() {
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        return null;
//        return categoryDAO.findAll(sort);
    }

    public Category get(int id) {
//        Category c= categoryDAO.findById(id).orElse(null);
        Category c= new Category();
        return c;
    }
}