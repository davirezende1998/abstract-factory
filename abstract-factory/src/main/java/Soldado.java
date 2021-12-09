public class Soldado {
    private Uniforme uniforme;
    private Treinamento treinamento;

    public Soldado (AbstractFactory factory){
        this.uniforme = factory.createUniform();
        this.treinamento = factory.createTraining();
    }

    public String getUniforme(){
        return this.uniforme.returnUniforme();
    }

    public String getTreinamento(){
        return this.treinamento.returnTreinamento();
    }
}