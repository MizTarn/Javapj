class Student {
	private int id;
	public String name;
	public String address;

	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	// @Override
	public boolean equals(Student obj) {
		return this.id == ((Student) obj).id;
	}
}

public class Entry {
	public static void main(String[] args) {
		Student s1 = new Student(1000, "Viet", "Bac Ninh");
		Student s2 = new Student(1000, "Viet", "Bac Ninh");
		System.out.println(s1.equals(s2));
	}
}