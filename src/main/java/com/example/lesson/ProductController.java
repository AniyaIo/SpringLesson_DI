package com.example.lesson;

import com.example.lesson.form.AddForm;
import com.example.lesson.form.InputForm;
import com.example.lesson.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


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

    @GetMapping("/product-add") //product-add.htmlへ飛ぶ
    public String indexProductAdd(@ModelAttribute("addForm") AddForm addForm) {
        return "product-add";
    }
    @PostMapping("/product-add")
    public String productAdd(@Validated @ModelAttribute("addForm") AddForm addForm,
                             BindingResult errorResult) {
        if(errorResult.hasErrors()) {
            return "product-add";
        }
        productService.insert(
                new ProductRecord(
                        1,  //idの値は連番なので無視される
                        addForm.getName(),
                        Integer.parseInt(addForm.getPrice())));
        return "redirect:product-list";
    }

    @GetMapping("product/update/{id}")
    public String indexProductUpdate(@PathVariable("id") int id,
                                     Model model,
                                     @ModelAttribute("editForm") InputForm editForm) {
        model.addAttribute("product",productService.findById(id));
        return "update";
    }

    @PostMapping("product/update/{id}")
    public String productUpdate(@PathVariable("id") int id,
                                Model model,
                                @Validated @ModelAttribute("editForm") InputForm editForm,
                                BindingResult errorResult) {
        if(errorResult.hasErrors()) {
            model.addAttribute("product",productService.findById(id));
            return "update";
        }
        productService.update(
                new ProductRecord(
                        id,
                        editForm.getName(),
                        Integer.parseInt(editForm.getPrice())));
        return "redirect:/product-list";
    }

    @RequestMapping(value = "product/edit" , params = "update", method = RequestMethod.POST)
    public String productUpdate(@ModelAttribute("editForm") InputForm inputForm) {
        //productService.update(id);
        System.out.println("redirect:/product/update/"+inputForm.getId());
        return "redirect:/product/update/"+inputForm.getId();
    }

    @RequestMapping(value = "product/edit" , params = "delete", method = RequestMethod.POST)
    public String productDelete(@ModelAttribute("editForm") InputForm inputForm) {
        productService.delete(Integer.parseInt(inputForm.getId()));
        return "redirect:/product-list";
    }
}
