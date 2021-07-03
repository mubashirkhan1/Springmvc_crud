package com.crud.Model;


	
	
	
	import java.util.HashSet;
	import java.util.Set;

	public class SetDuplicateEample {
		int id;
		String name;
		int age;
		public SetDuplicateEample(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}
		
		
	@Override
		public String toString() {
			return "SetEample [id=" + id + ", name=" + name + ", age=" + age + "]";
		}
	@Override
	public boolean equals(Object obj) {
		SetDuplicateEample set =(SetDuplicateEample) obj;
		if (this.name==set.name) {
			return true;
			
		}
		return false;

	}
	@Override
	public int hashCode() {
		return this.id;
	}


	public static void main(String[] args) {
		Set<SetDuplicateEample> l1 = new  HashSet<SetDuplicateEample>();
		l1.add(new SetDuplicateEample(1, "umarshaikh", 23));
		l1.add(new SetDuplicateEample(1, "umarshaikh", 27));
		System.out.println(l1.toString());
	}

		

	

}
