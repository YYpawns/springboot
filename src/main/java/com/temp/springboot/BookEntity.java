package com.temp.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @package: com.temp.springboot
 * @Description:
 * @Date: Created in  2018-01-10 10:43
 * @Author: yy
 */
@Component
@ConfigurationProperties(prefix = "book" )
@PropertySource(value = "classpath:book.properties")
public class BookEntity {
    private String name;
    private String author;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
