package position.web.cty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import position.web.cty.pojo.Users;
/**
 * users数据访问接口
 * @author Administrator
 *
 */
public interface UsersDao extends JpaRepository<Users,Long>,JpaSpecificationExecutor<Users>{
	
}
