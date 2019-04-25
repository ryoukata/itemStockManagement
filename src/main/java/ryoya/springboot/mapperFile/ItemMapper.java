package ryoya.springboot.mapperFile;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ryoya.springboot.domain.Item;

@Mapper
public interface ItemMapper {

	//スタート画面アクセス時の商品情報取得SQLを呼び出す
	List<Item> findStartItems();
}
