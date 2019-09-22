package removeduplicatesfromlist;

import java.util.ArrayList;
import java.util.List;

public class Listcreator {
	
	public  <T>List<T> removeDuplicates(List<T> list){
		
		List<T> newList = new ArrayList<>();
		for(T  item : list) {
			
			if(!newList.contains(item)) {
				newList.add(item);
			}
		}
		return newList;
	}

}
