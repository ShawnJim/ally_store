package com.ally.rest.po;

import java.util.List;

/**
 * 分类的扩展类
 * @author Administrator
 *
 */
public class TcategoryVO {

	private Integer id;

	private String name;

	private Integer cateCode;

	private Integer parentid;

	private Integer level;

	private Integer idparent;
	
	private List<TProduct> products;
	
	public TcategoryVO() {
		super();
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the cateCode
	 */
	public Integer getCateCode() {
		return cateCode;
	}

	/**
	 * @param cateCode the cateCode to set
	 */
	public void setCateCode(Integer cateCode) {
		this.cateCode = cateCode;
	}

	/**
	 * @return the parentid
	 */
	public Integer getParentid() {
		return parentid;
	}

	/**
	 * @param parentid the parentid to set
	 */
	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	/**
	 * @return the level
	 */
	public Integer getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(Integer level) {
		this.level = level;
	}

	/**
	 * @return the idparent
	 */
	public Integer getIdparent() {
		return idparent;
	}

	/**
	 * @param idparent the idparent to set
	 */
	public void setIdparent(Integer idparent) {
		this.idparent = idparent;
	}

	/**
	 * @return the products
	 */
	public List<TProduct> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<TProduct> products) {
		this.products = products;
	}
	
	
}
