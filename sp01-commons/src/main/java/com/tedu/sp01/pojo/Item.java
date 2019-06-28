package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

	//商品id,好的呢
	//商品的
	private Integer id;
	//商品的名称
	private String name;
	//商品的数量
	private Integer number;
}
