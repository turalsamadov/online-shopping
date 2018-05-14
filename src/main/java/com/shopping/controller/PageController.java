package com.shopping.controller;

import com.shopping.dao.CategoryDAO;
import com.shopping.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

    @Autowired
    private CategoryDAO categoryDAO;

    @RequestMapping(value = {"/","/home","/index"})
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "Home");
        mv.addObject("categories", categoryDAO.list());
        mv.addObject("userClickHome", true);
        return mv;
    }

    @RequestMapping(value = "/about")
    public ModelAndView about(){
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "About Us");
        mv.addObject("userClickAbout", true);
        return mv;
    }

    @RequestMapping(value = "/contact")
    public ModelAndView contact(){
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "Contact Us");
        mv.addObject("userClickContact", true);
        return mv;
    }

    @RequestMapping(value = "/all/products")
    public ModelAndView allProducts(){
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("title", "All Products");
        mv.addObject("categories", categoryDAO.list());
        mv.addObject("userClickAllProducts", true);
        return mv;
    }

    @RequestMapping(value = "/category/{id}/products")
    public ModelAndView categoryProducts(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("page");
        Category category = null;
        category = categoryDAO.get(id);
        mv.addObject("title", category.getName());
        mv.addObject("categories", categoryDAO.list());
        mv.addObject("category", category);
        mv.addObject("userClickCategoryProducts", true);
        return mv;
    }
}
