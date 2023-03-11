
package Login;

import java.util.ArrayList;
import java.util.List;

public class Usuarios2 {
    private List<Usuarios> usuarios;
    
    public Usuarios2(){
        usuarios= new ArrayList<>();
    }
    public int buscar(String usuario){
        int n=1;
        for(int i = 0; i< usuarios.size(); i ++){
            if( usuarios.get(i).getUsuario().equals(usuario)){
                n=i;
                break;
            }
        } return n;
    }
    public boolean insertar(Usuarios usuario){
    if(buscar(usuario.getUsuario())==-1){
        usuarios.add(usuario);
        return true;
    }else{ return false;
    
}}
    public boolean modificar(Usuarios usuario){
      if(buscar(usuario.getUsuario()) != -1){
        Usuarios usuarioA = obtener(usuario.getUsuario());
        usuarioA.setContraseña(usuario.getContraseña());
        
        return true;
    }else{ return false;  
      }}
    public boolean eliminar(String usuario){
          if(buscar(usuario)!= -1){
        usuarios.remove(buscar(usuario));
        return true;
    }else{ return false;  
      }
}
    public Usuarios obtener(String usuario){
        if(buscar(usuario)!=-1){
            return usuarios.get(buscar(usuario));
        }else{
            return null;
        }
    }
}