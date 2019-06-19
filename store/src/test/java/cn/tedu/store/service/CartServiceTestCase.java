 package cn.tedu.store.service;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.Cart;
import cn.tedu.store.service.ex.ServiceException;
import cn.tedu.store.vo.CartVO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CartServiceTestCase {

	@Autowired
	public ICartService service;
	
	@Test
	public void addToCart() {
		try {
			String username = "ROOT";
			Cart cart = new Cart();
			cart.setUid(1);
			cart.setGid(2L);
			cart.setNum(3);
			service.addToCart(username, cart);
			System.err.println("OK.");
		} catch (ServiceException e) {
			System.err.println(e.getClass().getName());
			System.err.println(e.getMessage());
		}
	}
	@Test
	public void addNum(){
		try {
			
			Integer cid=8;
			Integer uid=2;
			String username="root";
			service.addNum(username, uid, cid);
		} catch (ServiceException e) {
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
		}
	}
	@Test
	public void getByCids(){
		Integer[] cid ={8,9,10,11};
		List<CartVO> result=service.getByCids(cid);
		for(CartVO res : result){
			System.err.println(res);
		}
	}
}






