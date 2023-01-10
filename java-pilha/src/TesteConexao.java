
public class TesteConexao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(Conexao conex = new Conexao()){
			conex.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("deu erro ");
		}
		
		
//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("deu erro ");
//		} finally {
//			System.out.println("finally");
//			if (con != null) {
//				con.close();
//			}
//		}

	}

}
