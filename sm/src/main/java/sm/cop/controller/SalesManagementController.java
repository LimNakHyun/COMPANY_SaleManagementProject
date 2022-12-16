package sm.cop.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sm.common.common.CommandMap;
import sm.cop.service.SalesManagementService;

@Controller
public class SalesManagementController {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="salesManagementService")
	private SalesManagementService salesManagementService;
	
	@RequestMapping(value="/salesManagementService/openSalesManagementList.do")
	public ModelAndView openSalesManagementList(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/salesManagementService/smList");
		
		List<Map<String, Object>> list = salesManagementService.selectManagementList(commandMap);
		mv.addObject("list", list);
		
		return mv;
	}
	
	@RequestMapping(value="/salesManagementService/openSalesManagementSumForm.do")
	public ModelAndView openSalesManagementSumForm(Map<String, Object> commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/salesManagementService/smSumForm");
		
		return mv;
	}
	
//	@RequestMapping(value="/salesManagementService/testMapArgumentResolver.do")
//	public ModelAndView testMapArgumentResolver(CommandMap commandMap) throws Exception {
//		ModelAndView mv = new ModelAndView("");
//		
//		if(commandMap.isEmpty() == false) {
//			Iterator<Entry<String, Object>> iterator = commandMap.getMap().entrySet().iterator();
//			Entry<String, Object> entry = null;
//			while(iterator.hasNext()) {
//				entry = iterator.next();
//				log.debug("key : " + entry.getKey() + " , value : " + entry.getValue());
//			}
//		}
//		
//		return mv;
//	}
	
	@RequestMapping(value="/salesManagementService/openSalesManagementBusinessAdd.do")
	public ModelAndView openSalesManagementBusinessAdd(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/salesManagementService/smBusinessAdd");
		
		return mv;
	}

}
