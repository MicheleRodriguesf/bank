package banco;

public class Usuario {
private String nome;
private int id;
private float saldo;
private String email;
private String telefone;
private String senha;


/*public Usuario (String user, int id, float saldo, String email, String telefone, String senha ) {
	this.nome = user;
	this.id = id;
	this.saldo = saldo;
	this.email = email;
	this.senha = senha;
	this.telefone = telefone;
	
}*/

public void setNome(String usuario_nome) {
	this.nome = usuario_nome;
}

public void setEmail (String email) { 
	this.email = email;
}

public void setSenha (String senha) {
	this.senha = senha;
}
public void setTelefone (String telefone) {
	this.telefone = telefone;
}
		
public void setId(int id) {
	this.id = id;
}
public String getNome () {
	return this.nome;
}
public int getId() {
	return this.id;
}
public float getSaldo () {
	return this.saldo;
}
public String getEmail () {
	return this.email;
}
public String getTelefone () {
	return this.telefone;
}
public String getSenha () {
	return this.senha;
}

  // atualiza valor do atributo

public void setSaldo (float saldo_novo) {
	this.saldo = saldo_novo;
}

public void setRecuperarSenha (String nova_senha) {
	if(nova_senha != this.senha) {
		this.senha = nova_senha;
}
	
}

public boolean transferir(Usuario destinatario, float valor_transferencia) {
	if (valor_transferencia > this.saldo ) {
		System.out.println("valor insuficiente");
		return false; 
		
	}

	this.saldo -= valor_transferencia;
	destinatario.saldo += valor_transferencia;
	

	return true;
	
}
}
