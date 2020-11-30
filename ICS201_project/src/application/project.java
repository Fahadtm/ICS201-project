package application;

	
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;


public class project extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			ArrayList<Button> btImages=new ArrayList<Button>();
			for (int i = 0; i < 8; i++) {
				
				btImages.add(new Button("iamge"+(i+1)));
				
			}
			
			HBox hbox = new HBox();
			HBox hbox2 =new HBox();
			HBox hbutton=new HBox();
			HBox hbutton2=new HBox();
			for (int i = 0; i < 4; i++) {
				hbutton.getChildren().addAll(btImages.get(i));
			}
			for (int i = 4; i < 8; i++) {
				hbutton2.getChildren().addAll(btImages.get(i));
			}
			hbox2.getChildren().addAll(images());
			hbox.getChildren().addAll(images());
			hbox.setAlignment(Pos.CENTER);hbox2.setAlignment(Pos.CENTER);hbutton.setAlignment(Pos.CENTER);hbutton2.setAlignment(Pos.CENTER);
			VBox vbox = new VBox();
			vbox.getChildren().addAll(hbox2,hbox,hbutton,hbutton2);
			vbox.setAlignment(Pos.CENTER);
			GridPane p = new GridPane();
			p.getChildren().addAll(vbox);
			p.setAlignment(Pos.CENTER);
			
			
			
			
			BorderPane root = new BorderPane();
			//root.getChildren().add(p);
			root.setCenter(p);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	public ArrayList<ImageView> images() throws FileNotFoundException {
		ArrayList<ImageView> images= new ArrayList<ImageView>();
		
		images.add(new ImageView(new Image(new FileInputStream("C:\\Users\\Abdulrhman Khormi\\Desktop\\ics201\\i1.jpg"))));
		images.add(new ImageView(new Image(new FileInputStream("C:\\Users\\Abdulrhman Khormi\\Desktop\\ics201\\i2.jpg"))));
		images.add(new ImageView(new Image(new FileInputStream("C:\\Users\\Abdulrhman Khormi\\Desktop\\ics201\\i3.jpg"))));
		images.add(new ImageView(new Image(new FileInputStream("C:\\Users\\Abdulrhman Khormi\\Desktop\\ics201\\i4.jpg"))));
		for (int i = 3; i >= 0 ; i--) {
			images.get(i).setX(50);images.get(i).setY(50);images.get(i).setFitHeight(100);images.get(i).setFitWidth(100);
		}
		return images;
		
	}
}

