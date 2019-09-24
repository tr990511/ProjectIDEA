package com.tr.spring.tx;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
//继承JdbcDaoSupport类自动包含jdbcTemplate，只需传入dataSource
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
	@Override
	public void outMoney(String from, Double money) {
		this.getJdbcTemplate().update("update account set money = money - ? where name = ?", money,from);
	}
	@Override
	public void inMoney(String to, Double money) {
		this.getJdbcTemplate().update("update account set money = money + ? where name = ?", money ,to);
	}
}

