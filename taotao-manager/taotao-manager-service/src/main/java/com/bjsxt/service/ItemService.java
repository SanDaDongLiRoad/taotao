package com.bjsxt.service;

import com.bjsxt.common.pojo.EUDataGridResult;
import com.bjsxt.common.pojo.TaotaoResult;
import com.bjsxt.pojo.TbItem;

public interface ItemService {

	TbItem getItemById(long itemId);
	EUDataGridResult getItemList(int page, int rows);
	TaotaoResult createItem(TbItem item, String desc, String itemParam) throws Exception;
}
