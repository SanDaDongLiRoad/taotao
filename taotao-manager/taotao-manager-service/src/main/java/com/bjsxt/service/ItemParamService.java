package com.bjsxt.service;

import com.bjsxt.common.pojo.TaotaoResult;
import com.bjsxt.pojo.TbItemParam;

public interface ItemParamService {

	TaotaoResult getItemParamByCid(long cid);
	TaotaoResult insertItemParam(TbItemParam itemParam);
}
