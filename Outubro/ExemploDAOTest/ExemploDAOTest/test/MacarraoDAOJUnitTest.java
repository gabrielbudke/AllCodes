
import dao.MacarraoDAO;
import bean.Macarrao;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gabriel Budke (gabrielbudke@gmail.com)
 */
public class MacarraoDAOJUnitTest {

    @Test
    public void testarCadastro() {

        Macarrao nissin = new Macarrao();
        nissin.setMarca("Nissin");
        nissin.setPeso(100);
        nissin.setAldente(false);
        nissin.setTipo("Na hora");

        int identificador = new MacarraoDAO().cadastrar(nissin);
        assertNotSame(identificador, -1);

        Macarrao macarraoBuscado = new MacarraoDAO().obterPeloId(identificador);

        //verifica se o que foi guardadao em um objeto java
        //foi o que realmente foi armazenado no banco, ou seja,
        //consitir se as informações são iguais
        assertEquals(nissin.getMarca(), macarraoBuscado.getMarca());
        assertEquals(nissin.getPeso(), macarraoBuscado.getPeso(), 0);
        assertEquals(nissin.isAldente(), macarraoBuscado.isAldente());
        assertEquals(nissin.getTipo(), macarraoBuscado.getTipo());

    }

    @Test
    public void testarEdicao() {
        
        //Cria um novo objeto java
        Macarrao magali = new Macarrao();
        magali.setMarca("Magali");
        magali.setPeso(80);
        magali.setAldente(true);
        magali.setTipo("Da hora");

        //Adiciona o objeto no banco
        int indentificador = new MacarraoDAO().cadastrar(magali);
        magali.setId(indentificador);
        
        //Defini os novos atributos
        magali.setMarca("Monica");
        magali.setPeso(8001);
        magali.setAldente(false);
        magali.setTipo("Na hora");
        
        //Enviar para o banco as alterações
        boolean alterado = new MacarraoDAO().alterar(magali);
        assertTrue(alterado);

        //verifica se o que foi alterado em um objeto java
        //foi o que realmente foi armazenado no banco, ou seja,
        //consitir se as informações são iguais
        Macarrao macarraoBuscado = new MacarraoDAO().obterPeloId(indentificador);
   
        assertEquals(magali.getMarca(), macarraoBuscado.getMarca());
        assertEquals(magali.getPeso(), macarraoBuscado.getPeso(), 0);
        assertEquals(magali.isAldente(), macarraoBuscado.isAldente());
        assertEquals(magali.getTipo(), macarraoBuscado.getTipo());

    }
    
    @Test
    public void testarApagar(){
        Macarrao magali = new Macarrao();
        magali.setMarca("Magali");
        magali.setPeso(80);
        magali.setTipo("Da Hora");
        magali.setAldente(true);
        
        int identificador = new MacarraoDAO().cadastrar(magali);
        boolean excluido = new MacarraoDAO().apagar(identificador);
        assertTrue(excluido);
        Macarrao macarraoBuscado = new MacarraoDAO().obterPeloId(identificador);
        assertNull(macarraoBuscado);
        
    }
    

}
