import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SoldadoTest {
    @Test
    void deveRetornarDadosMarinha() {
        AbstractFactory factory = new FactoryMarinha();
        Soldado soldado = new Soldado(factory);
        assertEquals("Uniforme da Marinha", soldado.getUniforme());
        assertEquals("Treinamento da Marinha", soldado.getTreinamento());
    }

    @Test
    void deveRetornarDadosExercito() {
        AbstractFactory factory = new FactoryExercito();
        Soldado soldado = new Soldado(factory);
        assertEquals("Uniforme do Exército", soldado.getUniforme());
        assertEquals("Treinamento do Exército", soldado.getTreinamento());
    }

    @Test
    void deveRetornarDadosAeronautica() {
        AbstractFactory factory = new FactoryAeronautica();
        Soldado soldado = new Soldado(factory);
        assertEquals("Uniforme da Aeronáutica", soldado.getUniforme());
        assertEquals("Treinamento da Aeronáutica", soldado.getTreinamento());
    }
}