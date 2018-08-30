package lambda.ParallelStream;


import concurrent.countdownlatch.User;
import concurrent.countdownlatch.Version;

import java.util.List;
import java.util.stream.Collectors;

public class DemoTask {


    public static List<User>  transfer(List<Version<User>> version){
        List<User> users = version.parallelStream()
                .map(Version::getData)
                .collect(Collectors.toList());
        return null;
    }

}
