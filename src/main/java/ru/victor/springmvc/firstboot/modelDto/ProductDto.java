package ru.victor.springmvc.firstboot.modelDto;

public class ProductDto{
    private String productName;
    private int productPrice;

    public static ProductDto offer(String productName,int productPrice){
        ProductDto productDto = new ProductDto();
        productDto.setProductName(productName);
        productDto.setProductPrice(productPrice);
        return productDto;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}