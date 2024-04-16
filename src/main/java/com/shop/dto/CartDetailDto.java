package com.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@AllArgsConstructor
public class CartDetailDto {
    private Long cartItemId;
    private String itemNm;
    private int price;
    private int count;
    private String imgUrl;

}
