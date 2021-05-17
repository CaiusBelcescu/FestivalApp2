package Services;

import Exceptions.CouldNotWriteUsersException;
import Exceptions.UsernameAlreadyExistsException;
import Model.Festival_Type;
import Model.User;
import Services.FileSystemService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;

public class FestServices {

    public static List<Festival_Type> festivals;
    private static final Path USERS_PATH = FileSystemService.getPathToFile("config", "descriptions.json");

    public static void loadUsersFromFile() throws IOException {

        if (!Files.exists(USERS_PATH)) {
            FileUtils.copyURLToFile(UserService.class.getClassLoader().getResource("descriptions.json"), USERS_PATH.toFile());
        }

        ObjectMapper objectMapper = new ObjectMapper();

        festivals = objectMapper.readValue(USERS_PATH.toFile(), new TypeReference<List<Festival_Type>>() {
        });
    }

    public static void addUser(String name, String place, String prices,String description) throws UsernameAlreadyExistsException {
       // checkUserDoesNotAlreadyExist(name);
        festivals.add(new Festival_Type(name, place, prices,description));
        persistUsers();
    }

//    private static void checkUserDoesNotAlreadyExist(String name) throws UsernameAlreadyExistsException {
//        for (User user : festivals) {
//            if (Objects.equals(name, user.getUsername()))
//                throw new UsernameAlreadyExistsException(name);
//        }
//    }

    private static void persistUsers() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(USERS_PATH.toFile(), festivals);
        } catch (IOException e) {
            throw new CouldNotWriteUsersException();
        }
    }


    private static MessageDigest getMessageDigest() {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-512 does not exist!");
        }
        return md;
    }

}
