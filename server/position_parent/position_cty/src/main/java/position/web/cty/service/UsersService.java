package position.web.cty.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import util.IdWorker;

import position.web.cty.dao.UsersDao;
import position.web.cty.pojo.Users;

/**
 * users服务层
 * 
 * @author Administrator
 *
 */
@Service
public class UsersService {

	@Autowired
	private UsersDao usersDao;
	
	@Autowired
	private IdWorker idWorker;

	/**
	 * 查询全部列表
	 * @return
	 */
	public List<Users> findAll() {
		return usersDao.findAll();
	}

	
	/**
	 * 条件查询+分页
	 * @param whereMap
	 * @param page
	 * @param size
	 * @return
	 */
	public Page<Users> findSearch(Map whereMap, int page, int size) {
		Specification<Users> specification = createSpecification(whereMap);
		PageRequest pageRequest =  PageRequest.of(page-1, size);
		return usersDao.findAll(specification, pageRequest);
	}

	
	/**
	 * 条件查询
	 * @param whereMap
	 * @return
	 */
	public List<Users> findSearch(Map whereMap) {
		Specification<Users> specification = createSpecification(whereMap);
		return usersDao.findAll(specification);
	}

	/**
	 * 根据ID查询实体
	 * @param id
	 * @return
	 */
	public Users findById(Long id) {
		return usersDao.findById(id).get();
	}

	/**
	 * 增加
	 * @param users
	 */
	public void add(Users users) {
		// users.setId( idWorker.nextId()+"" ); 雪花分布式ID生成器
		usersDao.save(users);
	}

	/**
	 * 修改
	 * @param users
	 */
	public void update(Users users) {
		usersDao.save(users);
	}

	/**
	 * 删除
	 * @param id
	 */
	public void deleteById(Long id) {
		usersDao.deleteById(id);
	}

	/**
	 * 动态条件构建
	 * @param searchMap
	 * @return
	 */
	private Specification<Users> createSpecification(Map searchMap) {

		return new Specification<Users>() {

			@Override
			public Predicate toPredicate(Root<Users> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				List<Predicate> predicateList = new ArrayList<Predicate>();
				
				return cb.and( predicateList.toArray(new Predicate[predicateList.size()]));

			}
		};

	}

}
