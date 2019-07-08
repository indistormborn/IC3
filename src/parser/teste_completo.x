class B {    
    // inicializa variavel fora de qualquer metodo
    boolean falso = false;
    string frase = "frase";
    //usa qualificador
    public boolean verdadeiro = true;
    final string xxx = "acabouu";
    protected string yyy = "o";
    private string zzz = "trabalho";

    
    public string testaTudo(){
        if(falso){
            if(frase == "frase2"){
                frase = frase3;
            }
            if(falso && true){
                frase = "ver and";
            }
            if(a ^ b){
                frase = "ver xor";
            }
            if(!b == false){
                frase = "testa not";
            }
            if(a || b){
                frase = "testa or";
            }
        }
        return "asd";
    }

    //expressao logica com operador
    
}