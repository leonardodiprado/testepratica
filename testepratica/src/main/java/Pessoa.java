import org.apache.commons.lang3.StringUtils;

public class Pessoa {

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    private String nome;
    private String cpf;

    public boolean isValid() {
        if (StringUtils.isAlphaSpace(nome)) {

            return true;
        }
        return false;
    }
}