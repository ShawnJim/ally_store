package com.ally.rest.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ally.rest.mapper.TCategoryMapper;
import com.ally.rest.po.CateNode;
import com.ally.rest.po.CateResult;
import com.ally.rest.po.FCategoryResult;
import com.ally.rest.po.TCategory;
import com.ally.rest.po.TCategoryExample;
import com.ally.rest.po.UploadResult;
import com.ally.rest.po.TCategoryExample.Criteria;
import com.ally.rest.service.TCategoryService;

@Service
public class TCategoryServiceImpl implements TCategoryService{

	@Autowired
	TCategoryMapper categoryMapper;

	/**
	 * ���ݲ�ѯ��Ʒ����
	 * 
	 */
	@Override
	public TCategory getCategory(int id) throws Exception {
		TCategory category = categoryMapper.selectByPrimaryKey(id);
		return category;
	}

	/**
	 * 
	 * ��ѯ������Ʒ����
	 */
	@Override
	public CateResult getItemCatList(){
		CateResult cateResult = new CateResult();
		//��ѯ��Ʒ�����б�
		cateResult.setDate(getcatList(0));
		return cateResult;
	}

	/**
	 * ʵ�ֲ�ѯ������Ʒ����
	 * @param parentId
	 * @return
	 */
	private List<?> getcatList(int parentId) {
		// TODO Auto-generated method stub
		//������ѯ����
		TCategoryExample tCategoryExample = new TCategoryExample();
		Criteria criteria = tCategoryExample.createCriteria();
		criteria.andParentidEqualTo(parentId);
		//ִ�в�ѯ
		List<TCategory> list = categoryMapper.selectByExample(tCategoryExample);
		//����ֵlist
		List resultList = new ArrayList<>();
		//��list��ӽڵ�
		for (TCategory tbItemCat : list) {
			//�ж��Ƿ�Ϊ���ڵ�
			if(tbItemCat.getParentid()==0) {
				CateNode cateNode = new CateNode();
				if(parentId==0) 
				cateNode.setName(tbItemCat.getName());
				cateNode.setUrl("/products/"+tbItemCat.getId()+".html");
				cateNode.setItem(getcatList(tbItemCat.getId()));
				resultList.add(cateNode);
			}else {
				CateNode cateNode = new CateNode();
				cateNode.setName("<a href='#' value='"+tbItemCat.getName()+"' class='scate_a'>"+tbItemCat.getName()+"</a>");
				cateNode.setUrl(tbItemCat.getId()+"");
				resultList.add(cateNode);
			}
		}
		return resultList;
	}

	/**
	 * 
	 * ��ѯ����һ����Ʒ����
	 */
	@Override
	public CateResult getItemFCatList() {
		// TODO Auto-generated method stub
		CateResult cateResult = new CateResult();
		//��ѯ��Ʒ�����б�
		cateResult.setDate(getFcatList(0));
		return cateResult;
	}

	/**
	 * ʵ�ֲ�ѯ��������
	 * @param parentId
	 * @return
	 */
	private List<?> getFcatList(int parentId) {
		// TODO Auto-generated method stub
		//������ѯ����
		TCategoryExample tCategoryExample = new TCategoryExample();
		Criteria criteria = tCategoryExample.createCriteria();
		criteria.andParentidEqualTo(parentId);
		//ִ�в�ѯ
		List<TCategory> list = categoryMapper.selectByExample(tCategoryExample);
		//����ֵlist
		List resultList = new ArrayList<>();
		//��list��ӽڵ�
		for (TCategory tbItemCat : list) {
			FCategoryResult categoryResult = new FCategoryResult();
			categoryResult.setId(tbItemCat.getId());
			categoryResult.setName(tbItemCat.getName());
			resultList.add(categoryResult);
		}
		return resultList;
	}

	/**
	 * 
	 * ��ѯ������������
	 */
	@Override
	public CateResult getItemSCatList(int parenId) {
		// TODO Auto-generated method stub
		CateResult cateResult = new CateResult();
		//��ѯ��Ʒ�����б�
		cateResult.setDate(getFcatList(parenId));
		return cateResult;
	}
}

