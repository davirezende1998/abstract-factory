public class FactoryAeronautica implements AbstractFactory{
    @Override
    public Treinamento createTraining() {
        return new TreinamentoAeronautica();
    }

    @Override
    public Uniforme createUniform() {
        return new UniformeAeronautica();
    }
}