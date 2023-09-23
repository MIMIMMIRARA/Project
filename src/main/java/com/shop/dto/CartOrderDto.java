package com.shop.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.*;

@Getter @Setter
public class CartOrderDto {

    private Long cartItemId;

    private List<CartOrderDto> cartOrderDtoList;
}
