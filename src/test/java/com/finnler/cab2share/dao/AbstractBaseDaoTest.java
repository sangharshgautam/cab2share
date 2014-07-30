package com.finnler.cab2share.dao;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@TestExecutionListeners({ TransactionalTestExecutionListener.class })
@Transactional
@TransactionConfiguration(defaultRollback=true)
public class AbstractBaseDaoTest extends AbstractTransactionalTestNGSpringContextTests{

}
