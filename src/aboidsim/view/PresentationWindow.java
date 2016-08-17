package aboidsim.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * class used to show information about the simulation.
 *
 */
class PresentationWindow {

    private static final int HEIGHT = 600;
    private static final int WIDTH = 800;

    /**
     * constructor of the class. it creates a new window with the explanation of
     * the program.
     *
     * @throws FileNotFoundException
     */
    PresentationWindow() {
        final Stage stage = new Stage();
        stage.setTitle("aBoidSim Description");
        stage.initModality(Modality.APPLICATION_MODAL);
        final StackPane layout = new StackPane();

        final VBox vbox = new VBox();
        vbox.setPadding(new Insets(10));

        final Label text = new Label();
        try {
            text.setText(this.readFromFile());
        } catch (final FileNotFoundException e1) {
            e1.printStackTrace();
        }
        final ScrollPane scrollPane = new ScrollPane(text);

        final Button confirm = new Button("Ok!");
        confirm.setOnAction(e -> stage.close());

        vbox.getChildren().addAll(scrollPane, confirm);
        vbox.setSpacing(10);
        vbox.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(vbox);
        layout.setId("presentation");

        final Scene scene = new Scene(layout, PresentationWindow.WIDTH, PresentationWindow.HEIGHT);
        scene.getStylesheets().add("style.css");
        stage.setScene(scene);
        stage.showAndWait();
    }

    /**
     *
     * @return the string representint the content of the text file in res
     * @throws FileNotFoundException
     */
    String readFromFile() throws FileNotFoundException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(
                this.getClass().getResourceAsStream("/description.txt"), Charset.forName("UTF-8")));
        final StringBuffer text = new StringBuffer();
        String line;
        try {
            while ((line = br.readLine()) != null) {
                text.append(line);
                text.append(System.getProperty("line.separator"));
            }
        } catch (final IOException e) {
            System.out.println("error in reading new line");
        }
        try {
            br.close();
        } catch (final IOException e) {
            System.out.println("error in closing buffered reader");
        }
        return text.toString();
    }

}
