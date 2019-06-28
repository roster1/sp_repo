package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	//商品id
	private Integer id;
	
	private String name;
	//商品的数量
	private Integer number;
}
