
public class TestaLacos2 {
	
	
	public static void main(String[] args) {
		
		for (int linha = 0; linha < 5; linha++) {
			for (int coluna = 0; coluna <= linha; coluna++) {
				if (coluna > linha) {
					break;
				}
				System.out.print(coluna + 1);
			}
			System.out.println();
		}

		String[] palavra = new String[]{"a", "b", "c","d","e"};
		for (int i = 0; i < 4; i += 2) {
			System.out.println(palavra[i]);
		}
	}
	

}
