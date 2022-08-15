package position.web.cty.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import position.web.cty.pojo.Companies;
/**
 * companies数据访问接口
 * @author Administrator
 *
 */
public interface CompaniesDao extends JpaRepository<Companies,Long>,JpaSpecificationExecutor<Companies>{
	
}
