package com.mybatis.dao;
/**
 * 数据库访问对象
 * 
 * @author WLSK801
 * @version 2017.03.17
 */
import com.mybatis.entity.Segment;

public interface SegmentDao {
	/**
	 * 插入数据
	 * @param seg
	 */
	public void insertSeg(Segment seg);

}
