package banco;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
	
	Scanner input = new Scanner(System.in);

	ArrayList<Usuario> usuariosDoBanco = new ArrayList<Usuario>();

	for (int i = 0; i < 2; i++ ) {
		Usuario user = new Usuario ();
		System.out.println ("Digite seu nome: ");
		user.setNome(input.nextLine());
		
		System.out.println ("Digite seu telefone");
		user.setTelefone(input.nextLine());
		
		System.out.println ("Digite seu email:");
		user.setEmail(input.nextLine());

		System.out.println("Digite sua senha: ");
		user.setSenha(input.nextLine());
		
		user.setId(i);
		
		user.setSaldo(0);
		
		usuariosDoBanco.add(user);
	}
	
	for (int i = 0; i < usuariosDoBanco.size(); i++) {
	  usuariosDoBanco.get(i).setSaldo(100);
		
		
	}
	
	for (int i = 0; i < usuariosDoBanco.size(); i++) {
		System.out.println(usuariosDoBanco.get(i).getNome());
		System.out.println (usuariosDoBanco.get(i).getSaldo());
		
	}
			

	
	
	
	
	
	
	
		/*Scanner input = new Scanner(System.in);
		 ArrayList<String> cars = new ArrayList<String>();
		    /*cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");*/
		    
		 /*	for(int j = 0; j < 5; j++) {
		 		System.out.println("Digite a marca do carro: ");
		 		String marca = input.nextLine();
		 		cars.add(marca);
		 	}
		 
		 
		 	
		 	while(true) {
		 		System.out.println("Digite a marca do carro: ");
		 		String marca = input.nextLine();
		 		if(marca.equals("parar")) {
		 			break;
		 		}
		 		cars.add(marca);
		 		
		 	}
		 
		    for(int i = 0; i<cars.size(); i++) {
		    	System.out.println(cars.get(i));
		    }
		    
		    
		    /*int i = 0;
		    while(i < 10) {
		    	System.out.println(i);
		    	i++;
		    }*/
	
	
	
	
	
	
	
	
	/*user1.transferir (user2 , 30f);
	user1.transferir (user2 , 100f);
	
	System.out.println(user1.getSaldo());
	System.out.println(user2.getSaldo());
	*/
	
	
	}

}
