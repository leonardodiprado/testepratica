import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {

    @Test
    public void correctNameTest(){
        Pessoa pessoa = new Pessoa("Joao Silva", null);
        Assertions.assertTrue(pessoa.isValid());
    }

    @Test
    public void nameWithNumber(){
        Pessoa pessoa = new Pessoa("Joao Silva 2", null);
        Assertions.assertFalse(pessoa.isValid());
    }

    @Test
    public void nameWithSpecialCharacter(){
        Pessoa pessoa = new Pessoa("Joao Silva ##", null);
        Assertions.assertFalse(pessoa.isValid());
    }

    @Test
    public void blankName(){
        Pessoa pessoa = new Pessoa("", null);
        Assertions.assertFalse(pessoa.isValid());
    }

}
