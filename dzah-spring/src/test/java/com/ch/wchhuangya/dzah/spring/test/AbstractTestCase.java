/**
 * 项目  dzah-spring 
 * 创建时间  2015-7-14 上午11:33:39 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package com.ch.wchhuangya.dzah.spring.test;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;


/**
 * 类名: AbstractTestCase <br/> 
 * 功能: 单元测试的基类 <br/> 
 * 创建日期: 2015-7-14 上午11:33:39 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
@ContextConfiguration(locations = { "classpath*:applicationContext-spring.xml" })
//TransactionalTestExecutionListener类是在spring-web包中的
@TestExecutionListeners({TransactionalTestExecutionListener.class})
@Transactional
@TransactionConfiguration( defaultRollback = true )
@RunWith(SpringJUnit4ClassRunner.class)//可在test中识别注解的部分,SpringJUnit4ClassRunner类是在spring-web包中的
public abstract class AbstractTestCase extends AbstractJUnit4SpringContextTests {

    @Before
    public void init() throws Exception {

    }

    protected final Logger log = LoggerFactory.getLogger(getClass());
}