package com.shopping.dao;

import com.shopping.dto.Category;

import java.util.List;

public interface CategoryDAO {

    List<Category> list();
    Category get(int id);
}
