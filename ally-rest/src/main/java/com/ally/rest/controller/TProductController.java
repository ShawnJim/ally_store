package com.ally.rest.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ally.rest.po.AddProResult;
import com.ally.rest.po.Msg;
import com.ally.rest.po.TProduct;
import com.ally.rest.service.TProductService;
import com.ally.common.utils.IDUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ��Ʒ���ݿ��Ʋ���
 * @author Administrator
 *
 */
@Controller
public class TProductController {

	@Autowired
	TProductService tProductService;
	

	/**
	 * ¼����Ʒ�Ŀ��Ʋ㷽��
	 * @param product
	 * @param response
	 * @return
	 */
	@RequestMapping("/add_product")
	@ResponseBody
	public Msg addProduct(TProduct product,HttpServletResponse response)  {
		allowCrossDomain(response);
		//设置商品id
		long l = IDUtils.genItemId();
		String id = Long.toString(l);
		product.setId(id);
		//设置录入时间
		Date d = new Date();
		product.setShelftime(d);
		//添加商品sku
		long s = IDUtils.genItemId();
		String sku = Long.toString(s);
		product.setSku(sku);
		AddProResult addProResult;
		System.out.println(product);
		try {
			addProResult = tProductService.addProduct(product);
			return Msg.success().add("pro_id", id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia().add("successStr", "�����Ʒʧ��");
		}

	}

	/**
	 * ������Ʒ��ҳ���ݵĿ��Ʋ㷽��
	 * @param pn
	 * @param userid
	 * @param response
	 * @return
	 */
	@RequestMapping("/get_braProducts")
	@ResponseBody
	public Msg getBraProducts(@RequestParam(value="pn",defaultValue="1")Integer pn,@RequestParam(value="userid")Integer userid,HttpServletResponse response) {
		allowCrossDomain(response);
		//�ⲻ��һ����ҳ��ѯ
		//����PageHelper��ҳ���
		//�ڲ�ѯ֮ǰֻ��Ҫ���ã�����ҳ�룬�Լ�ÿҳ��С
		PageHelper.startPage(pn, 7);
		//startPage��������������ѯ����һ����ҳ��ѯ
		//��ȡ��Ʒ����
		List<TProduct> products = null;
		try {
			products = tProductService.getBraProducts(userid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Msg.flia().add("failStr","��ȡ����ʧ��");
		}
		//ʹ��pageInfo��װ��ѯ��Ľ����ֻ��Ҫ��pageInfo����ҳ�������
		//��װ����ϸ�ķ�ҳ��Ϣ�����������ǲ�ѯ����������,����������ʾ��ҳ��
		PageInfo page = new PageInfo(products,5);
		return Msg.success().add("pageInfo",page);
	}


	/**
	 * ����������Ʒ��ѯ���ݵĿ��Ʋ㷽��
	 * @param pn
	 * @param userid
	 * @param response
	 * @return
	 */
	@RequestMapping("/get_braConditionPros")
	@ResponseBody
	public Msg getBraConditionPros(@RequestParam(value="pn",defaultValue="1")Integer pn,
			@ModelAttribute("form")TProduct product,@RequestParam(value="startTime")String startTime,@RequestParam(value="endTime") String endTime,HttpServletResponse response) {
		allowCrossDomain(response);
		System.out.println(product);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		Date staDate = null;	 
		Date endDate = null;
		try {
			staDate = df.parse(startTime);

			endDate = df.parse(endTime);  
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
		//�ⲻ��һ����ҳ��ѯ
		//����PageHelper��ҳ���
		//�ڲ�ѯ֮ǰֻ��Ҫ���ã�����ҳ�룬�Լ�ÿҳ��С
		PageHelper.startPage(pn, 7);
		//startPage��������������ѯ����һ����ҳ��ѯ
		//��ȡ��Ʒ����
		List<TProduct> products = null;
		try {
			products = tProductService.getBraConditionPros(product.getUserid(),product,staDate,endDate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Msg.flia().add("failStr","��ȡ����ʧ��");
		}
		//ʹ��pageInfo��װ��ѯ��Ľ����ֻ��Ҫ��pageInfo����ҳ�������
		//��װ����ϸ�ķ�ҳ��Ϣ�����������ǲ�ѯ����������,����������ʾ��ҳ��
		PageInfo page = new PageInfo(products,5);
		return Msg.success().add("pageInfo",page);
	}


	/**
	 * 根据id删除商品
	 * @param proIds
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/dele_Pros/{proIds}",method=RequestMethod.GET)
	@ResponseBody
	public Msg deleteEmp(@PathVariable("proIds")String proIds,HttpServletResponse response) {
		allowCrossDomain(response);
		if(proIds.contains("-")) {
			List<String> list = new ArrayList<String>();
			String[] str_ids = proIds.split("-");
			for (String id : str_ids) {
				list.add(id);
			}
			try {
				tProductService.deleteEmp(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return Msg.flia().add("fliaStr", "删除失败");
			}
		}else {
			try {
				tProductService.deleteEmp(proIds);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return Msg.flia().add("fliaStr", "删除失败");
			}
		}
		return Msg.success().add("successStr", "删除成功");
	}

	/**
	 * ��֤id�Ƿ����
	 * @param products
	 * @param response
	 * @return
	 */
	@RequestMapping("/vali_id")
	@ResponseBody
	public Msg valiId(TProduct products,HttpServletResponse response) {
		allowCrossDomain(response);
		String id = products.getId();
		try {
			TProduct product = tProductService.getProduct(id);
			if (product!=null) 
				return Msg.success();
			else
				return Msg.flia();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}
	}


	/**
	 * ����id��ȡ��Ʒ����
	 * @param id
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/get_product/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getProduct(@PathVariable("id")String id,HttpServletResponse response) {
		allowCrossDomain(response);
		try {
			TProduct product = tProductService.getProduct(id);
			return Msg.success().add("product", product);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}		
	}

	@RequestMapping("update_product")
	@ResponseBody
	public Msg updateProduct(TProduct product,HttpServletResponse response) {
		allowCrossDomain(response);
		//����ʱ�䲢����
		Date d = new Date();
		product.setUpdateTime(d);
		System.out.println(product);
		try {
			tProductService.updateProduct(product);
			return Msg.success();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Msg.flia();
		}
		

	}


	public void allowCrossDomain(HttpServletResponse response) {
		//���ûش�����,�����������
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.setCharacterEncoding("utf-8");
	}

}
