package com.bjsxt.service;

import java.util.List;

import com.bjsxt.common.pojo.EUTreeNode;

public interface ItemCatService {

	List<EUTreeNode> getCatList(long parentId);
}
