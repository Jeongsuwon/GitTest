package pack07_oop3;

public class ProductDAO {
	
	//getter로 불러오는게 아니고..
	public void display(ProductDTO dto) {
		
		System.out.print(dto.getNum() + ", ");
		System.out.print(dto.getName()+", ");
		System.out.print(dto.getPrice()+", ");
		System.out.println(dto.getCnt());
	}
	
	public void Array(ProductDTO[] dtoArr) {
		for(int i=0; i<dtoArr.length; i++) {
			System.out.print(dtoArr[i].getNum()+"번, ");
			System.out.print(dtoArr[i].getName()+", ");
			System.out.print(dtoArr[i].getPrice()+"원, ");
			System.out.println(dtoArr[i].getCnt()+"개");
		}
	}
	
}
