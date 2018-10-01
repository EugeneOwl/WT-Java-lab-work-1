package fundamentals.task3;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * @author e.ivanov {@link 'https://github.com/EugeneOwl'}
 */
public class Task3 {
    public TreeMap<Double, Double> calculateFunction(
            final float a,
            final float b,
            final float h
    ) {
        final Double[] argumentsRange = Arrays.stream(getArgumentsRange(a, b, h))
                .boxed().toArray(Double[]::new);
        return new TreeMap<>(Stream.of(argumentsRange)
                .collect(Collectors.toMap(item -> item, Math::tan)));
    }

    private double[] getArgumentsRange(
            final float a,
            final float b,
            final float h
    ) {
        final long count = (long)Math.floor((b - a) / h + 1);
        if (count < 0) {
            throw new RuntimeException("Invalid parameters");
        }
        return DoubleStream.iterate(a, n -> n + h).limit(count).toArray();
    }
}
