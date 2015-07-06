/**
 * 项目  dzah-hibernate 
 * 创建时间  2015-7-3 下午12:59:33 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package com.ch.wchhuangya.dzah.hibernate.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 * 类名: Event <br/> 
 * 功能: 事件实体类 <br/> 
 * 创建日期: 2015-7-3 下午12:59:33 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
@SuppressWarnings("rawtypes")
public class Event {
	private Long id;

    private String title;
    private Date date;
    private Set participants = new HashSet();

    public Event() {}

    public Long getId() {
        return id;
    }

    @SuppressWarnings("unused")
	private void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

	public Set getParticipants() {
		return participants;
	}

	public void setParticipants(Set participants) {
		this.participants = participants;
	}
}
