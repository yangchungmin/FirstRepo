package quiz;

public class D07_phone {
private String name;
private String telnum;
private String group;

public D07_phone(String group,String name,String telnum) {
	super();
	this.group = group;
	this.name = name;
	this.telnum = telnum;
}
public String getGroup() {
	return group;
}
public String getName() {
	return name;
}
public String getTelnum() {
	return telnum;
}
public String toString() {
	return group + "/" + name + "/" + telnum ;
}

}
