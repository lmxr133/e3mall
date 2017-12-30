package cn.nk.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.nk.manager.po.TbItem;
import cn.nk.manager.service.ItemService;

@RequestMapping("/item")
@Controller
public class ItemController {

	@Autowired
	private ItemService service;
	
	@RequestMapping("/test/{itemId}")
	@ResponseBody
	public TbItem queryItemById(@PathVariable Long itemId){
		
		return service.queryItemById(itemId);
	}
	
}
