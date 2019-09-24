package com.tr.spring.tx.aopContext;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * 转账的DAO的实现类
 * @author jt
 *
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void outMoney(String from, Double money) {
		this.getJdbcTemplate().update("update account set money = money - ? where name = ?", money,from);
	}

	@Override
	public void inMoney(String to, Double money) {
		this.getJdbcTemplate().update("update account set money = money + ? where name = ?", money ,to);
	}
	public void outMoneyAop(String from, Double money) {
		this.getJdbcTemplate().update("update account set money = money - ? where name = ?", money,from);
	}

	public void inMoneyAop(String to, Double money) {
		this.getJdbcTemplate().update("update account set money = money + ? where name = ?", money ,to);
	}
}
