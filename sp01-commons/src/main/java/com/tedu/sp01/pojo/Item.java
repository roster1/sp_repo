package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	//��Ʒid,�õ���
	private Integer id;
	//��Ʒ������
	private String name;
	private Integer number;
}