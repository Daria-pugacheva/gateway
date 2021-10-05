package ru.gb.pugacheva.productservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin("http://localhost:3000")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public List<ProductDto> findAll(){
        return productService.findAll().stream().map(ProductDto::new).collect(Collectors.toList());
    }


    @GetMapping("/product/{id}")
    public ProductDto findById (@PathVariable Long id){
    return new ProductDto(productService.findByID(id).get());
    }

}
