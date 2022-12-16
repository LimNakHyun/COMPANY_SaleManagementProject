package sm.cop.service;

import java.util.List;
import java.util.Map;

import sm.common.common.CommandMap;

public interface SalesManagementService {

	List<Map<String, Object>> selectManagementList(CommandMap map) throws Exception;

}
