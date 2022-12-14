package sm.cop.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sm.cop.service.SalesManagementService;

@Controller
public class SalesManagementController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="salesManagementService")
	private SalesManagementService salesManagementService;
	
	@RequestMapping(value="/salesManagementService/openSalesManagementList.do")
	public ModelAndView openSalesManagementList(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/salesManagementService/smList");
		
		List<Map<String, Object>> list = salesManagementService.selectManagementList(commandMap);
		mv.addObject("list", list);
		
		return mv;
	}

}
