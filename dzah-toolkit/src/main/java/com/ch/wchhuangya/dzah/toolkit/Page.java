/**
 * 项目  dzah-toolkit 
 * 创建时间  2015-7-2 下午3:51:47 
 * Copyright (c) 2015, wchhuangya All rights reserved.
 * wchhuangya 专有/保密源代码,未经许可禁止任何人通过任何* 渠道使用、修改源代码.
 */

package com.ch.wchhuangya.dzah.toolkit;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * 类名: Page <br/> 
 * 功能:  <br/> 
 * 创建日期: 2015-7-2 下午3:51:47 <br/> 
 *
 * @author wchya
 * @since Jdk 1.6
 * @see       
 *
 */
public class Page  implements Serializable {

	private static final long serialVersionUID = 1L;

	static private int DEFAULT_PAGE_SIZE = 15;

    /**
     * 每页的记录数
     */
    private int pageSize = DEFAULT_PAGE_SIZE;

    /**
     * 当前页第一条数据在List中的位置,从0开始
     */
    private int start;

    /**
     * 当前页中存放的记录,类型一般为List
     */
    private Object data;

    /**
     * 总记录数
     */
    private long totalCount;
    
    /**
     * 构造方法，只构造空页
     */
    @SuppressWarnings("rawtypes")
	public Page() {
        this(0, 0, DEFAULT_PAGE_SIZE, new ArrayList());
    }

    /**
     * 默认构造方法
     *
     * @param start     本页数据在数据库中的起始位置
     * @param totalSize 数据库中总记录条数
     * @param pageSize  本页容量
     * @param data      本页包含的数据
     */
    public Page(int start, long totalSize, int pageSize, Object data) {
        this.pageSize = pageSize;
        this.start = start;
        this.totalCount = totalSize;
        this.data = data;
    }

    /**
     * 取数据库中包含的总记录数
     */
    public long getTotalCount() {
        return this.totalCount;
    }

    /**
     * 取总页数
     */
    public long getTotalPageCount() {
        if (totalCount % pageSize == 0)
            return totalCount / pageSize;
        else
            return totalCount / pageSize + 1;
    }

    /**
     * 取每页数据容量
     */
    public int getPageSize() {
        return pageSize;
    }
    /**
     * 设置总页数据容量
     */
    public long setTotalPageCount(long totalCount) {
    	this.totalCount =  totalCount;
    	return totalCount;
    }

    /**
     * 当前页中的记录
     */
    public Object getResult() {
        return data;
    }

    /**
     * 取当前页码,页码从1开始
     */
    public int getCurrentPageNo() {
        return totalCount == 0 ? 0 : start / pageSize + 1;
    }

    /**
     * 是否有下一页
     */
    public boolean hasNextPage() {
        return this.getCurrentPageNo() < this.getTotalPageCount() - 1;
    }

    /**
     * 是否有上一页
     */
    public boolean hasPreviousPage() {
        return this.getCurrentPageNo() > 1;
    }

    /**
     * 获取任一页第一条数据的位置，每页条数使用默认值
     */
    protected static int getStartOfPage(int pageNo) {
        return getStartOfPage(pageNo, DEFAULT_PAGE_SIZE);
    }

    /**
     * 获取任一页第一条数据的位置,startIndex从0开始
     */
    public static int getStartOfPage(int pageNo, int pageSize) {
        return (pageNo - 1) * pageSize;
    }

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public long getFirstPage() {
		return totalCount > 0 ? 1 : 0;
	}

	public long getLastPage() {
		return getTotalPageCount();
	}

	public long getNextPage() {
		if (getTotalPageCount() == 0) return 0;
		
		long currPage = getCurrentPageNo();
		if (currPage > 0) {
			currPage++;
			if (currPage > getTotalPageCount())
				currPage = getTotalPageCount();
		}
		else currPage = 0;
		return currPage;
	}

	public long getPrevPage() {
		if (getTotalPageCount() == 0) return 0;
		
		long currPage = getCurrentPageNo();
		if (currPage > 0) {
			currPage = (currPage == 1 ? 1 : currPage - 1);
		}
		else currPage = 0;
		return currPage;
	}
}
