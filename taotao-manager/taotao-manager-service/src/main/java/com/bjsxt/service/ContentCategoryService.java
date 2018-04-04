package com.bjsxt.service;

import java.util.List;

import com.bjsxt.common.pojo.EUTreeNode;
import com.bjsxt.common.pojo.TaotaoResult;

public interface ContentCategoryService {

	List<EUTreeNode> getCategoryList(long parentId);
	TaotaoResult insertContentCategory(long parentId, String name);
}
