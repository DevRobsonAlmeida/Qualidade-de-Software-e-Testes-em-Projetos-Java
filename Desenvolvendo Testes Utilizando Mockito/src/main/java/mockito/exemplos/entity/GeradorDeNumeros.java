package mockito.exemplos.entity;

import lombok.NoArgsConstructor;

import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

@NoArgsConstructor
public class GeradorDeNumeros {

    private static SplittableRandom random = new SplittableRandom();

    public static List<Integer> geraNumerosAleatorios(int tamanhoList){
        return random.ints().boxed().limit(tamanhoList).toList();
    }

    public static List<Integer> geraNumerosAleatorios() {
        return random.ints().boxed().limit(random.nextInt(10)).toList();
    }


}
