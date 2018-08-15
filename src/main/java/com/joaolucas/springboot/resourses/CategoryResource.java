package com.joaolucas.springboot.resourses;

import com.joaolucas.springboot.domain.Category;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {

    @RequestMapping(method=RequestMethod.GET)
    public List<Category> listCategories(){

        Category cat1 = new Category(1, "Informática");
        Category cat2 = new Category(2, "Escritório");

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(cat1);
        categoryList.add(cat2);

        return categoryList;
    }

}
