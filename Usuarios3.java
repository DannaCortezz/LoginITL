
package Login;

public class Usuarios3 {
    private static Usuarios2 usuario2 = new Usuarios2();
    
    public static boolean autentificar(String usuario, String contraseña){
        if(obtener(usuario)!= null){
            Usuarios usuarioConsulta = obtener(usuario);
            if(usuarioConsulta.getUsuario().equals(usuario)&& usuarioConsulta.getContraseña().equals(contraseña)){
               return true;
        }else{return false;
             }}
            else { return false;
            }}
    
    public static boolean  insertar(Usuarios usuario){
        return usuario2.insertar(usuario);
    }
        
    
    public static boolean modificar(Usuarios usuario){
        return usuario2.modificar(usuario);
}
    public static boolean eliminar(String usuario ){
        return usuario2.eliminar(usuario);
    }
    public static Usuarios obtener (String usuario){
        return usuario2.obtener(usuario);
}}