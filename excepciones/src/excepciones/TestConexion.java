package excepciones;

public class TestConexion {
	public static void main(String[] args) throws Exception{
		try (Conexion con = new Conexion()){
			con.leerDatos();
		}catch (IllegalStateException ex ) {
			System.out.print("Ejecutando catch");
			ex.printStackTrace();
		}
	}

}
