package sm.cop.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import sm.common.dao.AbstractDAO;

@Repository("salesManagementDAO")
public class SalesManagementDAO extends AbstractDAO {

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectManagementList(Map<String, Object> map) {
		return (List<Map<String, Object>>) selectList("sm.selectManagementList", map);
	}

}
