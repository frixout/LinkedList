import java.nio.file.attribute.UserPrincipal;

public class IndexOutsideTheList extends Exception{
    IndexOutsideTheList(){
        super();
    }
    IndexOutsideTheList(String message){
        super(message);
    }
}
