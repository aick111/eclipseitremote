/**
* @Title: BaseService.java
* @Package org.wqd.service
* @Description: TODO		描述该文件做什么
* @author wqdeng
* @date 2019年5月22日
* @version V1.0
*/
package org.wqd.service;

import java.util.List;
import java.util.Map;

/**
 * @Description: TODO 基础Service
 * @author wqdeng
 * @date 2019年5月22日 下午5:29:38
 *
 */
public interface BaseService<T> {
	/**
	 * 根据主键查询实体
	 *
	 * @param id 主键
	 * @return 实体
	 */
	T queryObject(Integer id);

	/**
	 * 分页查询
	 *
	 * @param map 参数
	 * @return list
	 */
	List<T> queryList(Map<String, Object> map);

	/**
	 * 分页统计总数
	 *
	 * @param map 参数
	 * @return 总数
	 */
	int queryTotal(Map<String, Object> map);

	/**
	 * 保存实体
	 *
	 * @param address 实体
	 * @return 保存条数
	 */
	int save(T t);

	/**
	 * 根据主键更新实体
	 *
	 * @param address 实体
	 * @return 更新条数
	 */
	int update(T t);

	/**
	 * 根据主键删除
	 *
	 * @param id
	 * @return 删除条数
	 */
	int delete(Integer id);

	/**
	 * 根据主键批量删除
	 *
	 * @param ids
	 * @return 删除条数
	 */
	int deleteBatch(Integer[] ids);

}
