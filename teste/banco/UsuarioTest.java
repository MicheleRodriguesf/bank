package banco;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.hamcrest.CoreMatchers.*;


public class UsuarioTest {
	
	    // MONTAGEM DE CENARIO
	
	Usuario user1 = new Usuario ();	
	Usuario user2 = new Usuario ();
	
	@BeforeEach
	public void init() {
		user1.setNome("Lorena");
		user2.setNome("Yasmin");
		user1.setId (1);
		user2.setId (2);
		user1.setSaldo(100);
		user2.setSaldo(0);
		user1.setSenha("123");
		user2.setSenha("0");
		
	}

	@Test
	public void test_transferir () {  
	 
		// EXECUÇÃO
		
		user1.transferir(user2, 30f);
		
	   // VERIFICAÇÃO
	  
   assertThat (user1.getSaldo(), is (equalTo (70f)));
   assertThat (user2.getSaldo(), is (equalTo (30f)));
   
	  
	}
	@Test
	public void test_getId () {
		
		
	   // VERIFICAÇÃO
	  
  assertThat (user1.getId(), is (equalTo (1)));
  assertThat (user2.getId(), is (equalTo (2)));
	  
	}
	@Test
	public void test_setSaldo() {

	   // execução
	  
	user1.setSaldo(user1.getSaldo() + 30f);
	
	   //verificação
	  
  assertThat (user1.getSaldo(), is (equalTo (130f)));
  
	}
	@Test
	public void test_nova_senha_diferente_setRecuperarSenha() {
		
	user1.setRecuperarSenha ("456");
	
	assertThat (user1.getSenha(), is (equalTo("456")));
	
	}
	@Test
	public void test_senha_igual_setRecuperarSenha () {
		
	user1.setRecuperarSenha("123");
	
	assertThat (user1.getSenha(), is (equalTo ("123")));
	}
	
	
	
	
	
}
