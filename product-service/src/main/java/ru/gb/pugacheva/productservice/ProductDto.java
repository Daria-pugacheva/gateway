package ru.gb.pugacheva.productservice;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private String title;
    private int price;
    private String information;

    public ProductDto(Long id, String title, int price, String information) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.information = information;
    }

    public ProductDto(Product product) {
        this.id = product.getId();
        this.title = product.getTitle();
        this.price = product.getPrice();
        this.information = product.getInformation();
    }
}
