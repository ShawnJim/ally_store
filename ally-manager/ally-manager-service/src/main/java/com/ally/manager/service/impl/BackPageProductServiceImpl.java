package com.ally.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.common.pojo.PageResult;
import com.ally.manager.mapper.my.MyTProductMapper;
import com.ally.manager.pojo.my.MyTProduct;
import com.ally.manager.service.BackPageProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class BackPageProductServiceImpl implements BackPageProductService{
	@Autowired
	private MyTProductMapper productMapper;//产品mapper
	@Override
	public PageResult getTProductList(Integer page, Integer rows) {
		PageHelper.startPage(page, rows);
			List<MyTProduct> list = productMapper.selectMyTProduct();
				//创建一个返回值对象
				PageResult result = new PageResult();
				result.setRows(list);
				//取记录总条数
				PageInfo<MyTProduct> pageInfo = new PageInfo<>(list);
				//总页数
				result.setTotal(pageInfo.getTotal());
				//当前页
				result.setPageNum(pageInfo.getPageNum());
				//总页数
				result.setPages(pageInfo.getPages());
				//下一页
				result.setNextPage(pageInfo.getNextPage());
				//前一页
				result.setPrePage(pageInfo.getPrePage());
				//第一页
				result.setFirstPage(pageInfo.getFirstPage());
				//最后一页
				result.setLastPage(pageInfo.getLastPage());
				
				return result;
	}

	@Override
	public List<MyTProduct> selectMyProduct(String productName) {
		return productMapper.selectMyProductProductName(productName);
	}

	@Override
	public int updateMyTProduct(MyTProduct myTProduct) {
		return productMapper.updateMyTProduct(myTProduct);
	}

	@Override
	public void deleteBatchMyProduct(List<String> ids) {
		productMapper.deleteBatchMyProduct(ids);
		
	}

	@Override
	public void deleteMyProduct(String id) {
		productMapper.deleteByPrimaryKey(id);
		
	}
}
