package com.example.lesson;

import com.example.lesson.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping("product-list")
    public String productList(Model model) {
        model.addAttribute("productList",productService.findAll());
        return "product-list";
    }
    @GetMapping("product/{id}")
    public String productById(@PathVariable("id") int id,Model model) {
        model.addAttribute("product",productService.findById(id));
        return "product";
    }

    @GetMapping("product-add")
    public String productAdd(Model model) {
        model.addAttribute("productList",productService.findAll());
        return "product-list";
    }
}
