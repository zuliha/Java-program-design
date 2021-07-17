import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.stage.*;

public class p8 extends Application {
@Override
public void start(Stage primaryStage){
Button btnOK=new Button("OK");
Scene scene=new Scene(btnOK,200,250);
primaryStage.setTitle("MyJavaFX");
primaryStage.setScene(scene);
primaryStage.show();
}

    public static void main(String[] args) {
        Application.launch(args);
    }
}
