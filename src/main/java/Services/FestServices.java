package Services;
//
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
////import Exceptions.CouldNotWriteAnnouncementException;
////import Model.Announcement;
//import org.apache.commons.io.FileUtils;
////import exceptions.CouldNotWriteUsersException;
////import exceptions.UsernameAlreadyExistsException;
////import model.User;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.util.List;
//import java.util.Objects;
//
//public class FestServices {
//
//    public static List<Announcement> announcements;
//    private static final Path ANNOUNCEMENTS_PATH = FileSystemService.getPathToFile("config", "announcement.json");
//
//    public static void loadAnnouncementsFromFile() throws IOException {
//
//        if (!Files.exists(ANNOUNCEMENTS_PATH)) {
//            FileUtils.copyURLToFile(services.AnnouncementService.class.getClassLoader().getResource("announcement.json"), ANNOUNCEMENTS_PATH.toFile());
//        }
//
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        announcements = objectMapper.readValue(ANNOUNCEMENTS_PATH.toFile(), new TypeReference<List<Announcement>>() {
//        });
//
//    }
//
//    public static void addAnnouncement(String b, String c, String e,String m,String hp, String yf, String d,String p,String email)  {
//
//        announcements.add(new Announcement(b, c, e,m,hp,yf,d,p,email));
//        persistAnnouncement();
//    }
//
//    private static void persistAnnouncement() {
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            objectMapper.writerWithDefaultPrettyPrinter().writeValue(ANNOUNCEMENTS_PATH.toFile(), announcements);
//        } catch (IOException e) {
//            throw new CouldNotWriteAnnouncementException();
//        }
//    }
//}