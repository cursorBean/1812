package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.Commodity;
import service.CommodityService;

@Controller
public class CommodityController {
	@Autowired
	CommodityService comService;
	@RequestMapping("list")
	public ModelAndView showList() {
		ModelAndView mv = new ModelAndView("list");
		List<Commodity> list= comService.searchAll();
		mv.addObject("list",list);
		return mv;
	}

}
