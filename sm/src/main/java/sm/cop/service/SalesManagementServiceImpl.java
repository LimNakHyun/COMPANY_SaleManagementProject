package sm.cop.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import sm.common.common.CommandMap;
import sm.cop.dao.SalesManagementDAO;

@Service("salesManagementService")
public class SalesManagementServiceImpl implements SalesManagementService {
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="salesManagementDAO")
	private SalesManagementDAO salesManagementDAO;

	@Override
	public List<Map<String, Object>> selectManagementList(CommandMap map) throws Exception {
		return salesManagementDAO.selectManagementList(map);
	}

}
