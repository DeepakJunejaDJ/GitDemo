package snippet;


 class Snippet extends Base
{
	 @Override
	 public void show()
	 {
		 System.out.println("Child");
	 }

	public static void main(String[] args) {
		Base b = new Snippet();
		b.show();
	}
}
