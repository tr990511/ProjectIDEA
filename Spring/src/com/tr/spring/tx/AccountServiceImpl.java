package com.tr.spring.tx;
import org.springframework.transaction.support.TransactionTemplate;
public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	private TransactionTemplate trsactionTemplate;// 注入事务管理的模板
	public void setTrsactionTemplate(TransactionTemplate trsactionTemplate) {
		this.trsactionTemplate = trsactionTemplate;
	}
	@Override
	public void transfer(final String from, final String to, final Double money) {
		accountDao.outMoney(from, money);
		//int d = 1/0;
		accountDao.inMoney(to, money);
	}
}
