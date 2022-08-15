package position.web.cty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import position.web.cty.pojo.Roles;
/**
 * roles数据访问接口
 * @author Administrator
 *
 */
public interface RolesDao extends JpaRepository<Roles,Long>,JpaSpecificationExecutor<Roles>{
	
}
