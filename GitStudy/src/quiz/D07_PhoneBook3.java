package quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class D07_PhoneBook3 {
/*
 HashMap을 이용해 전화번호부를 구현해보세요
 1.그룹 /전화번호 /이름을 저장해야한다
 2.그룹 이름을 키값으로 넣으면 해당 그룹의 전화번호 목록이 나온다
 3.전화번호 목록에 전화번호를 키값으로 넣으면 이름이 나온다
 
 구현해야할 메서드 
 
 1.새로운 그룹을 추가하는 메서드 
 2.존재하는 그룹에 새로운 전화번호를 등록하는 메서드(그룹이 없다면 미분류 그룹에 저장)
 3.등록된 모든 전화번호부 정보를 이름순으로 내림차순으로 보여주는 메서드
 4.이름의 일부를 입력하면 일치하는 모든 정보가 출력되는 검색 메서드
 5.전화번호의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 검색 메서드
 */

static HashMap phoneBook = new HashMap();

public static void main(String[] args) {
	System.out.println("리스트 출력");
	addPhoneNo("친구","이아무개","010-1234-5678");
	addPhoneNo("친구","권아무개","010-5678-9012");
	addPhoneNo("친구","최아무개","010-9012-3456");
	addPhoneNo("친구","조아무개","010-3456-7890");
	addPhoneNo("가족","아버지","010-7890-1234");
	addPhoneNo("가족","어머니","010-0123-4567");
	addPhoneNo("기타","콜택시","010-4567-8901");
	addPhoneNo("기타","대리운전","010-8901-2345");
	addPhoneNo("기타","학원","010-2345-6789");
	printList();
}

static void addGroup(String groupName) {
	if(!phoneBook.containsKey(groupName)) {
		phoneBook.put(groupName, new HashMap());
		}
	}
static void addPhoneNo(String groupName,String name,String tel) {
	addGroup(groupName);
	HashMap group =(HashMap)phoneBook.get(groupName);
	group.put(tel, name);
}
static void printList() {
	Set set = phoneBook.entrySet();
	Iterator it = set.iterator();
	
	while(it.hasNext()) {
		Map.Entry e =(Map.Entry)it.next();
		Set subset =((HashMap)e.getValue()).entrySet();
		Iterator subit = subset.iterator();
		
		System.out.println(e.getKey());
		
		while(subit.hasNext()) {
			Map.Entry subE =(Map.Entry)subit.next();
			String telNo =(String)subE.getKey();
			String name = (String)subE.getValue();	
			System.out.println(name+""+telNo);
	}
	System.out.println();
  }
	
	
  }
}