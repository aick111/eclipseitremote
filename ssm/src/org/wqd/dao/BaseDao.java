/**
* @Title: BaseDao.java
* @Package org.wqd.dao
* @Description: TODO		描述该文件做什么
* @author wqdeng
* @date 2019年5月22日
* @version V1.0
*/
package org.wqd.dao;

import java.util.List;
import java.util.Map;

/**
 * @Description: TODO 基础Dao
 * @author wqdeng
 * @date 2019年5月22日 下午4:53:08
 *
 */
public interface BaseDao<T> {
	int save(T t);

	void save(Map<String, Object> map);

	void saveBatch(List<T> list);

	int update(T t);

	int update(Map<String, Object> map);

	int delete(Object id);

	int delete(Map<String, Object> map);

	int deleteBatch(Object[] id);

	T queryObject(Object id);

	T queryObjectByUserId(Object id);

	List<T> queryList(Map<String, Object> map);

	List<T> queryList(Object id);

	int queryTotal(Map<String, Object> map);

	int queryTotal();

}
