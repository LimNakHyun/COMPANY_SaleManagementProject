package sm.cop.service;

import java.util.List;
import java.util.Map;

public interface SalesManagementService {

	List<Map<String, Object>> selectManagementList(Map<String, Object> map) throws Exception;

}
