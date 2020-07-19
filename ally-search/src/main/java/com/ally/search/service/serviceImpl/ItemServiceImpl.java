package com.ally.search.service.serviceImpl;

import java.util.List;

import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ally.search.mapper.ItemMapper;
import com.ally.search.po.Item;
import com.ally.search.po.Msg;
import com.ally.search.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemMapper itemMapper;

	@Autowired
	SolrServer solrServer;
	
	@Override
	public Msg importAllItems() {
		// TODO Auto-generated method stub
		try {
			//��ѯ��Ʒ�б�
			List<Item> itemList = itemMapper.getItemList();
			//����Ʒ��Ϣд��������
			for (Item item : itemList) {
				//����һ��So¼��InputDocument����
				SolrInputDocument document = new SolrInputDocument();
				document.setField("id", item.getId());
				document.setField("product_name", item.getPro_name());
				document.setField("product_price", item.getPrice());
				document.setField("product_picture", item.getPicture());
				document.setField("product_sellpoint", item.getSell_point());
				System.out.println(item.getSell_point());
				document.setField("product_details", item.getDetails());
				document.setField("product_fCategoryid", item.getF_Categoryid());
				document.setField("product_sCategoryid", item.getS_Categoryid());
				document.setField("category_name", item.getCate_name());
				//д��������
				solrServer.add(document);
				
			}
			//�ύ����
			solrServer.commit();
			return Msg.success();
		}catch(Exception e) {
			e.printStackTrace();
			return Msg.flia();
		}
		
	}
	
	
}
