import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int f;

    public Filter(int f) {
        this.f = f;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result;
        logger.log("Start filtering");
        source.forEach(x -> {
            if (x < f) logger.log(String.format("The element \"%d\" does not pass", x));
            if (x >= f) logger.log(String.format("The element \"%d\" is passing", x));
        });
        result = source.stream()
                .filter(x -> x >= f)
                .collect(Collectors.toList());
        logger.log(String.format("Passed the filter %d elements from %d", result.size(), source.size()));
        logger.log("Display the result on the screen");
        return result;
    }
}