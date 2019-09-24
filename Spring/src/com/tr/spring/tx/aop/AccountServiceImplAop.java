package com.tr.spring.tx.aop;

import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账的业务层的实现类
 * @author jt
 *
 */
public class AccountServiceImplAop implements AccountService {

	// 注入DAO:
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	// 注入事务管理的模板
	private TransactionTemplate trsactionTemplate;

	public void setTrsactionTemplate(TransactionTemplate trsactionTemplate) {
		this.trsactionTemplate = trsactionTemplate;
	}

	@Override
	/**
	 * from：转出账号
	 * to：转入账号
	 * money：转账金额
	 */
	public void transfer(final String from, final String to, final Double money) {
		accountDao.outMoney(from, money);
		int d = 1/0;
		accountDao.inMoney(to, money);
	}

}
