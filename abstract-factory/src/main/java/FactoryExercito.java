public class FactoryExercito implements AbstractFactory{
    @Override
    public Treinamento createTraining() {
        return new TreinamentoExercito();
    }

    @Override
    public Uniforme createUniform() {
        return new UniformeExercito();
    }
}
