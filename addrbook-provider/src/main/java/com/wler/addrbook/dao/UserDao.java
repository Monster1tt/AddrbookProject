package com.wler.addrbook.dao;

import com.wler.addrbook.pojo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <b>用户功能数据持久层接口</b>
 * @author Monster
 * @version 5.0.0
 */
@Repository
public interface UserDao {
	/**
	 * <b>根据查询对象查询列表</b>
	 * @param query
	 * @return
	 * @throws Exception
	 */
	List<User> findListByQuery(User query) throws Exception;

	/**
	 * <b>保存对象信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int save(User entity)throws Exception;

	/**
	 * <b>修改对象信息</b>
	 * @param entity
	 * @return
	 * @throws Exception
	 */
	int update(User entity) throws Exception;

	int deleteById(Long id) throws Exception;
}
