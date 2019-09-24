package com.tr.spring.tx.aopContext;
/**
 * 转账的DAO的接口
 * @author jt
 *
 */
public interface AccountDao {
	public void outMoney(String from, Double money);
	public void inMoney(String to, Double money);
}
