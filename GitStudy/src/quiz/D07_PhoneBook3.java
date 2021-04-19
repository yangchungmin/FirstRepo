package quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class D07_PhoneBook3 {
/*
 HashMap�� �̿��� ��ȭ��ȣ�θ� �����غ�����
 1.�׷� /��ȭ��ȣ /�̸��� �����ؾ��Ѵ�
 2.�׷� �̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�
 3.��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű������ ������ �̸��� ���´�
 
 �����ؾ��� �޼��� 
 
 1.���ο� �׷��� �߰��ϴ� �޼��� 
 2.�����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���(�׷��� ���ٸ� �̺з� �׷쿡 ����)
 3.��ϵ� ��� ��ȭ��ȣ�� ������ �̸������� ������������ �����ִ� �޼���
 4.�̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ������ ��µǴ� �˻� �޼���
 5.��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �˻� �޼���
 */

static HashMap phoneBook = new HashMap();

public static void main(String[] args) {
	System.out.println("����Ʈ ���");
	addPhoneNo("ģ��","�̾ƹ���","010-1234-5678");
	addPhoneNo("ģ��","�Ǿƹ���","010-5678-9012");
	addPhoneNo("ģ��","�־ƹ���","010-9012-3456");
	addPhoneNo("ģ��","���ƹ���","010-3456-7890");
	addPhoneNo("����","�ƹ���","010-7890-1234");
	addPhoneNo("����","��Ӵ�","010-0123-4567");
	addPhoneNo("��Ÿ","���ý�","010-4567-8901");
	addPhoneNo("��Ÿ","�븮����","010-8901-2345");
	addPhoneNo("��Ÿ","�п�","010-2345-6789");
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