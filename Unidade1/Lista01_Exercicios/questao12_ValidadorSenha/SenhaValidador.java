package Unidade1.Lista01_Exercicios.questao12_ValidadorSenha;

public class SenhaValidador{
    private String senha;

    // Construtor:
    public SenhaValidador(String senha){
        this.senha = senha;
    }

    public String getSenha(){
        return this.senha;
    }

    public boolean isSenhaForte(){
        if (getSenha().length() < 8){
            return false;
        }

        boolean isMaiusculo = false;
        boolean isNumero = false;

        for(int i = 0; i < getSenha().length(); i++){

            char guardaChar = getSenha().charAt(i);

            if (Character.isUpperCase(guardaChar)){
                isMaiusculo = true;
            }

            if (Character.isDigit(guardaChar)){
                isNumero = true;
            }

        }

        return isMaiusculo && isNumero;
    }

    public static void main (String[] Args){
        SenhaValidador minhaSenha = new SenhaValidador("123Senha");

        System.out.println("Minha senha é forte? " + minhaSenha.isSenhaForte());
    }
}
