import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;


public class Mensagem implements Serializable {
	

	public String getMessage() {
        String[] mensagem = {"TADS6", "Ola programador", "Sejam bem-vindos", "Boa Sorte"};
        String message =  mensagem[new Random().nextInt(4)];
            System.out.println(message);
            return message;

    }
	
}
 
