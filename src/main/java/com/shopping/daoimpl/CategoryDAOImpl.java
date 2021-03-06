package com.shopping.daoimpl;

import com.shopping.dao.CategoryDAO;
import com.shopping.dto.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

    private static List<Category> categories = new ArrayList<>();

    static {
        Category category = new Category();
        category.setId(1);
        category.setName("Television");
        category.setDescription("Desc Television");
        category.setImageURL("cat_1.png");
        categories.add(category);

        category = new Category();
        category.setId(2);
        category.setName("Mobile");
        category.setDescription("Desc Mobile");
        category.setImageURL("cat_2.png");
        categories.add(category);

        category = new Category();
        category.setId(3);
        category.setName("Laptop");
        category.setDescription("Desc Laptop");
        category.setImageURL("cat_3.png");
        categories.add(category);
    }

    public List<Category> list() {
        return categories;
    }

    @Override
    public Category get(int id) {
        for (Category category: categories) {
            if (category.getId() == id){
                return category;
            }
        }
        return null;
    }
}
