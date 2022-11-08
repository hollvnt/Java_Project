package by.yaskovich.java_project.controller;

import by.yaskovich.java_project.models.Product;
import by.yaskovich.java_project.servieses.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String products(Model model){
        model.addAttribute("products", productService.listProducts());
        return "products";
    }
    @GetMapping("/product/{id}")
    public String productInfo (@PathVariable Long id, Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "product-info";
    }

    @PostMapping("/product/create")
    public String createProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/";
    }
    @PostMapping("/product/delete/{id}")
    public String deleteProduct (@PathVariable Long id){
        productService.deleteProduct(id);
        return "redirect:/";
    }

}
