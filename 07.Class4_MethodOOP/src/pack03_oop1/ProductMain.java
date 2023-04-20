package pack03_oop1;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		
//		Product pro = new Product();
//		
//		pro.num=1;
//		pro.name="컴퓨터";
//		pro.display();
//		
//		Product pro1 = new Product();
//		pro1.num=2;
//		pro1.name="노트북";
//		pro1.display();
		
		ProductDTO dto = new ProductDTO();
		dto.num=1;
		dto.name="컴퓨터";
		ProductDTO dto1 = new ProductDTO();
		dto1.num=2;
		dto1.name="노트북";
		ProductDAO dao = new ProductDAO();
		dao.display(dto);
		dao.display(dto1);

		
	}

}
