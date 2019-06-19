package cn.tedu.store.service;

import java.util.List;

import cn.tedu.store.entity.Cart;
import cn.tedu.store.service.ex.AccessDeniedException;
import cn.tedu.store.service.ex.CartNotFoundException;
import cn.tedu.store.service.ex.InsertException;
import cn.tedu.store.service.ex.UpdateException;
import cn.tedu.store.vo.CartVO;

/**
 * 处理购物车数据的业务层接口
 */
public interface ICartService {

	/**
	 * 将用户选中的商品添加到购物车
	 * @param username 当前登录的用户的用户名
	 * @param cart 购物车数据
	 * @throws InsertException 插入数据异常
	 * @throws UpdateException 更新数据异常
	 */
	void addToCart(String username, Cart cart) throws InsertException, UpdateException;
	/**
	 * 获取某用户的购物车数据列表
	 * @param uid 用户的id
	 * @return 用户的购物车数据列表
	 */
	List<CartVO> getByUid(Integer uid);
	/**
	 * 修改用户购物车数量(增)
	 * @param username
	 * @param uid
	 * @param cid
	 */
	void addNum(String username,Integer uid,Integer cid)throws CartNotFoundException,AccessDeniedException,UpdateException;
	
	/**
	 * 获取要结算的数据
	 * @param cid
	 * @return
	 */
	List<CartVO> getByCids(Integer[] cid);
}








