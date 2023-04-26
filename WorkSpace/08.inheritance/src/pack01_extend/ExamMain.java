package pack01_extend;

public class ExamMain {
	public static void main(String[] args) {
		ParentClass p = new ParentClass();
		
		System.out.println(p.parent_field);
		p.parentMethod();
		
		ChildClass c = new ChildClass();
		System.out.println(c.child_field);
		c.childMethod();
		
		//상속 후
		System.out.println("Child: " + c.parent_field);
		
	}
}
