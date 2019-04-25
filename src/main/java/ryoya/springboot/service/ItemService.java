package ryoya.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ryoya.springboot.domain.Item;
import ryoya.springboot.mapperFile.ItemMapper;

@Transactional
@Service
public class ItemService {

	//ItemMapperをDIする
	@Autowired
	ItemMapper itemMapper;
	
	//スタート画面アクセス時の商品情報を取得
	public List<Item> findStartItems(){
		return itemMapper.findStartItems();
	}
	
}
