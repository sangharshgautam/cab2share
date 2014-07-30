package com.finnler.cab2share.dao;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;

@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@TransactionConfiguration(defaultRollback=true)
public class AbstractBaseDaoTest extends AbstractTransactionalTestNGSpringContextTests{

}
