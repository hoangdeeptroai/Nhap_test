package ngay2;

public class demo {
	public static void main(String[] args) {
		Products pr1 = new Products("book", 12.5, 1.02);
		Products pr2 = new Products("pen", 3.6, 1.03);
		pr1.xuatThongTin();
		pr2.xuatThongTin();
	}
}
