public class FactoryMarinha implements AbstractFactory{
    @Override
    public Treinamento createTraining() {
        return new TreinamentoMarinha();
    }

    @Override
    public Uniforme createUniform() {
        return new UniformeMarinha();
    }
}
