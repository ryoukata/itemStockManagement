package ryoya.springboot.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ryoya.springboot.domain.Item;
import ryoya.springboot.service.ItemService;

@Controller
public class ItemController {
	
	//ItemSeriviceクラスをDIする
	@Autowired
	ItemService itemService;

	/*
	 * 商品一覧リストを表示
	 */
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("items/list");
		List<Item> itemList = itemService.findStartItems();
		mav.addObject("itemList", itemList);
		System.out.println("mybatis is successfull !!");
		System.out.println(itemList.get(50));
		return mav;
	}

}
