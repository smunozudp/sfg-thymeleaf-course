package com.beyondprogramming.controllers;

import com.beyondprogramming.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String getIndex(Model model){

        model.addAttribute("products", productService.listProducts());

        return "index";
    }

    /**
     * Method for the return of the secure.html
     * This html display information of the user that login previously
     *
     * @return secure.html template
     */
    @RequestMapping("secured")
    public String secured(){
        return "secured";
    }
}
