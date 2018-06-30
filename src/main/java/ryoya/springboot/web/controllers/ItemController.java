package ryoya.springboot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemController {
	
	/*
	 * 商品一覧リストを表示
	 */
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("items/list");
		return mav;
	}

}
