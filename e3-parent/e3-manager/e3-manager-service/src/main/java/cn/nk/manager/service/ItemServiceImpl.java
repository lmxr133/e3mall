package cn.nk.manager.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.nk.manager.mapper.TbItemMapper;
import cn.nk.manager.po.TbItem;

@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	private TbItemMapper itemMapper;
	
	@Override
	public TbItem queryItemById(Long itemId){
		
		if(itemId == null){
			return null;
		}
		return itemMapper.selectByPrimaryKey(itemId);
	}
}
