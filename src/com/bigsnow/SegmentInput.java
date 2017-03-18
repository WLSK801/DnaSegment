package com.bigsnow;
/**
 * Struts的Action类，响应JSP页面
 * 
 * @author WLSK801
 * @version 2017.03.17
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mybatis.dao.SegmentDao;
import com.mybatis.entity.Segment;
import com.opensymphony.xwork2.ActionSupport;
public class SegmentInput extends ActionSupport {
	/**
	 * AJAX传回的String值
	 */
    private String dnaSeg;

	public String getDnaSeg() {
		
		return dnaSeg;
	}

	public void setDnaSeg(String dnaSeg) {
		this.dnaSeg = dnaSeg;
	}
	/**
     * 每次调用Action类都会自动调用这方法
     * 
     * @return SUCCESS或者ERROR
     */
	@Override  
    public String execute() throws Exception{
		// 创建Bean工厂
		ApplicationContext ctx=null;
        ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        // 用Bean创建Dao的POJO
        SegmentDao segmentDao = (SegmentDao) ctx.getBean("segmentDao");
        // 实体类Segment的对象
        Segment s01 = new Segment();
		s01.setSeg(this.getDnaSeg());
		// 通过Dao进行insert操作
        segmentDao.insertSeg(s01);
        System.out.println(dnaSeg);
//		DataConnection conn = new DataConnection();
//		conn.insertRow(s01);
//		System.out.println("Hello111");
//		System.out.println(dnaSeg);
        return SUCCESS;  
    }  
}
