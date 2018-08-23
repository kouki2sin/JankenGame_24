package janken;

import javafx.application.Application;
import javafx.stage.Stage;

public class jankenView extends Application {

  @Override
 public void start(Stage stage) throws Exception {
   stage.setTitle("じゃんけんゲーム");
   stage.setWidth(450);
   stage.setHeight(300);

   stage.show();
 }

 public static void main(String[] args) {
  launch();
 }

}