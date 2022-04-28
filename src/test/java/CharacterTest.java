import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
    @Test
    void testClone() throws CloneNotSupportedException {
        Character character = new Character("A", new Hat("Red", "A", 1));

        Character characterClone = character.clone();
        characterClone.setAge(43);
        characterClone.setBody("B");
        characterClone.getHat().size(1);

//        assertEquals("Aluno{matricula=123, nome='Aluno Original', endereco=Endereco{logradouro='Rua A', numero=1}, localNascimento='Juiz de Fora'}", aluno.toString());
//        assertEquals("Aluno{matricula=456, nome='Aluno Clonado', endereco=Endereco{logradouro='Rua A', numero=2}, localNascimento='Juiz de Fora'}", alunoClone.toString());
    }
}