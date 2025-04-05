class bcs{
	public static void character(){
		System.out.println("I'll never be as moral as him");
		}
	}
class walter extends bcs{
	public static void teacher(){
		System.out.println("I am the cook");
		System.out.println("heisenberg");
		}
	}
class saul extends walter{
	public static void lawyer(){
		System.out.println("soy amigos");
		}
	}
class lalo extends saul{
	public static void meth(){
		System.out.println("The killer");
		}
	}
public class inheritance{
	public static void main(String args[]){
		lalo d = new lalo();
		d.lawyer();
		d.teacher();
		d.character();
		}
	}